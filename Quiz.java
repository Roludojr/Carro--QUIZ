import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        System.out.print("--Bem vindo, ao quiz sobre carros-- \n        Unifam  ---------  2024 \n Aluno: Nicolas Assis Ferreira de Jesus   -   Professor: Brenno Pimenta     ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos as primeiras questões");
        boolean resposta_correta = false;

        do {
            System.out.println("Qual a marca de carro que mais foi vendida no ano de 2022");
            System.out.println("[1] - Toyota");
            System.out.println("[2] - Ford");
            System.out.println("[3] - Volkswagen");
            System.out.println("[4] - Honda");
            System.out.println("[5] - Chevrolet");

            System.out.println("Digite sua resposta entre 1 e 5: ");
            String resposta = scanner.nextLine();
            if (resposta.equals("1")) {
                System.out.println("parabéns resposta correta, vamos para proxima");
            } else {
                System.out.println("Resposta errada tente novamente a seguir:");

            }

        } while (!resposta_correta);
    }

}

