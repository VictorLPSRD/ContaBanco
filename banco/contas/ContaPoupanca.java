package contas;

public class ContaPoupanca extends Conta{
    private double taxaRendimento;

    public ContaPoupanca(String numeroConta, double saldoInicial, double taxaRendimento) {
        super(numeroConta, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    // Método para calcular rendimento (exemplo: rendimento mensal)
    @Override
    public void calcularRendimento() {
        double rendimento = getSaldo() * taxaRendimento;
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimento da Conta Poupança calculado: " + rendimento);
    }

    // Getters e Setters para taxa de rendimento
    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}