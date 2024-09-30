public class Main {
    public static void main(String[] args){
        Tempo t1 = new Tempo(01, 44, 00);
        Tempo t2 = new Tempo(02, 24, 00);

        Tempo t3 = t1.somarEretornar(t2);
        t3.imprimirHorario();  

        t3.subtrairTempo(t2);
        t3.imprimirHorario();  
    }
}
