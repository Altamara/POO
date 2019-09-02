import java.util.Scanner;
public class Aluno
{
    // variáveis de instância
       String nome;
       String matricula;
       String cpf;
       Curso curso;
   
    public void lerDados()
       {
           Scanner s = new Scanner(System.in);
           
           System.out.println("Digite o nome do aluno:");
           this.nome = s.nextLine();
           
           System.out.println("Digite a matricula do aluno:");
           this.matricula = s.nextLine();
           
           System.out.println("Digite o CPF do aluno:");
           this.cpf = s.nextLine();
           
           System.out.println("Digite o curso do aluno:");
           this.curso = new Curso();
           this.curso.lerDados(); 
           
       }
       public void mostrarDados() 
       {
           System.out.println("Nome: "+this.nome);
           System.out.println("Matricula: "+this.matricula);
           System.out.println("CPF: "+this.cpf);
           System.out.println("Curso: "+this.curso);
       }
}
