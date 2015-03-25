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
public class Random{

    private int semilla;
    private int multiplicador;
    private int cteAditiva;
    private int modulo;
 
    

    public Random(int semilla, int multiplicador, int cteAditiva, int modulo) {
        this.semilla = semilla;
        this.multiplicador = multiplicador;
        this.cteAditiva = cteAditiva;
        this.modulo = modulo;
    }
    
    public Random(int semilla, int multiplicador, int modulo) {
        this.semilla = semilla;
        this.multiplicador = multiplicador;
        this.cteAditiva = 0;
        this.modulo = modulo;
    }
    
    
    public double[] getAleatorioMixto(int cantNums) {
        double res[] = new double[cantNums];
        int parcial;
        int residuo = 0;
        for (int i = 0; i < cantNums; i++) {
          //  System.out.println(i+1);
            parcial = (semilla * multiplicador) + cteAditiva;
          //  System.out.println("parcial: " + parcial);
            residuo = parcial % modulo; 
            res[i] = (double)residuo/modulo;
            semilla = residuo;
           // System.out.println("semilla: " + semilla);
        }    
        
        return res;
    }
    
     public double getAleatorioMixtoUnitario() {
        double res;
        int parcial;
        int residuo = 0;
        parcial = (semilla * multiplicador) + cteAditiva;  
        System.out.println("parcialU: " + parcial);
        residuo = parcial % modulo;     
        res = (double)residuo/modulo;
        semilla = residuo;
         System.out.println("semillaU:" + semilla);
        return res;
     }    
        
       public double[] getAleatorioMultiplicativo()
    {
        int aux = cteAditiva;
        cteAditiva = 0;
        double[] aleatorio = this.getAleatorioMixto(20);
        cteAditiva = aux;
        return aleatorio;
   
    }
       
        public double getAleatorioMultiUnitario() {
        
            int aux = cteAditiva;
        cteAditiva = 0;
        double aleatorio = this.getAleatorioMixtoUnitario();
        cteAditiva = aux;
        return aleatorio;
     }    
    
        
    }
    
    
    
    
   
   
    

