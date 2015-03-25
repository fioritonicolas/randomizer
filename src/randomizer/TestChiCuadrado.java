/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomizer;

import java.util.ArrayList;
import java.util.LinkedList;


public class TestChiCuadrado 
{
    ArrayList numerosRandom;

    public TestChiCuadrado() {
        numerosRandom = new ArrayList();
    }

    public TestChiCuadrado(ArrayList numerosRandom) {
        this.numerosRandom = numerosRandom;
    }
    
    public int[] intervalos(int cantidadNumeros, int cantIntervalos)
    {
        float longIntervalo = (float)1/cantIntervalos;
        int vector[] = new int[cantIntervalos];
       
        for (int i = 0; i < cantidadNumeros; i++) 
        {
            double num = ((Math.random()));
            numerosRandom.add(num);
            float intervalo1 = (float) ((num/longIntervalo));
            int intervalo = (int)Math.floor(intervalo1);
            vector[intervalo] += 1;
        }
        return vector;
    }
    
    public int[] intervalosCongruencialMixto(int cantidadNumeros, int cantIntervalos, int semilla, int multiplicador, int cteAditiva, int modulo)
    {
        //aplicar metodo congruencial
        Random r = new Random (semilla, multiplicador,cteAditiva,modulo);
        double[] aux = r.getAleatorioMixto(cantidadNumeros);
        
        float longIntervalo = (float)1/cantIntervalos;
        int vector[] = new int[cantIntervalos];
       
        for (int i = 0; i < cantidadNumeros; i++) 
        {
            double num = aux[i];
            float intervalo1 = (float) ((num/longIntervalo));
            int intervalo = (int)Math.floor(intervalo1);
            vector[intervalo] += 1;
        }
        return vector;
    }
    
    public String toString()
    {
        String aux = "";
        
        aux += numerosRandom.toString();
        
        return aux;
    }
    
}