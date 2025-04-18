public class ContaCliente {
    private int id;
    private Cliente cliente;
    private double saldo = 0.0;

    public ContaCliente(int id,  Cliente cliente, double saldo) {
        this.id = id;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public ContaCliente(int id,  Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public ContaCliente(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double addDeposito(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " efetuado.");
        return saldo;
    }

    public double subSaldo(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para retirar R$" + valor);
            return saldo;
        }
        saldo -= valor;
        System.out.println("Retirada de R$" + valor + " efetuada.");
        return saldo;
    }

    @Override
    public String toString() {
        return cliente.getNome() + "(" + cliente.getId() + ") saldo=R$" + String.format("%.2f", saldo);
    }

}