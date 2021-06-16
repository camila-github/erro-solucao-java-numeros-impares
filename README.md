## Exercicio (Java): Numeros Impares

O exercicio publicado é referente ao treinamento do Bootcamp Java - Solucionando Problemas Básicos em Java 
(https://digitalinnovation.one)


#### Descrição do Desafio:

Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.


#### Entrada: 

O arquivo de entrada contém 1 valor inteiro qualquer.


#### Saída: 

Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
8 | 1
  | 3
  | 5
  | 7
 


#### Java　

```java
//SOLUCAO 1

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
```

