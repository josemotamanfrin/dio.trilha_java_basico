import java.util.Locale;
import java.util.Scanner;




public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TO DO: Conhecer e importar a classe Scanner 
        // Exibir as mensagens para o nosso usuário
        // Obter pela classe Scanner os valores digitados no terminal
        //Exibir a mensagem Conta Criada 

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numeroConta ;
        String agencia ;
        String nomeCliente ;
        double saldo ;

       

        System.out.println("Por favor, digite o número da Agência ! " );
        agencia = scanner.next();
        System.out.println("Digite o nome do Cliente : " );
        nomeCliente = scanner.next();
        System.out.println("Digite o numero da Conta : " );
        numeroConta = scanner.nextInt();
        System.out.println("Digite o valor do deposito inicial : ");
        saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já esta disponivel para saque.");


    }

}
