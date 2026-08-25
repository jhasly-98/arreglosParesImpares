package githubnumparimpar;
import java.util.Scanner;
public class GitHubNumParImpar {
    public static void main(String[] args) {
        //modificado por Rodriguez Patrick
        // TODO code application logic here
        System.out.println("HOLA ATTE ROBERTOOOOOOO");
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
                contPar++;
            }else{
                if (contImpar == 5) {
                    System.out.println("YA TIENE 5 NUMEROS IMPARES");
                    continue;
                }
                contImpar++;
                        
            }
            cont++;
        }
        System.out.println("Prueba");
    }
    
}
