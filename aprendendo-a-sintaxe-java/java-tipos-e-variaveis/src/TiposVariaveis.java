public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //Tipos primitivos
        //Estudar a classe String que representa textos na aplicação

        String meuNome = "DERIK OLIVEIRA";
        
        byte idade = 123;
        short ano = 2021;
        int cep = 38484848;
        long cepf = 992929292L;
        float pi = 3.14F;
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
    }
}
