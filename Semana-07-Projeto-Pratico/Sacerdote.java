public class Sacerdote extends Personagem {

    public Sacerdote(String nome) {
        super(nome, 250, 20, 30);
    }

    @Override
    public void atacar(Personagem inimigo) {

        System.out.println(
            "🛡️ " + getNome() + " ataca com ESCUDO!"
        );

        inimigo.receberDano(getAtaque());
    }
}