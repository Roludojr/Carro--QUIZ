import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
// Cabeçalho com nome da instituição
        System.out.print("--Bem vindo, ao quiz sobre carros-- \n        Unifam  ---------  2024 \n Aluno: Nicolas Assis Ferreira de Jesus   -   Professor: Brenno Pimenta     ");
//metodo Scanner para pegar a entrada de resposta do usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos as primeiras questões");
 // Sistema boolean para conferir se a resosta esta correta ou falsa; se falsa ele repete a pergunta novamente ao usuario.
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
            // Verificador de resposta
            if (resposta.equals("1")) {
                System.out.println("parabéns resposta correta, vamos para proxima");
                resposta_correta = true;
            } else {
                System.out.println("Resposta errada tente novamente a seguir:");
            }
        } while (!resposta_correta);


        System.out.println("Boa agora vamos para o segunda pergunta do nosso quiz ");
        Scanner pergunta_dois = new Scanner(System.in);
        boolean resposta_corretadois = false;

        do {
            System.out.println("Qual carro é conhecido como o popular no Brasil?");
            System.out.println("[1] - Palio");
            System.out.println("[2] - Fusca");
            System.out.println("[3] - Gol");
            System.out.println("[4] - Corsa");
            System.out.println("[5] - Onix");

            System.out.println("Digite sua resposta entre 1 e 5: ");
            String resposta = scanner.nextLine();
            // Verificador de resposta
            if (resposta.equals("3")) {
                System.out.println("parabéns resposta correta, vamos para proxima");
                resposta_corretadois = true;
            } else {
                System.out.println("Resposta errada tente novamente a seguir:");
            }
        } while (!resposta_corretadois);




    }

}

