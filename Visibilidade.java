public class Visibilidade {
    public String moto;
    //private int potencia;
    protected int potencia;

    private void valorCC (){
        this.potencia = 1000;
    }

    public int getPotencia (){
        this.valorCC();
        return this.potencia;
    }
}


class Motocycle{
    void Descricao(){
        Visibilidade descVisi = new Visibilidade();
        System.out.println(descVisi.moto);
        //System.out.println(descVisi.potencia); n funciona, por ser privado
        //System.out.println(descVisi.getPotencia()); pro private
        System.out.println(descVisi.potencia); //pro protected
    }
}