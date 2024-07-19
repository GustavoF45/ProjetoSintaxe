import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o número do conta: ");
        int numero = terminal.nextInt();
        System.out.println("Digite o número da agência: ");
        String agencia = terminal.next();
        System.out.println("Digite o nome: ");
        String nomeCliente = terminal.next();
        System.out.println("Digite o saldo: ");
        float saldo = terminal.nextFloat();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}