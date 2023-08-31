import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.next();

        System.out.println("Por favor, digite o número da Conta !");
        int conta = sc.nextInt();

        System.out.println("Por favor, digite seu nome !");
        String nome = sc.next();

        System.out.println("Por favor, digite o saldo !");
        double saldo = sc.nextDouble();

//        System.out.printf("Olá " +nome+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", " +
//                "conta "+conta+" e seu saldo "+saldo+" já está disponível para saque");

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, conta, saldo);

    }
}
