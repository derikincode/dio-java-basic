package condicionalternária;

public class ResultadoEcolar {
    public static void main(String[] args) {
        int nota = 7;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.err.println(resultado);
    }
}
