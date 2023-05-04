package funcionario;

public class FuncionarioComissionado extends Funcionario{
	private double vendas;
	private double taxaComissao;
	
	public FuncionarioComissionado(String nome, String cpf, double vendas, double taxaComissao) {
		super(nome,cpf);
		this.vendas = vendas;
		this.taxaComissao = taxaComissao;
	}
	
	public double getVendas() {
		return vendas;
	}
	
	public double getTaxaComissao() {
		return taxaComissao;
	}
	
	@Override
	public  double getRendimentos() {
		return vendas*taxaComissao;
		
	}
	
	

}
