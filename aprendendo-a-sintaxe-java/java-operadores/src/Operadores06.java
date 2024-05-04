public class Operadores06 {
    public static void main (String [] args) {
        String nomeUm = "Derik";
        //String nomeDois = "Derik";
        String nomeDois = new String ("Derik");
        
        // equals: ele compara conteudo dos objetos 
        System.out.println(nomeUm.equals(nomeDois));

       // System.out.println(nomeUm == nomeDois);

       int numero1 = 1;
       int numero2 = 2;

       boolean simNao = numero1 == numero2;

       if(numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
       } else {
            System.out.println("A nossa condição é falsa");
       }

       System.out.println("numeroUm é igual a numeroDois? " + simNao);

       simNao = numero1 != numero2;

       System.out.println("numeroUm é diferente de numeroDois? " + simNao);

       simNao = numero1 > numero2;

       System.out.println("numeroUm é maior que numeroDois? " + simNao);
       
       /*if(numero1 > numero2) {
            System.out.println("Número 1 é maior que número 2");
       } else {
            System.out.println("Número 2 é maior que número 1");
       }
       */
    }
}
