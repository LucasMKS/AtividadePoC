public class App {
    public static void main(String[] args) {
        // Criar Cliente
        Cliente cliente = new Cliente(1, "Lucas", 10); // 10% de desconto
        cliente.setGenero("m");

        // Criar ContaCliente para o cliente
        ContaCliente conta = new ContaCliente(1001, cliente, 500.00);
        System.out.println("Conta criada: " + conta.toString());

        // Adicionar saldo
        conta.addDeposito(200.00);
        System.out.println("Após depósito: " + conta.toString());

        // Criar Fatura
        FaturaCliente fatura = new FaturaCliente(101, cliente, 300.00);
        System.out.println("Fatura criada: " + fatura.toString());

        // Mostrar valor com desconto aplicado
        System.out.println("Valor com desconto: R$" + fatura.getValorComDesconto());

        // Tentar pagar fatura
        double valorFinal = fatura.getValorComDesconto();
        double saldoApos = conta.subSaldo(valorFinal);
        System.out.println("Saldo após tentativa de pagamento: R$" + saldoApos);

        // Ver conta final
        System.out.println("Estado final da conta: " + conta.toString());
    }
}
