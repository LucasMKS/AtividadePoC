public class ContaCliente {
    private int id;
    private String nome;
    private String cpf;
    private double saldo;
    private String tipoConta;

    // Construtor com ID
    public ContaCliente(int id, String nome, String cpf, double saldo, String tipoConta) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
