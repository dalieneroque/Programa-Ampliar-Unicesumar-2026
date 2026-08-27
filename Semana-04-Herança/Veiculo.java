public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;


public Veiculo (String marca, String modelo, int ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;

}

public void exibirInformacoes() {
    System.out.println("A marca do veiculo é: " + marca);
    System.out.println("O modelo do veiculo é: " + modelo);
    System.out.println("O ano do veiculo é: " + ano);

}

public void acelerar() {
    System.out.println("O veiculo esta acelerando...");
}

}



