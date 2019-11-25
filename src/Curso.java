
public class Curso {
	
	private String nome;
	private int codigo;
	private String tipo;
	private int quantSemestres;
	
	public Curso(String nome, int codigo, String tipo, int quantSemestres) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.tipo = tipo;
		this.quantSemestres = quantSemestres;
	}
	
	public Curso() {
		
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQuantSemestres() {
		return quantSemestres;
	}

	public void setQuantSemestres(int quantSemestres) {
		this.quantSemestres = quantSemestres;
	}
	

}
