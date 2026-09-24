public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome, 150, 50, 15);
    }

    @Override
    public void atacar(Personagem inimigo) {

        System.out.println(
            "🔥 " + getNome() + " ataca com BOLA DE FOGO!"
        );

        inimigo.receberDano(getAtaque());
    }
}