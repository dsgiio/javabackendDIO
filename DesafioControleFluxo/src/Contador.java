import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        var terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt(); 
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt(); 

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) { 
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close(); 
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("Parâmetros inválidos");
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
