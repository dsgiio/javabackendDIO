import java.util.Scanner;
import java.math.BigDecimal;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in); 
        System.out.println("Bem vindo ao Banco da Giovanna!");
        System.out.println("Informe o nome do cliente:");
        var nome = scanner.next();
        System.out.println("Informe o numero da agencia:");
        var agencia = scanner.next();
        System.out.println("Informe o numero da sua conta: ");
        var num = scanner.nextInt();
        System.out.println("Informe o seu saldo:");
        var saldo = scanner.nextBigDecimal();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, num, saldo);
    }
}
