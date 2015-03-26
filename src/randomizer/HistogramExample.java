/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomizer;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;
import org.jfree.ui.Layer;
import org.jfree.ui.RectangleAnchor;
import org.jfree.ui.TextAnchor;

/**
 *
 * @author Nico
 */
public class HistogramExample {
    
    
    
public static void main(String[] args) {
double[] value = new double[100];

         int number = 10;
        HistogramDataset dataset = new HistogramDataset();
        dataset.setType(HistogramType.RELATIVE_FREQUENCY);
   
        for (int i = 1; i < 100; i++) {
            double num = (int) (Math.random() * 10);
            System.out.println("NUM "+num);
        value[i] = num;
        }
        
        dataset.addSeries("Histogram", value, number,0,10);
   

    String plotTitle = "Histogram";
    String xaxis = "number";
    String yaxis = "value";
    PlotOrientation orientation = PlotOrientation.VERTICAL;
    boolean show = false;
    boolean toolTips = false;
    boolean urls = false;
    JFreeChart chart = ChartFactory.createHistogram(plotTitle, xaxis, yaxis,
            dataset, orientation, show, toolTips, urls);
    int width = 500;
    int height = 300;
    
        IntervalMarker marker = new IntervalMarker(0.015,0.015);
        marker.setLabel("Esperado");
        marker.setLabelAnchor(RectangleAnchor.BOTTOM);
        marker.setLabelTextAnchor(TextAnchor.BOTTOM_CENTER);
        Font labelFont = new Font("Serif", Font.PLAIN, 12);
        marker.setLabelFont(labelFont);
       // target.setPaint(new Color(222, 222, 255, 128));
        marker.setOutlinePaint(new Color(255,0,0));
        XYPlot plot = (XYPlot) chart.getPlot();
        plot.addRangeMarker(marker, Layer.FOREGROUND);
    
    
    
    try {
        ChartUtilities.saveChartAsPNG(new File("histogram.PNG"), chart, width, height);
    } catch (IOException e) {
    }

 }
}

