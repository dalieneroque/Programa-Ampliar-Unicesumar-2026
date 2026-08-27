public class Carro extends Veiculo  {
    
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void abrirPorta() {

    }

    @Override
    public void acelerar() {
        System.out.println("O carro esta acelerando...");

    }
    
}
