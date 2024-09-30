package atv1;

public class conta {
    private String NmrConta;
    private double saldo;

    public conta(String NmrConta, double saldoInicial) {
        this.NmrConta = NmrConta;

        if (saldoInicial < 0) {
            this.saldo = 0;
            System.out.println("Erro: Saldo inicial não pode ser negativo. O saldo foi definido como 0.");
        } else {
            this.saldo = saldoInicial;
        }
    }
    public void depositar(double valor) {
        this.saldo += valor;
    }
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente para o saque.");
        }
    }

    // Getter para o NmrConta
    public String getNmrConta() { // Nome do método corrigido para refletir o atributo correto
        return NmrConta;
    }

    // Getter para o saldo
    public double getSaldo() {
        return saldo;
    }
}
