//Crie uma classe chamada NotaFiscal que um hardware utilize para representar uma
//nota fiscal em uma loja de peças. Uma nota fiscal deve incluir quatro dados como
//atributos:
//a. Número da peça (string);
//b. Descrição da peça (string);
//c. Quantidade comprada (inteiro); 
//d. Preço (número real).

//A classe deve incluir getters e setters para cada um dos atributos. Ainda, deve haver
//um método getTotalNota que calcule e retorne o total de um vetor de objetos.
//Escreva um programa que teste cada um dos métodos da classe.

class NotaFiscal{
    private String numeroPeca;
    private String descricaoPeca;
    private int quantidadeComprada[];
    private double preco;

    public void setNumeroPeca(String numeroPecaInput){
        this.numeroPeca = numeroPecaInput;
    }

    public void setDescricaoPeca(String descricaoPecaInput){
        this.descricaoPeca = descricaoPecaInput;
    }

    public void setQuantidadeComprada(int quantidadeCompradaInput[]){
        this.quantidadeComprada = quantidadeCompradaInput;
    }

    public void getTotalNota(){
        System.out.println("O valor total é de: R$" + this.quantidadeComprada.length * this.preco);
    }

    public void setPreco(double precoInput){
        this.preco = precoInput;
    }

    public void getNumeroPeca(){
        System.out.println("O número da peça é de: "+ numeroPeca);
    }

    public void getDescricaoPeca(){
        System.out.println("A descrição da peça é de: " + descricaoPeca);
    }

    public void getQuantidadeComprada(){
        System.out.println("Quantidade comprada de: " + quantidadeComprada.length);
    }

    public void getPreco(){
        System.out.println("O preço das peças são de: R$" + preco);
    }
}