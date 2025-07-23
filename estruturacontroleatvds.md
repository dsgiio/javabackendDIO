# Estruturas de Controle em Java

Exercícios 

1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
```java 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        scanner.close();
    }
}
```
2. Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
   - Se for menor ou igual a 18,5 "Abaixo do peso";
   - se for entre 18,6 e 24,9 "Peso ideal";
   - Se for entre 25,0 e 29,9 "Levemente acima do peso";
   - Se for entre 30,0 e 34,9 "Obesidade Grau I";
   - Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
   - Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Altura (ex: 1.75): ");
        double altura = scanner.nextDouble();
        System.out.print("Peso (ex: 70.5): ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc <= 18.5) System.out.println("Abaixo do peso");
        else if (imc <= 24.9) System.out.println("Peso ideal");
        else if (imc <= 29.9) System.out.println("Levemente acima do peso");
        else if (imc <= 34.9) System.out.println("Obesidade Grau I");
        else if (imc <= 39.9) System.out.println("Obesidade Grau II (Severa)");
        else System.out.println("Obesidade III (Mórbida)");

        scanner.close();
    }
}
```
3. Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;
```java
 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();
        int b;
        do {
            System.out.print("Digite o segundo número (maior que o primeiro): ");
            b = scanner.nextInt();
        } while (b <= a);

        System.out.print("Digite 1 para PAR ou 2 para ÍMPAR: ");
        int escolha = scanner.nextInt();
        boolean par = escolha == 1;

        for (int i = b; i >= a; i--) {
            if ((i % 2 == 0) == par) System.out.println(i);
        }

        scanner.close();
    }
}

```
4. Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de  0 na divisão, números menores que o primeiro número devem ser ignorados
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número:");
        var number = scanner.nextInt();
        var keepVerify = true;
        while(keepVerify){
            System.out.println("Informe o número para verificação:");
            var toVerify = scanner.nextInt();
            if (toVerify < number) {
                System.out.printf("Informe um número maior que %s.\n", number);
                continue;
            }
            var result = toVerify % number;
            keepVerify = result == 0;
            System.out.printf(" %s %% %s = %s\n", toVerify, number, result);
        }
    }
} 
``` 
