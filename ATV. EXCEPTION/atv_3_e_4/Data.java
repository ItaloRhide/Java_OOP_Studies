//Crie uma classe Data que inclua três atributos: mês (inteiro), dia (inteiro) e ano
//(inteiro). Crie métodos para:
//a. Funcionar como getter e setter, validando os dados para garantir que os
//valores são reais;
//b. Funcionar como um construtor (com parâmetros padronizados) com três
//parâmetros para inicialização dos três atributos;
//c. Imprimir a data, com os campos separados por /;
//d. Calcular a quantidade de dias do ano até aquele mês, recebendo como
//parâmetro o número do mês;

//Escreva um programa que teste todos os métodos da classe. Para simplificar o
//exercício, considere meses ímpares com 31 dias e meses pares com 30 dias.

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public void Data(int diaInput, int mesInput, int anoInput){
        if (diaInput > 0 && diaInput <= 31) {
            this.dia = diaInput;
        }
        else {
            System.out.println("Dia inválido");
        }

        if (mesInput <= 12 && mesInput > 0){
            this.mes = mesInput;
        }
        else{
            System.out.println("Mês inválido");
        }

        if (anoInput > 0){
            this.ano = anoInput;
        }
        else{
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
        }
        else {
            System.out.println("Dia inválido");
        }
    }

    public void setMes(int mesInput){
        if (mes <= 12 && mes > 0){
            this.mes = mesInput;
        }
        else{
            System.out.println("Mês inválido");
        }
    }

    public void setAno(int anoInput){
        if (anoInput > 0){
            this.ano = anoInput;
        }
        else{
            System.out.println("Ano inválido");
        }
    }

    public void imprimirData(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }

    public static boolean anoBissexto(int ano) {
        // Um ano é bissexto se for divisível por 4 e não por 100, exceto se for divisível por 400
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public int diasDoAno(int mes, int ano){
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
}   
