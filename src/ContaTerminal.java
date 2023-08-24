import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("seja bem-vinda(o) ao banco digital ticiabank! :)");
        System.out.println("por favor, digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("digite o número da agência: ");
        String agencia = input.nextLine();

        System.out.println("digite o número da conta: ");
        int conta = input.nextInt();

        System.out.println("informe o saldo: ");
        double saldo = input.nextDouble();

        System.out.println("obrigada(o) por criar uma conta em nosso banco, " +nome+ "! \nsua agência é " +agencia+ ", conta " +conta+ " e seu saldo de R$" +saldo+ " já está disponível para saque.");

        input.close();
    }
}
