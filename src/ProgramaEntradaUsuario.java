import java.util.Scanner;

public class ProgramaEntradaUsuario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo(a)!");
        System.out.println("Logo abaixo, nos informe sobre o que for requisitado:");

        System.out.print("Nome completo: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Altura: ");
        double altura = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Estado Civil: ");
        String estadoCivil = scanner.nextLine();

        scanner.close();

        System.out.println("Seu nome é " + nome + ".");
        System.out.println("CPF de número " + cpf + ".");
        System.out.println("Você tem " + idade + " anos de idade.");
        System.out.println("Pesa " + peso + "kg.");
        System.out.println("Tem uma altura de " + altura + "cm.");
        System.out.println("E seu estado civil é " + estadoCivil + ".");

    }
}
