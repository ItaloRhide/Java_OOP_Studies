public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) throws Exception {
        if (valor > saldo) {
            throw new Exception("Saldo insuficiente");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void transferir(ContaBancaria destino, double valor) throws Exception {
        if (valor > saldo) {
            throw new Exception("Saldo insuficiente para transferência");
        }
        this.sacar(valor);
        destino.depositar(valor);
    }
}

/*
1- getsaldo:  saldo das contas só pode ser acessado através do método getSaldo(), demonstrando o encapsulamento, pois o atributo saldo está privado e não pode ser acessado diretamente.*/