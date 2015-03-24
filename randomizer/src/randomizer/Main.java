/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomizer;

/**
 *
 * @author Nico
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        Random r = new Random(4,5,7,8);
     //Random r = new Random(15,8,16,100);
        
        double[] aleatorioMixto = r.getAleatorioMixto();
       //float[] aleatorioMulti = r.getAleatorioMultiplicativo();
        
     for (int i = 0; i < aleatorioMixto.length; i++) {
         System.out.println(" LOS NUMERO ALEATORIOS MIXTOS: "+aleatorioMixto[i]*10000);
      }
        
        System.out.println("********");
        
      /*  for (int i = 0; i < aleatorioMulti.length; i++) {
         System.out.println(" LOS NUMERO ALEATORIOS MULTI: "+aleatorioMulti[i]*10000);
       }
        */
        
    }
    
}
