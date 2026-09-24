public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome, 200, 35, 25);
    }

    @Override
    public void atacar(Personagem inimigo) {

        System.out.println(
            "⚔️ " + getNome() + " ataca com ESPADA!"
        );

        inimigo.receberDano(getAtaque());
    }
}
