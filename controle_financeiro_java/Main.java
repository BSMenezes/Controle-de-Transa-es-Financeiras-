
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carteira carteira = new Carteira();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("
1. Adicionar transação");
            System.out.println("2. Ver saldo");
            System.out.println("3. Listar transações");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Descrição: ");
                String descricao = scanner.nextLine();
                System.out.print("Valor: ");
                double valor = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Tipo (entrada/saida): ");
                String tipo = scanner.nextLine();
                carteira.adicionarTransacao(new Transacao(descricao, valor, tipo));
            } else if (opcao == 2) {
                System.out.println("Saldo atual: R$" + carteira.calcularSaldo());
            } else if (opcao == 3) {
                carteira.listarTransacoes();
            } else if (opcao == 0) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
