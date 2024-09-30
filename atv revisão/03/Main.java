public class Main{
    public static void main(String[] args) throws Exception{
        ContaBancaria conta1 = new ContaBancaria(1000.0);
        ContaBancaria conta2 = new ContaBancaria(500.0);
        
        System.out.println("\nSaldo inicial");
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());

        System.out.println("\nDepósito (1000 e 500)");
        conta1.depositar(1000);
        conta2.depositar(500);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());

        System.out.println("\nSaque (500 e 200)");
        conta1.sacar(500);
        conta2.sacar(200);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());

        System.out.println("\nTransferência (conta1 -> conta2: 500)");
        conta1.transferir(conta2, 500);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        
        System.out.println("\nSaque inválido (conta 1: 10.000)");
        conta1.sacar(10000);
    }
}