import java.net.SocketPermission;
import java.util.Scanner;
import javax.security.sasl.SaslClientFactory;
import javax.swing.SpringLayout;

public class exercicioFunções {

    public static Scanner scanner;

    public static void main(String[] args) throws Exception {

        scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println();
            System.out.println("Escolha uma opção abaixo: ");
            System.out.println("1: imprime100");
            System.out.println("2: imprimeN");
            System.out.println("3: nomes5");
            System.out.println("4: adicao");
            System.out.println("5: pessoas");
            System.out.println("6: imparesN");
            System.out.println("7: tabuada");
            System.out.println("8: elevado");
            System.out.println("9: soma1N");
            System.out.println("10: fibonacciFor");
            System.out.println("11: fibonacciWhile");
            System.out.println("12: criarArray");
            System.out.println("13: unirArrays");
            System.out.println("14: palindromo");
            System.out.println("15: primo");
            System.out.println("16: perfeito");
            System.out.println("Para sair digite (0)");
            System.out.print("Qual opção? ");
            opcao = scanner.nextInt();
            System.out.println();

            if (opcao < 0 || opcao > 16) {
                System.out.println("Opção inválida! Digite entre 1 e 16, ou 0 para sair. ");
            }

            switch (opcao) {
                case 1:
                    imprime100();
                    break;

                case 2:
                    imprimeN();
                    break;

                case 3:
                    nomes5();
                    break;
                case 4:
                    adicao();
                    break;

                case 5:
                    pessoas();
                    break;
                case 6:
                    imparesN();
                    break;
                case 7:
                    tabuada();
                    break;
                case 8:
                    elevado();
                    break;
                case 9:
                    soma1N();
                    break;
                case 10:
                    fibonacciFor();
                    break;

                case 11:
                    fibonacciWhile();
                    break;

                case 12:
                    criarArray();
                    break;

                case 13:
                    unirArrays();
                    break;

                case 14:
                    palindromo();
                    break;

                case 15:
                    primo();
                    break;

                case 16:
                    perfeito();
                    break;

                case 0:
                    System.out.print("Encerrando programa...");
                    break;
                default:
                    System.out.print("Opção inválida");
                    break;
            }

        } while (opcao != 0); // encerra

        scanner.close();

    }

    public static void imprime100() {
        int n = 0;
        while (n <= 100) {
            System.out.print(n + " ");
            n = n + 1;
        }
    }

    public static void imprimeN() {
        System.out.print("Número: ");
        int n = scanner.nextInt();
        int cont = 0;
        while (cont <= n) {
            System.out.print(cont + " ");
            cont++;
        }

    }

    public static void nomes5() {
        int cont = 0;
        String[] nome = new String[5];
        while (cont < 5) {
            System.out.print(cont + 1 + "° Nome: ");
            nome[cont] = scanner.next();
            cont++;
        }
        // while para exibir os nomes obtidos
        System.out.println("Nomes digitados");
        cont = 0;
        while (cont < 5) {
            System.out.println(nome[cont]);
            cont++;

        }
    }

    public static void adicao() {
        String resposta = "s";
        while (!resposta.equalsIgnoreCase("n")) {
            System.out.print("1° valor: ");
            int n1 = scanner.nextInt();
            System.out.print("2° valor: ");
            int n2 = scanner.nextInt();

            int soma = 0;
            System.out.println(soma = n1 + n2);

            System.out.println("Deseja continuar (S) ou encerrar (N)? ");
            resposta = scanner.next();
        }
        System.out.println("Encerrando o programa...");

    }

    public static void pessoas() {

        int i, n;
        System.out.print("Número de pessoas: ");
        n = scanner.nextInt();
        String[] pessoas = new String[n];
        i = 0;
        while (i < n) {
            System.out.print("Nome da pessoa " + i + ":");
            pessoas[i] = scanner.nextLine();
            System.out.println();
            i++;
        }
        System.out.println("\nPessoas cadastradas: ");
        i = 0;
        while (i < n) {
            System.out.println("\"" + pessoas[i] + "\"");
            i++;
        }

    }

    public static void imparesN() {
        System.out.print("Quantos número impares quer imprimir? ");
        int impares = scanner.nextInt();

        for (int i = 1; i <= impares; i++) {
            System.out.println(2 * i - 1);

        }
    }

    public static void tabuada() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("\n Tabuada de " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);

            }
        }
    }

    public static void elevado() {
        System.out.print("Valor de X: ");
        int x = scanner.nextInt();

        System.out.print("Valor de Y: ");
        int y = scanner.nextInt();
        // quantas vezes você vai multiplicar x por ele mesmo

        int resultado = 1;
        for (int i = 1; i <= y; i++) {

            resultado = resultado * x;

        }
        System.out.println("Resultado: " + resultado);

    }

    public static void soma1N() {
        System.out.print("Valor de parada? ");
        int parada = scanner.nextInt();
        int resultado = 0;
        for (int i = 0; i < parada; i++) {
            System.out.print("Valor de n: ");
            int n = scanner.nextInt();

            resultado = resultado + n;
        }
        System.out.println("Resultado: " + resultado);
    }

    public static void fibonacciFor() {
        System.out.print("Tamanho: ");
        int n = scanner.nextInt();
        int[] fib = new int[n];

        if (n > 0) {
            fib[0] = 0;
        }
        if (n > 1) {
            fib[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 1; i < n; i++) {
            System.out.println(fib[i] + " ");
        }

    }

    public static void fibonacciWhile() {
        System.out.println("Pressione ENTER para ver o próximo número de Fibonacci ou 'q' para sair. ");
        System.out.println();

        long a = 0;
        long b = 1;
        scanner.nextLine();
        while (true) {
            // while roda até que vc mandar ele sair
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("q")) {
                // se digitar q sai do programa
                break;
            }
            System.out.println(a);

            long c = a + b;
            a = b;
            b = c;

        }
        System.out.println("Saindo da função...");

    }

    public static void criarArray() {
        System.out.print("Tamanho do vetor: ");
        int n1 = scanner.nextInt();

        int[] vetor1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            System.out.print((i + 1) + "° valor da posição: ");
            vetor1[i] = scanner.nextInt();
        }
        System.out.println("Percorrendo o array");
        for (int i = 0; i < n1; i++) {
            System.out.println(vetor1[i]);
        }
    }

    public static void unirArrays() {

        int[] n1 = new int[7];
        System.out.print("7 números separados por espaços:  ");
        for (int i = 0; i < 7; i++) {
            n1[i] = scanner.nextInt();
        }
        int[] n2 = new int[11];
        System.out.print("11 números separados por espaços: ");
        for (int i = 0; i < 11; i++) {
            n2[i] = scanner.nextInt();
        }

        int[] n3 = new int[18];

        for (int i = 0; i < 7; i++) {
            n3[i] = n1[i];
        }

        for (int i = 0; i < 11; i++) {
            n3[i + 7] = n2[i];
        }
        System.out.println("União dos Arrays: ");
        for (int i = 0; i < 18; i++) {
            System.out.print(n3[i] + " ");
        }
        System.out.println();
    }

    public static void palindromo() {

        scanner.nextLine();

        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();

        boolean ehPalindromo = true;

        // Compara o inicio com o final
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != texto.charAt(texto.length() - 1 - i)) {
                // A letra da frente é diferente da letra de trás
                ehPalindromo = false;
                break;
            }
        }
        if (ehPalindromo) {
            System.out.println("É palindromo");
        } else {
            System.out.println("Não é palindromo");
        }

    }

    public static void primo() {

        System.out.print("Número: ");
        int n1 = scanner.nextInt();

        int cont = 0;

        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                // testa se o numero é divisil por 1
                cont++; // conta quantos divisores tem
            }
        }
        if (cont == 2) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }

    }

    public static void perfeito() {

        System.out.println("Número: ");
        int n1 = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0) {
                soma += i;
            }
        }
        if (soma == n1) {
            System.out.println("é perfeito");
        } else {
            System.out.println("Não é perfeito");
        }

    }

}