package funcionario;

public class FuncionarioAssalariado extends Funcionario {
	private double salarioDecimal;

	public FuncionarioAssalariado(String nome,String cpf ,double salarioDecimal) {
		super(nome,cpf);
		this.salarioDecimal=salarioDecimal;
	}
	
	
	
	public double getSalarioDecimal() {
		return salarioDecimal;
	}



	public void setSalarioDecimal(double salarioDecimal) {
		this.salarioDecimal = salarioDecimal;
	}



	@Override
	public double getRendimentos() {
		return salarioDecimal;
	}
}
