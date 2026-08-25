import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando os dados do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        System.out.print("Digite o curso: ");
        String curso = scanner.nextLine();

        System.out.print("Digite o período: ");
        int periodo = scanner.nextInt();

        // Apresentando os dados no formato solicitado
        System.out.println("\nAluno: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Curso: " + curso);
        System.out.println("Período: " + periodo);

        scanner.close();
    }
}
