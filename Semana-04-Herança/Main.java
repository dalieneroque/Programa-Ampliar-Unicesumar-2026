public class Main {

    // O método main é o ponto de entrada da aplicação.
    // É a partir dele que o programa começa a ser executado.
    public static void main(String[] args) {


        // ==============================
        // 🚗 CRIAÇÃO DOS CARROS
        // ==============================

        // Criamos um objeto da classe Carro.
        // O construtor recebe: marca, modelo e ano.
        Carro carrodeVitor = new Carro("Chevrolet", "Prisma", 2012);

        Carro carrodeVitorCardoso =
                new Carro("Chevrolet", "Monza Tubarão", 1994);

        Carro carroVitor =
                new Carro("Volkswagen", "Fusca", 1994);

        Carro carroSilvio =
                new Carro("Fiat", "Fastback", 2026);

        Carro carroLuan =
                new Carro("Fiat", "Uno", 2005);

        Carro carroRafael =
                new Carro("Chevrolet", "Celta", 2010);

        Carro carroRuan =
                new Carro("Ford", "Troller TX4", 2022);

        // 🚗 Carro da Débora
        // Débora também marcou presença no nosso projeto!
        Carro carroDebora =
                new Carro("Mitsubishi", "Lancer Evo X", 2016);


        // ==============================
        // 🏍️ CRIAÇÃO DAS MOTOS
        // ==============================

        // Criamos objetos da classe Moto.
        // A Moto também herda de Veiculo.
        Moto motoLuan =
                new Moto("Honda", "CG Titan", 2001);

        Moto motoRuan =
                new Moto("MXF", "250TSX 2t", 2026);

        Moto motoSilvio =
                new Moto("Royal Enfield", "Classic 650", 2026);

        Moto motoVitor =
                new Moto("Yamaha", "Fazer FZ25", 2022);


        // ==============================
        // 📋 EXIBINDO AS INFORMAÇÕES
        // ==============================

        // Chamamos o método exibirInformacoes()
        // que foi definido na classe Veiculo.
        //
        // Como Carro e Moto herdam de Veiculo,
        // os dois podem utilizar esse método.

        carrodeVitor.exibirInformacoes();
        carrodeVitorCardoso.exibirInformacoes();
        carroVitor.exibirInformacoes();
        carroSilvio.exibirInformacoes();
        carroLuan.exibirInformacoes();
        carroRafael.exibirInformacoes();
        carroRuan.exibirInformacoes();
        carroDebora.exibirInformacoes();

        motoLuan.exibirInformacoes();
        motoRuan.exibirInformacoes();
        motoSilvio.exibirInformacoes();
        motoVitor.exibirInformacoes();


        // ==============================
        // 🚀 ACELERANDO OS VEÍCULOS
        // ==============================

        // Aqui podemos perceber a SOBRESCRITA de métodos.
        //
        // O método acelerar() existe na classe Veiculo,
        // mas Carro e Moto possuem suas próprias versões
        // utilizando @Override.
        //
        // Por isso, quando chamamos acelerar(),
        // cada tipo de veículo apresenta sua própria mensagem.

        carrodeVitor.acelerar();
        carrodeVitorCardoso.acelerar();
        carroVitor.acelerar();
        carroSilvio.acelerar();
        carroLuan.acelerar();
        carroRafael.acelerar();
        carroRuan.acelerar();
        carroDebora.acelerar();

        motoLuan.acelerar();
        motoRuan.acelerar();
        motoSilvio.acelerar();
        motoVitor.acelerar();

    }
}