import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println();
        System.out.print("Digite o 1° parâmetro: ");
        int param1 = terminal.nextInt();

        System.out.print("Digite o 2° parâmetro: ");
        int param2 = terminal.nextInt();

        try {

            contar(param1, param2);

        } catch (ParametrosInvalidException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        terminal.close();
    }

    static void contar(int param1, int param2) throws ParametrosInvalidException {
        System.out.println();
        if (param1 >= param2) {
            throw new ParametrosInvalidException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = param2 - param1;

        System.out.println("Imprimindo " + contagem + " vezes...");
        System.out.println();
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
        System.out.println();
    }
}
