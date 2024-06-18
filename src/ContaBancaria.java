import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {
        double saldoCliente =0.00;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //login
        System.out.println("------------BANCO X-----------");
        System.out.println("---------AREA DE CADASTRO---------");
        
        //entrada dos dados
        System.out.println("Favor informar o número da sua agência bancária: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Favor informar o número de sua conta bancária: ");
        String numeroConta = scanner.next();

        System.out.println("Favor seu nome completo (sem abreviações e todo junto1021):");
        String nomeCliente = scanner.next();

        System.out.println("Favor informar a senha desejada, composta por 6 digitos:");
        int senhaCliente = scanner.nextInt();

        System.out.println("Ola, " +nomeCliente + " Seja bem vindo ao banco X. Seu saldo atual é de: R$ " + saldoCliente);

    }
}
