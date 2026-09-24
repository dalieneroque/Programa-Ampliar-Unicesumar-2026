import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     
        Scanner scanner = new Scanner(System.in);
    
        // ---------------------------------------------
        //                    MENU
        // ---------------------------------------------

        
        System.out.println("=================================");
        System.out.println("          ⚔️  ARENA RPG  ⚔️     ");
        System.out.println("=================================");

        System.out.println();
        System.out.println("Bem-vindo à Arena RPG!");

        System.out.print("Digite o nome do seu personagem: ");
        String nome = scanner.nextLine();


        // ---------------------------------------------
        //                    ESCOLHA DA CLASSE
        // ---------------------------------------------


        System.out.println();
        System.out.println("Escolha a classe do seu personagem: ");

        System.out.println("1 - ⚔️ Guerreiro");
        System.out.println("2 - 🏹 Arqueiro");
        System.out.println("3 - 🛡️ Sacerdote");
        System.out.println("4 - 🔥 Mago");
        
        System.out.println("Digite a sua escolha: ");
        int escolha = scanner.nextInt();


        // ---------------------------------------------
        //                    CRIAÇÃO DO PERSONAGEM
        // ---------------------------------------------

        Personagem jogador;

        switch (escolha) {
            case 1:
                jogador = new Guerreiro(nome);
                break;

            case 2:
                jogador = new Arqueiro(nome);
                break;

            case 3:
                jogador = new Sacerdote(nome);
                break;

            case 4:
                jogador = new Mago(nome);
                break;
                   
            default:
                System.out.println("❌ Classe invalida!");
                scanner.close();
                return;
        }


        // ---------------------------------------------
        //                    STATUS DO HERÓI
        // ---------------------------------------------

        System.out.println();   
        System.out.println("=================================");
        System.out.println("           HERÓI CRIADO!         ");
        System.out.println("=================================");

        System.out.println("Nome " + jogador.getNome() );
        System.out.println("❤️ Vida " + jogador.getVida() );
        System.out.println("🛡️ Ataque " + jogador.getAtaque());
        System.out.println("⚔️ Defesa " + jogador.getDefesa());


         // ---------------------------------------------
        //               CRIAÇÃO DO OPONENTE
        // ---------------------------------------------

        Personagem oponente = new Personagem("Lucas Henrique", 180, 40, 25  ) {  // Voltar aqui

                @Override
                public void atacar(Personagem inimigo) {

                    System.out.println(" 🪨 Lucas Henrique ataca com FUNDA!");

                    inimigo.receberDano(getAtaque());
                }
            };

        // Oponente Silvio 
        //
        //
        //
        
        System.out.println();   
        System.out.println("=================================");
        System.out.println("           OPONENTE!             ");
        System.out.println("=================================");
        
        System.out.println("Nome " + oponente.getNome() );
        System.out.println("❤️ Vida " + oponente.getVida() );
        System.out.println("🛡️ Ataque " + oponente.getAtaque());
        System.out.println("⚔️ Defesa " + oponente.getDefesa());


         // ---------------------------------------------
        //                  BATALHA
        // ---------------------------------------------

        while (jogador.estaVivo() && oponente.estaVivo()) {

        System.out.println();   
        System.out.println("=================================");
        System.out.println("           ⚔️ BATALHA!             ");
        System.out.println("=================================");
        
        
        System.out.println(
            " 🤺 " + jogador.getNome() + " ❤️ "  + jogador.getVida());
        

        System.out.println(
            " 🥷 " + oponente.getNome() + " ❤️ "  + oponente.getVida());
        
        

        System.out.println();
        System.out.println("1 - ⚔️ Atacar");
        System.out.println("2 - 📊 Ver Status");
        
        System.out.println("Escolha: ");

        int acao = scanner.nextInt();


        // ---------------------------------------------
        //                  ATACAR
        // ---------------------------------------------

        if (acao == 1) {
            jogador.atacar(oponente);

            if (!oponente.estaVivo()) {
                break;
        }

        oponente.atacar(jogador);

    } 
    
    else if (acao == 2) {
        
        System.out.println();
        System.out.println("📊 STATUS");

        System.out.println(
            "Nome: " + jogador.getNome()
        );

        System.out.println(
            "❤️ Vida: " + jogador.getVida()
        );

        System.out.println(
            "⚔️ Ataque: " + jogador.getAtaque()
        );

        System.out.println(
            "🛡️ Defesa: " + jogador.getDefesa()
        );

    } 
    
    else {

        System.out.println("❌ Opção inválida!");
        
    }

    // ========================================
    //              RESULTADO
    // ========================================

        System.out.println();

        if (jogador.estaVivo()) {

            System.out.println("================================");
            System.out.println("       🏆 VOCÊ VENCEU! " + jogador.getNome().toUpperCase() + " ! ");
            System.out.println("================================");


        } else {

            System.out.println("================================");
            System.out.println("       💀 VOCÊ PERDEU!");
            System.out.println("================================");
        }

    }
    
    scanner.close();

    }
}
