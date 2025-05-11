/* 1 - Pedir o peso em kg
   2 - Pedir altura em m
   3 - Calcular IMC => peso / (altura * altura)
   4 - Exibir classificação
    < 18.5 => Abaixo do peso
    >= 18.5 e <= 24.9 => Peso normal
    >= 25 e < 29.9 => Sobrepeso
    > 29.9 => Obesidade 
 */

package secao6_calcIMC;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        double IMC = peso / (altura * altura);

        if(IMC < 18.5) {
            System.out.println("Seu IMC é: " + IMC + ". Classificação: Magreza - Obesidade grau: 0");
        } else if(IMC >= 18.5 && IMC <= 24.99) {
            System.out.println("Seu IMC é: " + IMC + ". Classificação: Normal - Obesidade grau: 0");
        } else if(IMC >= 25 && IMC <= 29.99) {
            System.out.println("Seu IMC é: " + IMC + ". Classificação: Sobrepeso - Obesidade grau: I");
        } else if(IMC >= 30.0 && IMC <= 39.99){
            System.out.println("Seu IMC é: " + IMC + ". Classificação: Obesidade - Obesidade grau: II");
        } else {
            System.out.println("Seu IMC é: " + IMC + ". Classificação: Obesidade grave - Obesidade grau: III");
        }

        scanner.close();
    }
}
