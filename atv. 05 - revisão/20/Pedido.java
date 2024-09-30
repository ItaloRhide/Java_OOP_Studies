import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Prato> pratos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.pratos = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) throws PratoIndisponivelException {
        if (prato == null) {
            throw new PratoIndisponivelException("O prato solicitado está indisponível.");
        }
        pratos.add(prato);
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public double calcularTotal() {
        double total = 0;
        for (Prato prato : pratos) {
            total += prato.getPreco();
        }
        return total;
    }
}