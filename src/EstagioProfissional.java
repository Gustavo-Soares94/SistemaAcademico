
public class EstagioProfissional extends Estagio {
	
	private double valorRemuneracao;
	

	public EstagioProfissional(String titulo,String situacao, double valorRemuneracao) {
		super();
		setTitulo(titulo);
		setSituacao(situacao);
		this.valorRemuneracao = valorRemuneracao;
	}

	public double getValorRemuneracao() {
		return valorRemuneracao;
	}

	public void setValorRemuneracao(double valorRemuneracao) {
		this.valorRemuneracao = valorRemuneracao;
	}
	
	public void exibeEstagio() {
		System.out.println("\nEstágio Profissional");
		System.out.println("\nAluno" + " Titulo" + "            Situação" + "    R$" + "        Empresa" + "           Curso");
	}
	
	public void exibeStatus() {
		
		System.out.println(getAl().getNome() + "  " + getTitulo() + "           " + getSituacao() + "   " + 
		                   getValorRemuneracao() + "    " + getEmp().getNome() + getC().getNome() );
	}
	
	
	

}
