package funcionario;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado {
	private double salario;

	public FuncionarioComissionadoBaseSalario(String nome, String cpf, double vendas, double taxaComissao, double salario) {
		super(nome, cpf, vendas, taxaComissao);
		this.salario = salario;
	}

	@Override
	public double getRendimentos() {
		double comissao= getVendas()*getTaxaComissao();
		return salario*comissao;
		
	}
	

}
