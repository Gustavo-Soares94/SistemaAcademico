
public class EstagioObrigatorio extends Estagio {
	
	private String semestre;
	private double notaFinal;
	
	public EstagioObrigatorio(String titulo,String situacao, String semestre,double notaFinal) {
		super(titulo);
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
		//Possibilidade de associar mais de uma Área de TI a um estágio
		String areas = "";
		for(int i=0;i< getAreas().size();i++) {
			areas=areas + " " + getAreas().get(i).getSigla();
		}
		
		//Condicao para retornar nota
		if (getSituacao() == "Concluído") {
			System.out.println(getAl().getNome() + "   " + getTitulo() + "  " + getSituacao() + "   " + getSemestre() + " "
			           + "   " + getNotaFinal() + "   " + getEmp().getNome() + "  "+ getC().getNome() +  "           " + areas);
		}else {
			System.out.println(getAl().getNome() + "   " + getTitulo() + "  " + getSituacao() + "   " + getSemestre() + " "
			           + "         " + getEmp().getNome() + "  "+ getC().getNome() +  "    " + areas);
		}
		
	}
	
	

}
