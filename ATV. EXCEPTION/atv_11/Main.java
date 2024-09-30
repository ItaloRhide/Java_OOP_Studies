public class Main {
    public static void main(String[] args) throws Exception {
        for (Semaforo sinal : Semaforo.values()) {
            System.out.printf("Sinal: %s, Duração: %d segundos\n", sinal, sinal.getDuracao());
        }
    }
}
