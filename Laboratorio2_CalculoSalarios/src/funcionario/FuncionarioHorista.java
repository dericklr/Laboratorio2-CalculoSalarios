package funcionario;

public class FuncionarioHorista extends Funcionario {
	private double salarioHora;
	private double horasTrabalhadas;
	
	public FuncionarioHorista(String nome, String cpf, double salarioHora, double horasTrabalhadas) {
		super(nome, cpf);
		this.salarioHora = salarioHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	
	
	public double getSalarioHora() {
		return salarioHora;
	}



	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}



	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}



	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}



	@Override
	public double getRendimentos() {
		double horasExtras=0;
		if(horasTrabalhadas<=40)
			return salarioHora*horasTrabalhadas;
		else 
			horasExtras=horasTrabalhadas-40;
			return(40*salarioHora)+(horasExtras*salarioHora*1.5);
	}

}
