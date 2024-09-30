//Crie uma classe Data que inclua três atributos: mês (inteiro), dia (inteiro) e ano
//(inteiro). Crie métodos para:
//a. Funcionar como getter e setter, validando os dados para garantir que os
//valores são reais;
//b. Funcionar como um construtor (com parâmetros padronizados) com três
//parâmetros para inicialização dos três atributos;
//c. Imprimir a data, com os campos separados por /;
//d. Calcular a quantidade de dias do ano até aquele mês, recebendo como
//parâmetro o número do mês;

//Sobrecarregue o método anterior para realizar o mesmo cálculo, porém, recebendo
//como parâmetro o nome do mês, em letras minúsculas.

import java.util.HashMap;
import java.util.Map;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Mapa para converter nomes de meses para números
    private static final Map<String, Integer> MES_NOME_PARA_NUMERO = new HashMap<>();

    static {
        MES_NOME_PARA_NUMERO.put("janeiro", 1);
        MES_NOME_PARA_NUMERO.put("fevereiro", 2);
        MES_NOME_PARA_NUMERO.put("março", 3);
        MES_NOME_PARA_NUMERO.put("abril", 4);
        MES_NOME_PARA_NUMERO.put("maio", 5);
        MES_NOME_PARA_NUMERO.put("junho", 6);
        MES_NOME_PARA_NUMERO.put("julho", 7);
        MES_NOME_PARA_NUMERO.put("agosto", 8);
        MES_NOME_PARA_NUMERO.put("setembro", 9);
        MES_NOME_PARA_NUMERO.put("outubro", 10);
        MES_NOME_PARA_NUMERO.put("novembro", 11);
        MES_NOME_PARA_NUMERO.put("dezembro", 12);
    }

    public void Data(int diaInput, int mesInput, int anoInput){
        if (diaInput > 0 && diaInput <= 31) {
            this.dia = diaInput;
        } else {
            System.out.println("Dia inválido");
        }

        if (mesInput <= 12 && mesInput > 0) {
            this.mes = mesInput;
        } else {
            System.out.println("Mês inválido");
        }

        if (anoInput > 0) {
            this.ano = anoInput;
        } else {
            System.out.println("Ano inválido");
        }
    }

    public int getDia(){
        System.out.println(dia);
        return this.dia;
    }

    public int getMes(){
        System.out.println(mes);
        return this.mes;
    }

    public int getAno(){
        System.out.println(ano);
        return this.ano;
    }

    public void setDia(int diaInput){
        if (diaInput > 0 && diaInput <= 31) {
            this.dia = diaInput;
        } else {
            System.out.println("Dia inválido");
        }
    }

    public void setMes(int mesInput){
        if (mesInput <= 12 && mesInput > 0) {
            this.mes = mesInput;
        } else {
            System.out.println("Mês inválido");
        }
    }

    public void setAno(int anoInput){
        if (anoInput > 0) {
            this.ano = anoInput;
        } else {
            System.out.println("Ano inválido");
        }
    }

    public void imprimirData(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }

    public static boolean anoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public int diasDoAno(int mes, int ano) {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diasTotais = 0;

        if (anoBissexto(ano)) {
            diasPorMes[1] = 29;
        }

        for (int i = 0; i < mes - 1; i++) {
            diasTotais += diasPorMes[i];
        }

        return diasTotais;
    }

    public int diasDoAno(String nomeMes, int ano) {
        Integer mesNumero = MES_NOME_PARA_NUMERO.get(nomeMes.toLowerCase());
        if (mesNumero == null) {
            System.out.println("Nome do mês inválido");
            return -1;
        }
        return diasDoAno(mesNumero, ano);
    }
}
