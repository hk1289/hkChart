
        var hkGlobalChart;

        function loadTheHighChartView (sender,receivedWidth, receivedHeight) {
            var HkOptions = JSON.parse(sender, function (key, value) {
            if (   typeof(value) == 'string'
                && value.indexOf('function') != -1) {
                  return eval(value)
                }
                return value;
                });

            if (HkOptions.xAxisArray) {
                HkOptions.xAxis = HkOptions.xAxisArray
                }

            if (HkOptions.yAxisArray) {
                HkOptions.yAxis = HkOptions.yAxisArray
                }

            if (HkOptions.defaultOptions) {
                Highcharts.setOptions({
                 lang: HkOptions.defaultOptions
                   });
                 }

            if (HkOptions.plotOptions) {
                configurePlotOptions(HkOptions);
                }

            hkGlobalChart = Highcharts.chart('container', HkOptions);
           //全局配置(可通过全局配置设置主题)https://api.hcharts.cn/highcharts#Highcharts.setOptions
        };

        function configurePlotOptions(HkOptions) {
                    var hkPlotOptions = HkOptions.plotOptions;
                    var animation = hkPlotOptions.series.animation;
                    if (animation) {//懒调用(只有在 HkChartModel 实例对象设置了 animationType 属性值的时候才会调用设置动画类型的函数,否则不调用)
                        var animationEasingType = animation.easing;
                        animation.easing = configureTheChartAnimationEasingType(animationEasingType);
                    }
                    // 添加鼠标事件
                    if (HkOptions.touchEventEnabled == true && hkPlotOptions.series) {
                        configureChartTouchEvent(hkPlotOptions);
                    }
                }

        function configureChartTouchEvent(hkPlotOptions) {
                    var mouseOverFunc = function(){
                        var message = {
                            name: this.series.name,
                            y :this.y,
                            x: this.x,
                            category: this.category ? this.category:"",
                            offset: {plotX:this.plotX,plotY:this.plotY},
                            index: this.index,
                        };

                        var messageStr = JSON.stringify(message);
                        window.androidObject.androidMethod(messageStr);
                    };

                    if (hkPlotOptions.series.point) {// set property directly for series point
                        hkPlotOptions.series.point.events.mouseOver = mouseOverFunc;
                    } else {// create a new series point object instance
                        var seriesPoint = {
                            events:{
                                mouseOver: mouseOverFunc,
                             }
                         };
                    hkPlotOptions.series.point = seriesPoint;
                    }
                }

        function onlyRefreshTheChartDataWithSeries(receivedSeries, animation) {
            var receivedSeriesArr = JSON.parse(receivedSeries);
            var seriesArrLength = receivedSeriesArr.length;
            for (var i = 0; i < seriesArrLength; i++) {
                var receivedSeriesElementData = receivedSeriesArr[i].data;
                // 获取series
                var seriesElement = hkGlobalChart.series[i];
                // 执行只刷新数据的函数
                seriesElement.setData(receivedSeriesElementData, false);
            }

            var animationBool = (animation == "true") ? true:false;
            hkGlobalChart.redraw(animationBool);
        }

        function updateChart(optionsStr, redraw) {
            var options = JSON.parse(optionsStr);
            hkGlobalChart.update(options,redraw);
        }

        function addPointToChartSeries(elementIndex, optionsStr, redraw, shift, animation) {
            var options = JSON.parse(optionsStr);
            var redrawBool = (redraw == "true") ? true:false;
            var shiftBool = (shift == "true") ? true:false;
            var animationBool = (animation == "true") ? true:false;

            var seriesElement = hkGlobalChart.series[elementIndex];
            seriesElement.addPoint(options, redrawBool, shiftBool, animationBool);
        }

        //pragma mark -- setter method
        function setTheChartViewContentWidth(receivedWidth) {
            var container = document.getElementById('container'); //获得元素
            container.style.width = receivedWidth; //设置宽度
            hkGlobalChart.reflow();
        }

        function setTheChartViewContentHeight(receivedHeight) {
            var container = document.getElementById('container'); //获得元素
            container.style.height = receivedHeight; //设置高度
            hkGlobalChart.reflow();
        }

        function setChartSeriesHidden(hidden) {
            for (var i = 0; i < hkGlobalChart.series.length; i++) {
                var seriesElement = hkGlobalChart.series[i];
                if (hidden == true) {
                    seriesElement.hide();
                } else {
                    seriesElement.show();
                }
            }
        }

        function showTheSeriesElementContentWithIndex(elementIndex) {
            var seriesElement = hkGlobalChart.series[elementIndex];
            seriesElement.show();
        }

        function hideTheSeriesElementContentWithIndex(elementIndex) {
            var seriesElement = hkGlobalChart.series[elementIndex];
            seriesElement.hide();
        }

        function addElementToChartSeriesWithElement(elementStr) {
            var seriesElement = JSON.parse(elementStr);
            hkGlobalChart.addSeries(seriesElement);
        }

        function removeElementFromChartSeriesWithElementIndex(elementIndex) {
            var seriesElement = hkGlobalChart.series[elementIndex];
            if (seriesElement) {
                seriesElement.remove(true);
            }
        }

        function evaluateTheJavaScriptStringFunction(jsStringFunction) {
            eval(jsStringFunction);
        }