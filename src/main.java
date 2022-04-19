import java.util.Scanner;
public class main {
    public static void main (String[] args){
        final int TAM = 10;
    Scanner t = new Scanner(System.in);
    int [] cadena = new int [TAM];
    System.out.println("Rellena el array con numeros enteros");
    for (int cont=0;cont<TAM;cont++){
        System.out.print("Numero de la posicion "+ (cont+1)+": ");
        cadena[cont] = t.nextInt();
    }



    int contador = 0;

    for (int cont=0;cont<TAM;cont++){
       for (int conta=0;conta<TAM;conta++){
           if (cadena[cont] == cadena[conta])
               contador++;

       }
       System.out.println(cadena[cont] +"-"+contador);
       contador = 0;
    }


    }
}
