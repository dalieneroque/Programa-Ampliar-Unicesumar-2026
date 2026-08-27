public class Moto extends Veiculo {
    
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("A moto esta acelerando...");
    }
}
