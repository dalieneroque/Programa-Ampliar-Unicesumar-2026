public abstract class Personagem {

    private String nome;
    private int vida;
    private int ataque;
    private int defesa;
  

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }
   

      public void receberDano(int dano) {

        int danoFinal = dano - defesa;

        if (danoFinal < 1) {
            danoFinal = 1;
        }

        vida -= danoFinal;

        if (vida < 0) {
            vida = 0;
        }

        System.out.println(
            nome + " recebeu " + danoFinal + " de dano!"
        );
    }

    public abstract void atacar(Personagem inimigo); 

    public boolean estaVivo() {
        return vida > 0;
    }
    
}
