public class ContaCliente {
    // Atributos
    private Cliente cliente;
    private int id;
    private String nome;
    private String cpf;
    private double saldo;
    private String tipoConta;

    // Construtores
    public ContaCliente(Cliente cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    public ContaCliente(int id, String nome, String cpf, double saldo, String tipoConta) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    // Getters e Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

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

    // Método para subtrair valor do saldo
    public double subtrai(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente. Saída cancelada.");
        }
        return saldo;
    }

    // Exibir dados em formato de string
    @Override
    public String toString() {
        if (cliente != null) {
            return cliente.getNome() + " (" + cliente.getId() + ") saldo=R$" + String.format("%.2f", saldo);
        } else {
            return nome + " (" + id + ") saldo=R$" + String.format("%.2f", saldo);
        }
    }
}
