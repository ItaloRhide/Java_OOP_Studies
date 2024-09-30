package teoria;
import java.util.ArrayList;

public class Main{
    static String finish = "finalizamos por aqui";
    public static void main(String[] args){
        System.out.println("Hello amerika");
        int idade = 44;
        int salario;
        var nome = "Lily";
        int count = 5;
        
        //tipos primitivos

        //números inteiros
        byte bi = 1;
        short sho = 22;
        int in = 100;
        long lon = 1000000000;

        //boleanos
        boolean boo = true;

        //caracteres
        char cha = 'A';
        String stri = "Hen"; //é uma classe

        //numeros nao inteiros
        float fla = 10.5f;
        double dou = 10.5;

        //condicionais
        if(idade > 22.60){
            System.out.println("maior");
        }
        else if(idade == 22.60){
            System.out.println("igual");
        }
        else{
            System.out.println("menor");
        }

        //Array
        int[] idades = {1, 2, 3, 4, 5};
        int[] numbers = new int[10];

        int tamanho = numbers.length;//tamanho do array

        //Arraylist
        final ArrayList<String> carros = new ArrayList<String>();
        carros.add("Toyota corolla");
        carros.add("Honda civic");
        carros.add("Fiat uno");
        carros.remove(1);
        carros.get(1);
        carros.size(); //tamanho do arraylist

        //loops
        for(var i = 0; i < count; i++){
            System.out.println("Ya");
        }

        int i = 0;
        while(i < count){
            i++;
            System.out.println("Ya");
        }

        //casting (trade de tipos)
        int idade1 = 22;
        double idade2 = idade1;
        idade1 = (int)idade2;// n funciona assim idade1 = idade2;

        char le = 'a';
        String letra = String.valueOf(le);
        le = letra.charAt(0);
        String numero = String.valueOf(idade1);
        idade1 = Integer.parseInt(numero);

        //polimorfismo
        Ser meuSerCachorro = new Cachorro("Robson", 22, "Koppler");
        meuSerCachorro.setNome("Robson");
        System.out.println(meuSerCachorro.saudacao());

        //finalizado
        System.out.println("\n\n" + finish);
    }
}
