public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        nomeCompleto = "LINGUAGEM".concat(" ").concat("JAVA");
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        concatenacao = 1+1+1+"1"; // 31
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1; // 1111
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1; // 1111
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1); // 13
        System.out.println(concatenacao);
    }
}
