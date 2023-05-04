package empresa;

import funcionario.Funcionario;
import java.util.ArrayList;

public class Empresa {
	private ArrayList<Funcionario> funcionarios;
	
	public Empresa() {
		this.funcionarios=new ArrayList<>();
	}
	
	public void adicionarFuncionario(Funcionario funcionario) {
	this.funcionarios.add(funcionario);
	}
	

	public double calcularFolhaPagamento() {
		double total=0;
		for(Funcionario f: funcionarios) {
			total+=f.getRendimentos();
		}
			
		return total;
	}

}
