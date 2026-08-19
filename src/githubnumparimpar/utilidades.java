/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubnumparimpar;

/**
 *
 * @author hp
 */
public class utilidades {
    //Imprime arreglos
    public void imprimir (int [] num){
        for (int i = 0; i < num.length; i++) {
            System.out.println("El valor "+(i+1)+"es: "+num[i]);
        }
    }
    //Arreglos pares e impares 
    public void pares (int [] par, int cont, int valor){
        par [cont] = valor;
    }
    
    public void impares (int [] par, int cont, int valor){
        par [cont] = valor;
    }
}
