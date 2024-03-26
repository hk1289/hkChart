
package com.hk.charts.hkChartCreator;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.hk.charts.hkOptionsModel.HkOptions;
import com.hk.charts.hkTools.HkJSStringPurer;

import java.util.HashMap;
import java.util.Map;


public class HkChartView extends WebView {

    public interface HkChartViewCallBack {
        void chartViewDidFinishLoad(HkChartView hkChartView);
        void chartViewMoveOverEventMessage(
                HkChartView hkChartView,
                HkMoveOverEventMessageModel messageModel
        );
    }

    public Number contentWidth;
    public Number contentHeight;
    public Boolean chartSeriesHidden;
    public Boolean isClearBackgroundColor;
    public HkChartViewCallBack callBack;

    public void setContentWidth(Number contentWidth) {
        this.contentWidth = contentWidth;
        String jsStr = "setTheChartViewContentWidth('"
                + this.contentWidth + "')";
        safeEvaluateJavaScriptString(jsStr);
    }

    public void setContentHeight(Number contentHeight) {
        this.contentHeight = contentHeight;
        String jsStr = "setTheChartViewContentHeight('"
                + this.contentHeight + "')";
        safeEvaluateJavaScriptString(jsStr);
    }

    public void setChartSeriesHidden(Boolean chartSeriesHidden) {
        this.chartSeriesHidden = chartSeriesHidden;
        String jsStr = "setChartSeriesHidden('"
                + this.chartSeriesHidden + "')";
        safeEvaluateJavaScriptString(jsStr);
    }

    public void setIsClearBackgroundColor(Boolean isClearBackgroundColor) {
        this.isClearBackgroundColor = isClearBackgroundColor;
        if (this.isClearBackgroundColor) {
            this.setBackgroundColor(0);
            this.getBackground().setAlpha(0);
        } else {
            this.setBackgroundColor(1);
            this.getBackground().setAlpha(255);
        }

    }


    private String optionsJson;

    public HkChartView(
            Context context
    ) {
        super(context);
        setupBasicContent();
    }

    public HkChartView(
            Context context,
            AttributeSet attrs
    ) {
        super(context, attrs);
        setupBasicContent();
    }

    public HkChartView(
            Context context,
            AttributeSet attrs,
            int defStyleAttr
    ) {
        super(context, attrs, defStyleAttr);
        setupBasicContent();
    }

    private void setupBasicContent() {
        // Do some initialize work.
        this.contentWidth = 420f;
        this.contentHeight = 580f;
        this.isClearBackgroundColor = false;
        this.getSettings().setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            this.setWebContentsDebuggingEnabled(true);
        }
        //把当前对象作为androidObject别名传递给js
        //js通过window.androidObject.androidMethod()就可以直接调用安卓的androidMethod方法
        this.addJavascriptInterface(this, "androidObject");
    }


    //js调用安卓，必须加@JavascriptInterface注释的方法才可以被js调用
    @JavascriptInterface
    public String androidMethod(String message) {
        Gson gson = new Gson();
        Map<String, Object> messageBody = new HashMap<>();
        messageBody = gson.fromJson(message, messageBody.getClass());
        HkMoveOverEventMessageModel eventMessageModel = getEventMessageModel(messageBody);
        if (callBack != null) {
            callBack.chartViewMoveOverEventMessage(this,eventMessageModel);
        }
//       Log.i("androidMethod","++++++++++++++++显示总共调用了几次");
        return "";
    }


    public void hk_drawChartWithChartModel(final HkChartModel chartModel) {
        HkOptions HkOptions = chartModel.hk_toHkOptions();
        this.hk_drawChartWithChartOptions(HkOptions);
    }

    public void hk_refreshChartWithChartModel(HkChartModel chartModel) {
        HkOptions HkOptions = chartModel.hk_toHkOptions();
        this.hk_refreshChartWithChartOptions(HkOptions);
    }

    public void hk_drawChartWithChartOptions(final HkOptions chartOptions) {
        if (this.optionsJson != null) {
            this.hk_refreshChartWithChartOptions(chartOptions);
        } else {
            this.loadLocalFilesAndDrawChart(chartOptions);
            this.showJavaScriptAlertView();
        }
    }

    public void hk_refreshChartWithChartOptions(HkOptions chartOptions) {
        configureChartOptionsAndDrawChart(chartOptions);
    }


    public void hk_onlyRefreshTheChartDataWithChartOptionsSeriesArray(
            HkSeriesElement[] seriesElementsArr
    ) {
        hk_onlyRefreshTheChartDataWithChartOptionsSeriesArray(seriesElementsArr,true);
    }

    public void hk_onlyRefreshTheChartDataWithChartOptionsSeriesArray(
            HkSeriesElement[] seriesElementsArr,
            Boolean animation
    ) {
        String seriesArr = new Gson().toJson(seriesElementsArr);
        String javaScriptStr = "onlyRefreshTheChartDataWithSeries('"
                + seriesArr + "','" + animation + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }


    public  void hk_updateChartWithOptions(
            Object options,
            Boolean redraw
    ) {
        boolean isHkOptionsClass = options instanceof HkOptions;
        String finalOptionsMapStr;

        if (isHkOptionsClass) {
            String HkOptionsMapStr = new Gson().toJson(options);
            finalOptionsMapStr = HkOptionsMapStr;
        } else {
            String classNameStr = options.getClass().getSimpleName();
            classNameStr = classNameStr.replace("Hk","");

            //convert fist character to be lowercase string
            String firstChar = classNameStr.substring(0,1);
            String lowercaseFirstStr = firstChar.toLowerCase();
            classNameStr = classNameStr.substring(1);
            String finalClassName = lowercaseFirstStr + classNameStr;

            Map<String, Object> finalOptionsMap = new HashMap();
            finalOptionsMap.put(finalClassName,options);

            String optionsStr = new Gson().toJson(finalOptionsMap);
            finalOptionsMapStr = optionsStr;
        }

        String javaScriptStr = "updateChart('" + finalOptionsMapStr + "','" + redraw + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public void hk_addPointToChartSeriesElement(
            Integer elementIndex,
            Object options
    ) {
        hk_addPointToChartSeriesElement(
                elementIndex,
                options,
                true);
    }
    public void hk_addPointToChartSeriesElement(
            Integer elementIndex,
            Object options,
            Boolean shift
    ) {
        hk_addPointToChartSeriesElement(
                elementIndex,
                options,
                true,
                shift,
                true);
    }


    public void hk_addPointToChartSeriesElement(
            Integer elementIndex,
            Object options,
            Boolean redraw,
            Boolean shift,
            Boolean animation
    ) {
        String optionsStr;
        if (       options instanceof Integer
                || options instanceof Float
                || options instanceof Double) {
            optionsStr = String.valueOf(options);
        } else {
            optionsStr = new Gson().toJson(options);
        }

        String javaScriptStr = "addPointToChartSeries('"
                + elementIndex + "','"
                + optionsStr + "','"
                + redraw + "','"
                + shift + "','"
                + animation + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public void hk_showTheSeriesElementContent(Integer elementIndex) {
        String javaScriptStr = "showTheSeriesElementContentWithIndex('"
                + elementIndex + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public void hk_hideTheSeriesElementContent(Integer elementIndex) {
        String javaScriptStr = "hideTheSeriesElementContentWithIndex('"
                + elementIndex + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public void hk_addElementToChartSeries(HkSeriesElement hkSeriesElement) {
        String pureElementJsonStr = new Gson().toJson(hkSeriesElement);
        String javaScriptStr = "addElementToChartSeriesWithElement('"
                + pureElementJsonStr + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public void hk_removeElementFromChartSeries(Integer elementIndex) {
        String javaScriptStr = "removeElementFromChartSeriesWithElementIndex('"
                + elementIndex + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    public void hk_evaluateTheJavaScriptStringFunction(String jsFunctionStr) {
        String pureJSFunctionStr = HkJSStringPurer.pureJavaScriptFunctionString(jsFunctionStr);

        String jsFunctionNameStr = "evaluateTheJavaScriptStringFunction('"
                + pureJSFunctionStr + "')";
        safeEvaluateJavaScriptString(jsFunctionNameStr);
    }



    private void loadLocalFilesAndDrawChart(final HkOptions HkOptions) {
        this.loadUrl("file:///android_asset/HkChartView.html");
        this.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view,String url) {
//                Log.i("js files load","图表加载完成!!!!!!!! ");
                configureChartOptionsAndDrawChart(HkOptions);

                if (callBack != null) {
                    callBack.chartViewDidFinishLoad(HkChartView.this);
                }
            }
        });
    }

    private void configureChartOptionsAndDrawChart(HkOptions chartOptions) {
        if (isClearBackgroundColor) {
            chartOptions.chart.backgroundColor("rgba(0,0,0,0)");
        }

        Gson gson = new Gson();
        String HkOptionsJsonStr = gson.toJson(chartOptions);
        this.optionsJson = HkOptionsJsonStr;
        String javaScriptStr = "loadTheHighChartView('"
                + HkOptionsJsonStr + "','"
                + this.contentWidth + "','"
                + this.contentHeight + "')";
        this.safeEvaluateJavaScriptString(javaScriptStr);
    }

    private void showJavaScriptAlertView() {
        this.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onJsAlert(WebView view,
                                     String url,
                                     String message,
                                     final JsResult result) {
                super.onJsAlert(view, url, message, result);

                String urlStr = "url --->" + url + "\n\n\n";
                String messageStr = "message --->" + message + "\n\n\n";
                String resultStr = "result --->" + result;

                String alertMessageStr = urlStr + messageStr + resultStr;

                new AlertDialog.Builder(getContext())
                        .setTitle("JavaScript alert Information")//设置对话框标题
                        .setMessage(alertMessageStr)
                        .setNeutralButton("sure",null)
                        .show();

                return true;
            }
        });
    }

    private HkMoveOverEventMessageModel getEventMessageModel(Map<String, Object> messageBody) {
        HkMoveOverEventMessageModel eventMessageModel =  new HkMoveOverEventMessageModel();
        eventMessageModel.name = messageBody.get("name").toString();
        eventMessageModel.x = (Double) messageBody.get("x");
        eventMessageModel.y = (Double) messageBody.get("y");
        eventMessageModel.category = messageBody.get("category").toString();
        eventMessageModel.offset = (LinkedTreeMap) messageBody.get("offset");
        Double index = (Double) messageBody.get("index");
        eventMessageModel.index = index.intValue();
        return eventMessageModel;
    }


    private void safeEvaluateJavaScriptString(String javaScriptString) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            this.evaluateJavascript("javascript:"+javaScriptString, new ValueCallback<String>() {
                @Override
                public void onReceiveValue(String s) {
//                    Log.i("call back information","输出打印查看回调的结果"+s);
                }
            });
        } else {
            this.loadUrl("javascript:"+javaScriptString);
        }
    }




}
