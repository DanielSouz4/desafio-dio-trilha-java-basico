
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        String nomeCliente, agencia;
        int numero;
        double saldo = 0;

        System.out.println("Insira as informações pedidas abaixo e pressione enter para continuar.");

        System.out.print("Por favor digite o numero da Agencia: ");
        agencia = scanner.next();

        System.out.print("Agora, Por favor, digite o numero da Conta: ");
        numero = scanner.nextInt();

        System.out.print("Agora informe o seu nome: ");
        nomeCliente = scanner.next();

        System.out.print("Informe seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá, " +nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

       
    }
}
