import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua Conta");
        int numeroConta = scanner.nextInt();
        
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome");
        String nomeCliente = scanner.nextLine(); 
        
        double saldo = 237.48;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + " , conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
