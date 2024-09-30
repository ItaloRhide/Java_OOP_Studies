public class Main {
    public static void main(String[] args) throws Exception {
        Data data1 = new Data();
        data1.Data(15, 8, 2024); 

        data1.getDia();  
        data1.getMes();  
        data1.getAno();  

        data1.imprimirData(); 

        data1.setDia(31);
        data1.setMes(12);
        data1.setAno(2025);

        data1.imprimirData();

        int dias = data1.diasDoAno(data1.getMes(), data1.getAno());
        System.out.println("Dias do ano até o mês " + data1.getMes() + ": " + dias);

        boolean bissexto = Data.anoBissexto(data1.getAno());
        if (bissexto) {
            System.out.println("O ano " + data1.getAno() + " é bissexto.");
        } else {
            System.out.println("O ano " + data1.getAno() + " não é bissexto.");
        }
    }
}
