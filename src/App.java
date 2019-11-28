import java.util.ArrayList;
import java.util.List;

public class App {
	
	
	public static void main(String[] args) {
		
		exibeCabecalhoObrigatorio();
		
		//Estagio Obrigatório
		EstagioObrigatorio eo = new EstagioObrigatorio("Sistema WEB ABC"," Andamento","2019/2",0);
		Aluno a = new Aluno("Ana", 20191,"ana@uniritter.com.br");
		eo.setAl(a);
		Empresa e = new Empresa("A&D Soluções","Rua A");
		eo.setEmp(e);
		Curso c1 = new Curso("Computação",1,"Bacharel",8);
		eo.setC(c1);
		List<Area> areas = new ArrayList <Area>();
		areas.add(new Area ("DEV",""));
		eo.setAreas(areas);
		eo.exibeStatus();
		
		EstagioObrigatorio eo2 = new EstagioObrigatorio("App Negócios IAC","Concluído","2019/1",9.5);
		Aluno a2 = new Aluno("Ivo", 20192,"ivo@uniritter.com.br");
		eo2.setAl(a2);
		Empresa e2 = new Empresa("New TI","Rua B");
		eo2.setEmp(e2);
		Curso c2 = new Curso("      ADS",2,"Tecnólogo",6);
		eo2.setC(c2);
		List<Area> areas2 = new ArrayList <Area>();
		areas2.add(new Area ("MOB",""));
		eo2.setAreas(areas2);
		eo2.exibeStatus();
		
		//Estagio Profissional
		
		exibeCabecalhoProfissional();
		
		EstagioProfissional ep = new EstagioProfissional("App Dev","Andamento",2500.00);
		Aluno a3 = new Aluno("Beto", 20193,"beto@uniritter.com.br");
		ep.setAl(a3);
		ep.setEmp(e);
		ep.setC(c2);
		List<Area> areas3 = new ArrayList <Area>();
		areas3.add(new Area ("BD,","Banco de dados"));
		areas3.add(new Area ("IA","Inteligencia artificial"));
		ep.setAreas(areas3);
		ep.exibeStatus();
		
		EstagioProfissional ep2 = new EstagioProfissional("Suporte","Concluído",1800.00);
		Aluno a4 = new Aluno("João", 20194,"joao@uniritter.com.br");
		ep2.setAl(a4);
		ep2.setEmp(e2);
		Curso c3 = new Curso("            GTI",3,"Tecnólogo",6);
		ep2.setC(c3);
		List<Area> areas4 = new ArrayList <Area>();
		areas4.add(new Area ("ITIL",""));
		ep2.setAreas(areas4);
		ep2.exibeStatus();
		

	}
	
	//Metodos para gerar cabeçalho
	
	public static void exibeCabecalhoObrigatorio() {
		System.out.println("Estágio Obrigatório");
		System.out.println("\nAluno" + " Titulo" + "            Situação" + "    Semestre" + "  Nota" + "  Empresa" + "       Curso" + "          Áreas");
	}
	
	public static void exibeCabecalhoProfissional() {
		System.out.println("\nEstágio Profissional");
		System.out.println("\nAluno" + " Titulo" + "            Situação" + "    R$" + "        Empresa" + "           Curso" + "     Áreas");
	}

}
