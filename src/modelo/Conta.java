package modelo;

public class Conta {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public Conta(int numero, String agencia, String nomeCliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;        
    }

    public Conta(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if(this.saldo < valor){
            System.out.println("Não há saldo suficiente.");
            return;
        }
        this.saldo -= valor;
    }
    
    public String boasVindasComDeposito() {
        return "Olá, " + this.nomeCliente + ", obrigado(a) por criar uma conta com o nosso banco," 
                + " sua agência é: " + this.agencia + " , conta " + this.numero + " , e seu saldo é R$ " 
                + String.format("%.2f", this.saldo) + ", já disponível para saque.";
    }

        public String boasVindasSemDeposito() {
        return "Olá, " + this.nomeCliente + ", obrigado(a) por criar uma conta com o nosso banco," 
                + " sua agência é: " + this.agencia + " , conta " + this.numero + " , e seu saldo é R$ " 
                + String.format("%.2f", this.saldo);
    }
    
}
