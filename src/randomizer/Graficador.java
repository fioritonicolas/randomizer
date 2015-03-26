/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomizer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Paint;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.Layer;
import org.jfree.ui.RectangleAnchor;
import org.jfree.ui.TextAnchor;

/**
 *
 * @author Nico
 */
public class Graficador {
  
    private IntervalXYDataset datosH;
    private JFreeChart grafica;
    private ChartPanel panel;
    
    public Graficador()
    {
       
        datosH = createDataset();
        
    
        
//        
//        grafica = ChartFactory.createBarChart("Visitas diarias",
//        "Días", "Visitas", datos,
//        PlotOrientation.VERTICAL, true, true, false);
        
        //ChartFactory.createHis
        grafica = ChartFactory.createHistogram("Grafico de Frecuencias",
        "Intervalos", "Frecuencias", datosH,
        PlotOrientation.VERTICAL, true, true, false);
        IntervalMarker marker = new IntervalMarker(20, 20);
        marker.setLabel("Esperado");
        marker.setLabelAnchor(RectangleAnchor.BOTTOM);
        marker.setLabelTextAnchor(TextAnchor.BOTTOM_CENTER);
        Font labelFont = new Font("Serif", Font.PLAIN, 12);
        marker.setLabelFont(labelFont);
       // target.setPaint(new Color(222, 222, 255, 128));
        marker.setOutlinePaint(new Color(255,0,0));
        XYPlot plot = (XYPlot) grafica.getPlot();
        plot.addRangeMarker(marker, Layer.FOREGROUND);
        
     //   plot.setBackgroundPaint(Color.CYAN);
       
//         final BarRenderer renderer = (BarRenderer) plot.getRenderer();
//          renderer.setSeriesPaint(0, Color.BLUE);
        
        panel = new ChartPanel(grafica);
    }



    public JFreeChart getGrafica() {
        return grafica;
    }

    public void setGrafica(JFreeChart Grafica) {
        this.grafica = Grafica;
    }

    public ChartPanel getPanel() {
        return panel;
    }

    public void setPanel(ChartPanel panel) {
        this.panel = panel;
    }
    
        private IntervalXYDataset createDataset() {
        final XYSeries series = new XYSeries("Observado");
        
        // primer valor: la marca de clase (punto medio de intervalos
        // segundo valor la frecuencia observada
        series.add(1, 32);
        series.add(2, 15);
        series.add(3, 10);
        series.add(4, 24);
        series.add(5, 19);
        

        
        final XYSeriesCollection dataset = new XYSeriesCollection(series);
//        dataset.addSeries(series2);
        return dataset;
    }
    
    
}
