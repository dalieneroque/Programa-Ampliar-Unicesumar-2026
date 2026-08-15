public class ContaBancaria {
    // Atributos privados (encapsulados)
    private String numeroConta;
    private String titular;
    private double saldo;
    
    // Construtor
    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;  // Conta começa zerada
    }
    
    // Métodos getters (para consultar)
    public String getNumeroConta() {
        return numeroConta;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    // Métodos de operação (validam as regras de negócio)
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } 
        else 
            {
            System.out.println("Valor de depósito inválido!");
        }
    }
    
    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;                                                
            
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saque não realizado. Saldo insuficiente ou valor inválido!");
            return false;
        }
    }
    
    public boolean transferir(ContaBancaria destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            
            System.out.println("Transferência de R$" + valor + " para " + 
                             destino.getTitular() + " realizada!");
            return true;
        }
        return false;
    }
}