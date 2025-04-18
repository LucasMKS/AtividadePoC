public class ContaCliente {
    // Atributos
    private Cliente cliente;
    private double saldo;

    // Construtor
    public ContaCliente(Cliente cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    // Getters
    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setter
    public void setSaldo(double saldo) {
        this.saldo = saldo;
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
        return cliente.getNome() + " (" + cliente.getId() + ") saldo=R$" + String.format("%.2f", saldo);
    }
}
