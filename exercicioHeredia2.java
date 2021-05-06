


/*Escreva um algoritmo em Java que solicite ao usuário a entrada de 3 números. Considere que estes números são os lados de um triângulo.

Seu algoritmo deverá:

1. Indicar se "realmente" são lados de um triângulo

2. Se os lados compõem um triângulo, identifique qual sua classificação:

 -Equilátero
 -Isósceles
 -Escaleno

 Sua resposta deverá ser enviada através de um PULL REQUEST a este repositório.

Aluno: Gabriel Mattos Costa

*/

package heredia;

import java.util.Scanner;

public class exercicioHeredia2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double a, b, c;

        System.out.println("Digite o primeiro numero: ");
        a = leitor.nextDouble();

        System.out.println("Digite o segundo numero: ");
        b = leitor.nextDouble();

        System.out.println("Digite o terceiro numero: ");
        c = leitor.nextDouble();

        
        if (a==b || b==c || a==c){
         if(a==b && a==c){
            System.out.println("TRIANGULO EQUILATERO");
         }else{
            System.out.println("TRIANGULO ISOSCELES");
         }

        }else if(a + b > c){
            System.out.println("TRIANGULO ESCALENO");
        }
    }
}