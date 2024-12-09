package contas; 
public class ContaCorrente extends Conta {
    private double taxaManutencao;

    public ContaCorrente(String numeroConta, double saldoInicial, double taxaManutencao) {
        super(numeroConta, saldoInicial);
        this.taxaManutencao = taxaManutencao;
    }

    // Método para calcular rendimento (por exemplo, uma tarifa mensal)
    @Override
    public void calcularRendimento() {
        // Para a conta corrente, o rendimento poderia ser uma taxa de manutenção
        double rendimento = getSaldo() - taxaManutencao;
        setSaldo(rendimento);
        System.out.println("Rendimento da Conta Corrente calculado com taxa de manutenção: " + rendimento);
    }

    // Getters e Setters para taxa de manutenção
    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }
}
