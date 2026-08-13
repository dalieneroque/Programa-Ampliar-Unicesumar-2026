public class MainContaBancaria {
    public static void main(String[] args) {
        // Criando contas
        ContaBancaria contaLucasHenrique = new ContaBancaria("001", "Lucas Henrique");
        ContaBancaria contaSilvio = new ContaBancaria("002", "Silvio");
        ContaBancaria contaBruno = new ContaBancaria("003", "Bruno");
        
        // Tentando acessar diretamente (isso vai dar erro!)
        // contaJoao.saldo = 1000;  // ERRO! saldo é privado
        
        // Operações válidas
        contaLucasHenrique.depositar(1000);
        contaLucasHenrique.sacar(500);
        
        contaSilvio.depositar(10000);
        
        // Transferência entre contas
        contaSilvio.transferir(contaBruno, 1500);
        
        // Consultando saldos
        System.out.println("Saldo do LucasHenrique: R$" + contaLucasHenrique.getSaldo());
        System.out.println("Saldo do Silvio: R$" + contaSilvio.getSaldo());
        System.out.println("Saldo do Bruno: R$" + contaBruno.getSaldo() );
        
        // Testando validações
        contaSilvio.sacar(10000);  // Deve falhar
        contaBruno.depositar(-50);  // Deve falhar
    }
}