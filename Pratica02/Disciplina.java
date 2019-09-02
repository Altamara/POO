import java.util.Scanner;
public class Disciplina
{
    // variáveis de instância 
       String codigo;
       String nome;
       int cargaHoraria;
       Professor professor;
       Curso curso;

 
    public void lerDados()
       {
           Scanner s = new Scanner(System.in);
           
           System.out.println("Digite o codigo da disciplina:");
           this.codigo = s.nextLine();
           
           System.out.println("Digite o nome da disciplina:");
           this.nome = s.nextLine();
           
           System.out.println("Digite a carga horaria da disciplina:");
           this.cargaHoraria = s.nextInt();
           
           System.out.println("Digite o professor da disciplina:");
           this.professor = new Professor();
           this.professor.lerDados(); 
           
           System.out.println("Digite o curso da disciplina:");
           this.curso = new Curso();
           this.curso.lerDados(); 
       }
        public void mostrarDados() 
       {
           System.out.println("Codigo: "+this.codigo);
           System.out.println("Nome: "+this.nome);
           System.out.println("Carga Horaria: "+this.cargaHoraria);
           System.out.println("Professor: "+this.professor);
           System.out.println("Curso: "+this.curso);
       }
    
}
