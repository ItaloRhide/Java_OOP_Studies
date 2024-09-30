public class Tempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tempo(){
        this(0, 0, 0);
    }

    public Tempo(int horaInput, int minutosInput, int segundosInput){
        this.horas = horaInput;
        this.minutos = minutosInput;
        this.segundos = segundosInput;
    }

    public int getHoras(){
        System.out.println(this.horas);
        return this.horas;
    }

    public int getMinutos(){
        System.out.println(this.minutos);
        return this.minutos;
    }

    public int getSegundos(){
        System.out.println(this.segundos);
        return this.segundos;
    }

    public void setHoras(int horasInput){
        this.horas = horasInput;
    }

    public void setMinutos(int minutosInput){
        this.minutos = minutosInput;
    }

    public void setSegundos(int segundosInput){
        this.segundos = segundosInput;
    }

    public void imprimirHorario(){
        System.out.println("Horário de " + this.horas + ":" + this.minutos + ":" + this.segundos);
    }

    public void subtrairTempo(Tempo outro) {
        int thisSegundosTotais = this.horas * 3600 + this.minutos * 60 + this.segundos;
        int outroSegundosTotais = outro.horas * 3600 + outro.minutos * 60 + outro.segundos;

        int resultadoSegundosTotais = thisSegundosTotais - outroSegundosTotais;

        if (resultadoSegundosTotais < 0) {
            resultadoSegundosTotais = 0;
        }

        this.horas = resultadoSegundosTotais / 3600;
        this.minutos = (resultadoSegundosTotais % 3600) / 60;
        this.segundos = resultadoSegundosTotais % 60;
    }

    public void somarTempo(Tempo outro) {
        int thisSegundosTotais = this.horas * 3600 + this.minutos * 60 + this.segundos;
        int outroSegundosTotais = outro.horas * 3600 + outro.minutos * 60 + outro.segundos;

        int resultadoSegundosTotais = thisSegundosTotais + outroSegundosTotais;

        if (resultadoSegundosTotais < 0) {
            resultadoSegundosTotais = 0;
        }

        this.horas = resultadoSegundosTotais / 3600;
        this.minutos = (resultadoSegundosTotais % 3600) / 60;
        this.segundos = resultadoSegundosTotais % 60;
    }

    public Tempo somarEretornar(Tempo outro) {
        Tempo resultado = new Tempo();

        int thisSegundosTotais = this.horas * 3600 + this.minutos * 60 + this.segundos;
        int outroSegundosTotais = outro.horas * 3600 + outro.minutos * 60 + outro.segundos;
        int resultadoSegundosTotais = thisSegundosTotais + outroSegundosTotais;

        resultado.horas = resultadoSegundosTotais / 3600;
        resultado.minutos = (resultadoSegundosTotais % 3600) / 60;
        resultado.segundos = resultadoSegundosTotais % 60;

        return resultado;
    }
}