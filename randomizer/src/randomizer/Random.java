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
    
    
    public double[] getAleatorioMixto() {
        double res[] = new double[20];
        int parcial;
        int residuo = 0;
        for (int i = 0; i < 20; i++) {
            parcial = (semilla * multiplicador) + cteAditiva;
            residuo = parcial % modulo;
            res[i] = (double)residuo/modulo;
            semilla = residuo;
        }
        return res;
    }
    
    public float[] getAleatorioMultiplicativo()
    {
      /*  int aux = cteAditiva;
        cteAditiva = 0;
        double[] aleatorio = this.getAleatorioMixto();
        cteAditiva = aux;
        return aleatorio;*/
          float res[] = new float[20];
        int parcial;
        int residuo = 0;
        for (int i = 0; i < 20; i++) {
            parcial = (semilla * multiplicador);
            residuo = parcial % modulo;
            res[i] = (float)residuo/modulo;
            semilla = residuo;
        }
        return res;
     
        
    }
    
}
