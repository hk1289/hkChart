package com.app.hkchart;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.hk.charts.hkChartCreator.HkChartModel;
import com.hk.charts.hkChartCreator.HkChartView;
import com.hk.charts.hkChartCreator.HkSeriesElement;
import com.hk.charts.hkChartEnum.HkChartAnimationType;
import com.hk.charts.hkChartEnum.HkChartSymbolStyleType;
import com.hk.charts.hkChartEnum.HkChartType;
import com.hk.charts.hkChartEnum.HkChartZoomType;
import com.hk.charts.hkOptionsModel.HkDataElement;
import com.hk.charts.hkOptionsModel.HkOptions;
import com.hk.charts.hkOptionsModel.HkScrollablePlotArea;

public class MainActivity extends AppCompatActivity {

    private HkChartView hkChartView1;
    private HkChartModel hkChartModel;
    private HkOptions hkOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        hkChartView1 = findViewById(R.id.AAChartView1);

        HkChartModel hkChartModel = configureChartModel();
        if (hkOptions == null) {
            hkOptions = hkChartModel.hk_toHkOptions();
        }

        hkChartView1.hk_drawChartWithChartOptions(hkOptions);
    }

    private HkChartModel configureChartModel() {
        Intent intent = getIntent();
        String chartType = "line";
        int position = 6;

        HkChartModel hkChartModel = new HkChartModel()
                .chartType(chartType)
                .legendEnabled(false)
                .yAxisGridLineWidth(0f)
                .zoomType(HkChartZoomType.X)
                .scrollablePlotArea(
                        new HkScrollablePlotArea()
                                .minWidth(5000)
                                .scrollPositionX(1f)
                )
                .series(new HkSeriesElement[]{
                        new HkSeriesElement()
                                .name("Tokyo")
                                .data(configureSeriesDataArray())

                });
        this.hkChartModel = hkChartModel;

        configureTheStyleForDifferentTypeChart(chartType,position);
        return hkChartModel;
    }

    void configureTheStyleForDifferentTypeChart(String chartType,int position) {

            configureLineChartAndSplineChartStyle(chartType);


    }

    private void configureLineChartAndSplineChartStyle(String chartType) {
        hkChartModel
                .markerSymbolStyle(HkChartSymbolStyleType.BorderBlank)//设置折线连接点样式为:边缘白色
                .markerRadius(6f);
        if (chartType.equals(HkChartType.Line)) {
            HkSeriesElement element1 = new HkSeriesElement()
                    .name("Hestavollane")
                    .data(new HkSeriesElement[]{
                            new HkSeriesElement()
                                    .name("Tokyo")
                                    .data(configureSeriesDataArray())

                    });

            HkSeriesElement element2 = new HkSeriesElement()
                    .name("Vik")
                    .data(new Object[]{0, 0, 0.6, 0.9, 0.8, 0.2, 0, 0, 0, 0.1, 0.6, 0.7, 0.8, 0.6, 0.2,
                            0, 0.1, 0.3, 0.3, 0, 0.1, 0, 0, 0, 0.2, 0.1, 0, 0.3, 0, 0.1, 0.2,
                            0.1, 0.3, 0.3, 0, 3.1, 3.1, 2.5, 1.5, 1.9, 2.1, 1, 2.3, 1.9, 1.2,
                            0.7, 1.3, 0.4, 0.3});

            hkChartModel
                    .xAxisTickInterval(5)
                    .series(new HkSeriesElement[]{
                            new HkSeriesElement()
                                    .name("Tokyo")
                                    .data(configureSeriesDataArray())

                    });

        } else if (chartType.equals(HkChartType.Spline)) {
            HkSeriesElement element1 = new HkSeriesElement()
                    .name("Tokyo")
                    .lineWidth(7f)
                    .data(new Object[]{50, 320, 230, 370, 230, 400,});

            HkSeriesElement element2 = new HkSeriesElement()
                    .name("Berlin")
                    .lineWidth(7f)
                    .data(new Object[]{80, 390, 210, 340, 240, 350,});

            HkSeriesElement element3 = new HkSeriesElement()
                    .name("New York")
                    .lineWidth(7f)
                    .data(new Object[]{100, 370, 180, 280, 260, 300,});

            HkSeriesElement element4 = new HkSeriesElement()
                    .name("London")
                    .lineWidth(7f)
                    .data(new Object[]{130, 350, 160, 310, 250, 268,});

            hkChartModel
                    .animationType(HkChartAnimationType.SwingFromTo)
                    .series(new HkSeriesElement[]{element1, element2, element3, element4});

        }
    }

    private HkDataElement[] configureSeriesDataArray() {
        int maxRange = 388;
        HkDataElement[] numberArr1 = new HkDataElement[maxRange];

        double y1;
        int max = 38, min = 1;
        int random = (int) (Math.random() * (max - min) + min);
        for (int i = 0; i < maxRange; i++) {
            y1 = Math.sin(random * (i * Math.PI / 180)) + i * 2 * 0.01;
            HkDataElement hkDataElement = new HkDataElement()
                    .y((float) y1).x(i);

            numberArr1[i] = hkDataElement;
        }

        return numberArr1;
    }
}