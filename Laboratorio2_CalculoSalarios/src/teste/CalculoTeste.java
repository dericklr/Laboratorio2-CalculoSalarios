package teste;

import empresa.Empresa;
import funcionario.Funcionario;
import funcionario.FuncionarioAssalariado;
import funcionario.FuncionarioHorista;
import funcionario.FuncionarioComissionado;
import funcionario.FuncionarioComissionadoBaseSalario;

public class CalculoTeste {
	public static void main(String[] args) {
		System.out.println("Informações dos Funcionarios");
	
	Funcionario f1=new FuncionarioAssalariado("Derick","038.431.390-67",2000);
	Funcionario f2= new FuncionarioHorista("Pedro","01.234.567-89",20, 45.0);
	FuncionarioComissionado f3=new FuncionarioComissionado("Maria","45.546.567-00",1000.0,0.5);
	FuncionarioComissionadoBaseSalario f4=new FuncionarioComissionadoBaseSalario("Jorge","56.124.48-50",25,8000.0,0.03);
	
	Empresa e= new Empresa();
	e.adicionarFuncionario(f1);
	System.out.println("Nome: "+f1.getNome()+", CPF: "+f1.getCpf()+", Rendimento: "+f1.getRendimentos());
	e.adicionarFuncionario(f2);
	System.out.println("Nome: "+f2.getNome()+", CPF: "+f2.getCpf()+", Rendimentos: "+ f2.getRendimentos());
	e.adicionarFuncionario(f3);
	System.out.println("Nome: "+f3.getNome()+", CPF: "+f3.getCpf()+", Rendimentos: "+f3.getRendimentos());
	e.adicionarFuncionario(f4);
	System.out.println("Nome: "+f4.getNome()+", CPF: "+ f4.getCpf()+", Rendimentos: " +f4.getRendimentos());
	
	double folhaPagamento= e.calcularFolhaPagamento();
	 System.out.println("Folha de Pagamentos: "+folhaPagamento);
	 

}
}
