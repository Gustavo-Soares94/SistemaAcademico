
public class Aluno {

	private String nome;
	private int matricula;
	private String contato;
	
	
	public Aluno(String nome, int matricula, String contato) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.contato = contato;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getContato() {
		return contato;
	}
	
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	
	
}
