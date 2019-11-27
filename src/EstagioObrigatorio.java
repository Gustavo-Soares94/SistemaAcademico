
public class EstagioObrigatorio extends Estagio {
	
	private String semestre;
	private double notaFinal;
	
	public EstagioObrigatorio(String titulo,String situacao, String semestre,double notaFinal) {
		super();
		setTitulo(titulo);
		setSituacao(situacao);
		this.semestre = semestre;
		this.notaFinal = notaFinal;
	}

	public String getSemestre() {
		return semestre;
	}
	
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	
	public double getNotaFinal() {
		return notaFinal;
	}
	
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	

	
	public void exibeStatus() {
		
		//Condicao para retornar nota
		if (getSituacao() == "Concluído") {
			System.out.println(getAl().getNome() + "   " + getTitulo() + "  " + getSituacao() + "   " + getSemestre() + " "
			           + "   " + getNotaFinal() + "   " + getEmp().getNome() + "  "+ getC().getNome());
		}else {
			System.out.println(getAl().getNome() + "   " + getTitulo() + "  " + getSituacao() + "   " + getSemestre() + " "
			           + "         " + getEmp().getNome() + "  "+ getC().getNome() );
		}
		
	}
	
	

}
