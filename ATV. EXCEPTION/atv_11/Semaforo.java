public enum Semaforo {
    VERMELHO(30),
    AMARELO(5),
    VERDE(25);

    private int duracao;

    Semaforo(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }
}
