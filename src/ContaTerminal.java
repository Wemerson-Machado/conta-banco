import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

               

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta");
        String conta = scanner.next();

                
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome");
        String sobrenome = scanner.next();

        double saldo = 237.48;
        

        System.out.println("Ola," + nome + " " + sobrenome + "Obrigado por criar uma conta em nosso banco");
        System.out.println("Sua agência é " + agencia);
        System.out.println("Sua agência é " + conta);
        System.out.println("Seu saldo é " + saldo + " já está disponível");



    }
}
