
//Crie uma classe MoedaViciada, que simula um cara ou coroa. Seu programa deve ler
//qual é a opção do usuário (cara ou coroa), e simular a jogada da moeda. No entanto,
//a opção do usuário só deve ter 30% de chances de ocorrer. Deve haver um método
//para cada opção. Utilize a classe Random.
import java.util.Random;

public class MoedaViciada {

    public void jogarCara() {
        Random random = new Random();

        int randomInt = random.nextInt(101);
    
        //System.out.println(randomInt);

        if (randomInt > 70 && randomInt <= 100) {
            System.out.println("Você GANHOU! Caiu Cara.");
        } else {
            System.out.println("Você PERDEU! Caiu Coroa.");
        }
    }

    public void jogarCoroa() {
        Random random = new Random();

        int randomInt = random.nextInt(101);
    
        //System.out.println(randomInt);

        if (randomInt > 70 && randomInt <= 100) {
            System.out.println("Você GANHOU! Caiu Coroa.");
        } else {
            System.out.println("Você PERDEU! Caiu Cara.");
        }
    }
}
