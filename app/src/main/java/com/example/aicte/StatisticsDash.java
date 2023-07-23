package com.example.aicte;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class StatisticsDash extends AppCompatActivity {

        private PieChart pieChart;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


                pieChart = findViewById(R.id.activity_main_piechart);
                setupPieChart();
                loadPieChartData();
            }

            private void setupPieChart() {
                pieChart.setDrawHoleEnabled(true);
                pieChart.setUsePercentValues(false);
                pieChart.setEntryLabelTextSize(12);
                pieChart.setEntryLabelColor(Color.BLACK);
                pieChart.setCenterText("Placement");
                pieChart.setCenterTextSize(24);
                pieChart.getDescription().setEnabled(false);

                Legend l = pieChart.getLegend();
                l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
                l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
                l.setOrientation(Legend.LegendOrientation.VERTICAL);
                l.setDrawInside(false);
                l.setEnabled(false);
            }

            private void loadPieChartData() {
                ArrayList<PieEntry> entries = new ArrayList<>();
                entries.add(new PieEntry(3458194f, "2012-2013"));
                entries.add(new PieEntry(3724149, "2013-2014"));
                entries.add(new PieEntry(3961610f, "2014-2015"));
                entries.add(new PieEntry(3836421f, "2015-2016"));
                entries.add(new PieEntry(3703158f, "2017-2018"));
                entries.add(new PieEntry(3551957f, "2018-2019"));
                entries.add(new PieEntry(3392521f, "2019-2020"));
                entries.add(new PieEntry(3284835f, "2020-2021"));
                entries.add(new PieEntry(2975577f, "2021-2022"));
                entries.add(new PieEntry(3004199f, "2022-2023"));

                ArrayList<Integer> colors = new ArrayList<>();
                for (int color: ColorTemplate.VORDIPLOM_COLORS) {
                    colors.add(color);
                }

                for (int color: ColorTemplate.JOYFUL_COLORS) {
                    colors.add(color);
                }

                PieDataSet dataSet = new PieDataSet(entries, "_");
                dataSet.setColors(colors);

                PieData data = new PieData(dataSet);
                data.setDrawValues(true);
                data.setValueFormatter(new PercentFormatter(pieChart));
                data.setValueTextSize(16f);
                data.setValueTextColor(Color.BLACK);

                pieChart.setData(data);
                pieChart.invalidate();

                pieChart.animateY(1400, Easing.EaseInOutQuad);




        }
    }