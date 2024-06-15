public class Comentarios {
    public static void main (String[] args) {
        // Olá, eu sou um comentário em uma única linha

        /* Olá
         * Eu sou um comerario
         * que posso ser mais detalhado
         * quando necessário
         */
    }

    public void metodo() {
        /**
         * Estas duas estrelinhas acima
         * é para identificar que você
         * pretende elaborar um cometário
         * a nível de documentação.
         */
    }

    /*
     * Este método foi elaborado as pressas
     * por isso eu abrevei o nome das váriaveis
     * mas olha, ele tem a finalidade somar ou multiplicar
     * dois números
     */

    public int somaMultiplica (int n, int x, String m) {
        int r = 0; // r é igual ao resultado
        if (m == "M") { // M = Multiplicação
            r = n * x;
        } else {
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }
}
