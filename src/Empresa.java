import java.util.List;

public class Empresa {
	
	private String nome;
	private String endereco;
	private List<Estagio> estagios;
	
	public Empresa(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public Empresa() {
		
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Estagio> getEstagios() {
		return estagios;
	}

	public void setEstagios(List<Estagio> estagios) {
		this.estagios = estagios;
	}
	
	public void exibeStatusEmpresa() {
		
		String estagios = "";
		for(int i=0;i< getEstagios().size();i++) {
			estagios=estagios + " " + getEstagios().get(i).getTitulo();
		}
		
		System.out.println( getNome()+ "   " + getEndereco() + "   " + estagios);
		
		
		
	}

	
	
	

}
