package githubnumparimpar;
import java.util.Scanner;
public class GitHubNumParImpar {
    public static void main(String[] args) {
        //modificado por Rodriguez Patrick
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
                if (contPar == 5) {
                    System.out.println("YA TIENE 5 NUMEROS PARES");
                    continue;
                }
                util.pares(pares, contPar, dato);
                contPar++;
            }else{
                if (contImpar == 5) {
                    System.out.println("YA TIENE 5 NUMEROS IMPARES");
                    continue;
                }
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
        System.out.println("HOLA AQUI MODIFICO MARIA ESTHELA");
    }
    
}
