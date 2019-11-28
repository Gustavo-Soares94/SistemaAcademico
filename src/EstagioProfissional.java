
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
	
	
	
	public void exibeStatus() {
		//Possibilidade de associar mais de uma Área de TI a um estágio
		String areas = "";
		for(int i=0;i< getAreas().size();i++) {
			areas=areas + " " + getAreas().get(i).getSigla();
		}
		
		System.out.println(getAl().getNome() + "  " + getTitulo() + "           " + getSituacao() + "   " + 
		                   getValorRemuneracao() + "    " + getEmp().getNome() + getC().getNome() +  "      " + areas);
	}
	
	
	

}
