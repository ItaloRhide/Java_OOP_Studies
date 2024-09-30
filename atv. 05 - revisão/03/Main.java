public class Main {
    public static void main(String[] args) {
        try {
            ContaBancaria conta1 = new ContaBancaria(500.0);
            ContaBancaria conta2 = new ContaBancaria(1000.0);

            System.out.println("Saldo da conta 1: " + conta1.getSaldo());
            System.out.println("Saldo da conta 2: " + conta2.getSaldo());

            try {
                System.out.println("\nSacando R$ 600.00 da conta 1\n");
                conta1.sacar(600.0);
            } catch (Exception e) {
                System.out.println("Erro ao sacar: " + e.getMessage());
            }

            try {
                System.out.println("\nTranferindo R$ 200.00 para conta 2\n");
                conta1.transferir(conta2, 200.0);
                System.out.println("Transferência realizada com sucesso\n");
            } catch (Exception e) {
                System.out.println("Erro na transferência: " + e.getMessage());
            }

            System.out.println("Saldo da conta 1 após transferência: " + conta1.getSaldo());
            System.out.println("Saldo da conta 2 após transferência: " + conta2.getSaldo());

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
