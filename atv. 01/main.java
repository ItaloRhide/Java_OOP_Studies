package atv1;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número da conta: ");
        String titular = scanner.nextLine();
        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();
        conta conta = new conta(titular, saldoInicial);
        System.out.println("\nConta criada para " + conta.getNmrConta() + " com saldo de R$ " + conta.getSaldo());
        System.out.print("\nDigite o valor para depositar: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println("Novo saldo após depósito: R$ " + conta.getSaldo());
        System.out.print("\nDigite o valor para sacar: ");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);
        System.out.println("Novo saldo após saque: R$ " + conta.getSaldo());
        scanner.close();
    }
}
