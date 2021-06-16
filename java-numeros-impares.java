import java.util.Scanner;

public class NumerosImpares {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroEntrada = entrada.nextInt();
        for (int i = 0; i <= numeroEntrada; i++) { 
          if (i % 2 == 1) { // Verifica se o numero é impar e atribui na lista correspondente
             System.out.println(i);
          } 
        }
    }
}