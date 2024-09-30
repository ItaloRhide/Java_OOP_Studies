public class ContaBancaria {
    private double saldo;
    
    public ContaBancaria(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor) throws Exception{
        if (valor > saldo){
            throw new Exception("Saldo insuficiente");
        }
        saldo -= valor;
    }

    public double getSaldo(){
        return saldo;
    }

    public void transferir(ContaBancaria destino, double valor) throws Exception{
        if (valor > saldo){
            throw new Exception("Saldo insuficiente");
        }
        this.sacar(valor);
        destino.depositar(valor);
    }
}
