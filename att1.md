
# 1. Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
```java
import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var baseYear = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        var name = scanner.next();
        System.out.println("Informe o seu ano de nascimento:");
        var year = scanner.nextInt();
        var age = baseYear - year;
        System.out.printf("Ola %s, voce tem %s anos\n", name, age);
    }
}
```
# 2. Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela - fórmula: área = lado × lado
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe o lado de um quadrado:");
        var lado = scanner.nextInt();
        var area = lado * lado;
        System.out.printf("A area do quadrado e: %d", area);
    }
}
```
# 3. Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela - fórmula: área = base × altura
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe a base do retangulo:");
        var base = scanner.nextInt();
        System.out.println("Informe a altura do retangulo:");
        var height = scanner.nextInt();
        var area = base * height;
        System.out.printf("A area do seu retangulo e: %d\n", area);
    }
}
````
# 4. Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o nome do participante 1:");
        var name1 = scanner.next();
        System.out.println("Informe a idade do participante 1:");
        var idade1 = scanner.nextInt();
        System.out.println("Informe o nome do participante 2:");
        var name2 = scanner.next();
        System.out.println("Informe a idade do participante 2:");
        var idade2 = scanner.nextInt();
        var diferenca = Math.abs(idade1 - idade2);
        System.out.printf("%s tem %d anos e %s tem %d anos, logo a dupla tem %d anos de diferença",
                          name1, idade1, name2, idade2, diferenca);
    }
}
