import java.util.List;

public class Estagio {
	
	private String titulo;
	private String situacao;
	private Empresa emp;
	private Aluno al;
	private Curso c;
	private List<Area> areas;
	
	public Estagio() {
		
	}
	
	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	public Curso getC() {
		return c;
	}

	public void setC(Curso c) {
		this.c = c;
	}

	
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getSituacao() {
		return situacao;
	}
	
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Empresa getEmp() {
		return emp;
	}

	public void setEmp(Empresa emp) {
		this.emp = emp;
	}

	public Aluno getAl() {
		return al;
	}

	public void setAl(Aluno al) {
		this.al = al;
	}

	
	

}
