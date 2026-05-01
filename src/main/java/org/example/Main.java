package org.example;
import java.text.CharacterIterator;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    // VAR opcoes do menu
    static int opcoesMenu;

    // ARRAY de codigos(OPCOES DE LANCHES MENU)
    // ARRAY de lanchesMenu(NOME DE TUDO DISPONIVEL NO MENU)
    static int[] codigosMenu = {1, 2, 3, 4, 5, 6, 7};

    static String[] lanchesMenu = {
            "TestoBurger Classico", "TestoBurger Duplo",
            "Batata Frita P", "Batata Frita G",
            "Refrigerante Lata", "Suco Natural", "Agua"
    };

    static double[] precosLanches = {22.90, 29.90, 12.00, 18.00, 7.00, 10.00, 4.00};

    static String nomeCliente;
    //VAR Caixa pedidos valor
    static double valorAtualPedido = 0;

    static int indiceItemSorteio = -1;

    //VAR Desconto Sorteio
    static double descontoSorteioPedidos = 0;

    public static void main(String[] args) {

        do {
            System.out.println("\n_-= LANCHES-TESTONI =-_");
            System.out.println("[1] - NOVO PEDIDO");
            System.out.println("[2] - CONSULTAR CARDAPIO POR CATEGORIA");
            System.out.println("[3] - CALCULAR TROCO");
            System.out.println("[4] - SORTEIO DO DIA");
            System.out.println("[5] - ENCERRAR SISTEMA");
            System.out.print("Escolha uma opcao: ");

            opcoesMenu = scanner.nextInt();
            scanner.nextLine();

            switch (opcoesMenu) {
                case 1:
                    novoPedido(scanner);
                    break;
                case 2:
                    cardapioLaches(scanner);
                    break;
                case 3:
                    calcularTroco(scanner);
                    break;
                case 4:
                    sorteioDoDia();
                    break;
                case 5:
                    System.out.println("Sistema encerrando ......");
                    break;
                default:
                    System.out.print("Opcao invalida digite novamente");
            }

        } while (opcoesMenu != 5);
    }

    // metodo NOVO-PEDIDO
    static void novoPedido(Scanner scanner) {

        System.out.println("\n_-= NOVO PEDIDO =-_");
        System.out.print("Digite seu nome: ");
        nomeCliente = scanner.nextLine();

        //ARRAY Cria espaço para guardar até 100 itens do pedido.
        String[] itensClientePedido = new String[100];

        //Zerar variavel com o valor do pedido feito anteriormente
        valorAtualPedido = 0;

        //VAR Esse número controla quantos itens já foram adicionados comeca com 0 e vai somando.
        int quantidadeItensPedido = 0;

        //VAR Guarda o valores de todos os itens pedidos, vai acrescentanto valores.
        double valorPedidoDinheiro = 0;

        //VAR Guardar resposta S ou N para continuar pedindo;
        char continuarPedindo;

        int codigoEscolhidoCliente;
        String nomeItemEscolhidoCliente;
        double valorItemEscolhidoCliente;

        do {
            System.out.println("\n_-= CARDAPIO =-_");

            for (int i = 0; i < codigosMenu.length; i++) {
                System.out.printf("%d - %s R$ %.2f%n", codigosMenu[i], lanchesMenu[i], precosLanches[i]);
            }

            do {
                System.out.print("Digite o numero do codigo do item: ");
                codigoEscolhidoCliente = scanner.nextInt();
                scanner.nextLine();
                //ESPACO FANTASMA PULAR LINHA
                System.out.println();

                if (codigoEscolhidoCliente < 1 || codigoEscolhidoCliente > codigosMenu.length) {
                    System.out.print("Opcao invalida digite novamente!\n");
                }
            } while (codigoEscolhidoCliente < 1 || codigoEscolhidoCliente > codigosMenu.length);

            int indice = codigoEscolhidoCliente - 1;

            nomeItemEscolhidoCliente = lanchesMenu[indice];

            if (indice == indiceItemSorteio) {
                valorItemEscolhidoCliente = precosLanches[indice] * 0.80;
                System.out.println("Desconto de 20% aplicado nesse item!");
            } else {
                valorItemEscolhidoCliente = precosLanches[indice];
            }

            System.out.println("Item selecionado: " + codigoEscolhidoCliente);
            System.out.println("Nome do item: " + nomeItemEscolhidoCliente);
            System.out.printf("Valor do item: R$ %.2f%n", valorItemEscolhidoCliente);

            itensClientePedido[quantidadeItensPedido] = nomeItemEscolhidoCliente;
            quantidadeItensPedido++;
            valorPedidoDinheiro += valorItemEscolhidoCliente;
            valorAtualPedido += valorItemEscolhidoCliente;

            System.out.println("Deseja adcionar mais itens? (S/N)");
            continuarPedindo = Character.toUpperCase(scanner.next().charAt(0));
            scanner.nextLine();

        } while (continuarPedindo == 'S');

        System.out.println("_-= RESUMO-PEDIDO =-_");
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Quantidade de itens: " + quantidadeItensPedido);
        System.out.println("Itens selecionados: ");
        for (int i = 0; i < quantidadeItensPedido; i++) {
            System.out.println("- "  + itensClientePedido[i]);
        }
        System.out.printf("Valor total: R$ %.2f%n", valorPedidoDinheiro);

    }

    static void cardapioLaches(Scanner scanner) {

        int escolhaSubMenu;

        do {
            System.out.println("\n_-= CATEGORIAS =-_");
            System.out.println("[1] - Lanches");
            System.out.println("[2] - Acompanhamentos");
            System.out.println("[3] - Bebidas");
            System.out.println("[4] - Voltar ao menu principal");
            System.out.print("Escolha uma opcao: ");
            escolhaSubMenu = scanner.nextInt();

            switch (escolhaSubMenu) {
                case 1:
                    System.out.println("\n1 - TestoBurger Classico" );
                    System.out.println("2 - TestoBurger Duplo");
                    break;
                case 2:
                    System.out.println("\n1 - Batata Frita P");
                    System.out.println("2 - Batata Frita G");
                    break;
                case 3:
                    System.out.println("\n1 - Refrigerante Lata");
                    System.out.println("2 - Suco Natural");
                    System.out.println("3 - Agua");
                    break;
                case 4:
                    System.out.println("Voltando ao menu principal ....");
                    break;

                default:
                    System.out.println("Opcao invalida digite novamente");

            }
        } while (escolhaSubMenu != 4);
    }

    static void calcularTroco (Scanner scanner) {

        double valorRecebidoCliente;
        double trocoCliente;

            System.out.println("\n_-= SISTEMA DE TROCO =-_");
            System.out.println("Nome do Cliente pedido: " + nomeCliente);
            System.out.printf("Valor total do pedido: R$ %.2f%n", valorAtualPedido);

            do {
            System.out.print("Informe o valor recebido do cliente: ");
            valorRecebidoCliente = scanner.nextDouble();

            if (valorRecebidoCliente < valorAtualPedido) {
                System.out.println("Valor recebido do cliente e insuficiente!");
            } else {
                trocoCliente = valorRecebidoCliente - valorAtualPedido;
                System.out.printf("Valor do troco para o cliente: R$ %.2f%n", trocoCliente);
            }
        } while (valorRecebidoCliente < valorAtualPedido);
    }

    static void sorteioDoDia() {

        indiceItemSorteio = (int)(Math.random() * 7);

        double precoOriginal = precosLanches[indiceItemSorteio];
        double precoComDesconto = precoOriginal * 0.80;

        System.out.println("\n_-= SORTEIO DO DIA =-_");
        System.out.println("O item sorteado do dia -> " + lanchesMenu[indiceItemSorteio] + " esta com 20% de desconto!");
        System.out.printf("Preco original: R$ %.2f%n", precoOriginal);
        System.out.printf("Preco com desconto: R$ %.2f%n", precoComDesconto);
    }
}