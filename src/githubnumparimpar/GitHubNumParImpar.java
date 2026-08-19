/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubnumparimpar;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class GitHubNumParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        utilidades util =new utilidades();
        int [] pares=new int [5];
        int [] impares=new int [5];
        int dato=0;
        int cont=0;
        int contPar=0;
        int contImpar=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba 10 numeros positivos");
        System.out.println("====================");
        while(cont <10){
            System.out.println("Escriba el dato "+(cont+1)+ ": ");
            dato= leer.nextInt();
            if (dato == 0) {
                System.out.println("DEBE SER MAYOR A 0");
                continue;
            }
            if (dato % 2 ==0) {
                util.pares(pares, contPar, dato);
                contPar++;
            }else{
                util.impares(impares, contImpar, dato);
                contImpar++;
                        
            }
            cont++;
        }
        util.imprimir(pares);
        util.imprimir(impares);
        System.out.println("Valores mayores a 10 en pares son: "+util.contarMayDiez(pares));
        System.out.println("Valores mayores a 10 en impares son: "+util.contarMayDiez(impares));
        System.out.println("Valores menores a 5 en pares son: "+util.contarMenCinco(pares));
        System.out.println("Valores menores a 5 en impares son: "+util.contarMenCinco(impares));
    }
    
}
