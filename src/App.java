import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int escolha;
        iPhone iph1 = new iPhone();

        Scanner scanner = new Scanner(System.in);
        

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Nova Aba");
            System.out.println("2. Atualizar Página");
            System.out.println("3. Exibir Página");
            System.out.println("4. Fazer Ligação");
            System.out.println("5. Iniciar Conversa por Voz");
            System.out.println("6. Atender Chamada");
            System.out.println("7. Tocar Música");
            System.out.println("8. Pausar Música");
            System.out.println("9. Selecionar Música");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    iph1.adicionarNovaAba();
                    break;
                case 2:
                    iph1.atualizarPagina();
                    break;
                case 3:
                    iph1.exibirPagina("wwww.google.com");
                    break;
                case 4:
                    iph1.ligar("0000000");
                    break;
                case 5:
                    iph1.iniciarConversaVoz();
                    break;
                case 6:
                     iph1.atender();
                    break;
                case 7:
                    iph1.tocar();
                    break;
                case 8:
                    iph1.pausar();
                    break;
                case 9:
                    iph1.selecionarMusica("musica 1");
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (escolha != 0);

        scanner.close();   
               
    }
}
