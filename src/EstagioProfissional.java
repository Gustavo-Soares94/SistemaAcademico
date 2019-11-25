
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
		System.out.println("\nEst�gio Profissional");
		System.out.println("\nAluno" + " Titulo" + "            Situa��o" + "    R$" + "        Empresa" + "           Curso");
	}
	
	public void exibeStatus() {
		
		System.out.println(getAl().getNome() + "  " + getTitulo() + "           " + getSituacao() + "   " + 
		                   getValorRemuneracao() + "    " + getEmp().getNome() + getC().getNome() );
	}
	
	
	

}
