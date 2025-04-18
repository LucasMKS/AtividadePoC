public class ContaCliente {
    private String nome;
    private String cpf;
    private double saldo;
    private String tipoConta;

    // Constructor
    public ContaCliente(String nome, String cpf, double saldo, String tipoConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

}
