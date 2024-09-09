public class DadosCliente {
    private Integer Numero;
    private String Agencia;
    private String NomeCliente;
    private Double Saldo;

    public DadosCliente() {
    }

    public DadosCliente(Integer Numero, String Agencia, String NomeCliente, Double Saldo) {
        this.Numero = Numero;
        this.Agencia = Agencia;
        this.NomeCliente = NomeCliente;
        this.Saldo = Saldo;
    }

    public Integer getNumero() {
        return this.Numero;
    }

    public void setNumero(Integer Numero) {
        this.Numero = Numero;
    }

    public String getAgencia() {
        return this.Agencia;
    }

    public void setAgencia(String Agencia) {
        this.Agencia = Agencia;
    }

    public String getNomeCliente() {
        return this.NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    public Double getSaldo() {
        return this.Saldo;
    }

    public void setSaldo(Double Saldo) {
        this.Saldo = Saldo;
    }

    @Override
    public String toString() {
        return "Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + ". Seu saldo de R$ " + Saldo + " já está disponível para saque.";
    }
}