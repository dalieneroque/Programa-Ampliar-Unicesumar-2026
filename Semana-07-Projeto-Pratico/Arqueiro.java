public class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        super(nome, 150, 35, 20);
    }

    @Override
    public void atacar(Personagem inimigo) {

        System.out.println(
            "🏹 " + getNome() + " ataca com FLECHAS!"
        );

        inimigo.receberDano(getAtaque());
    }
}