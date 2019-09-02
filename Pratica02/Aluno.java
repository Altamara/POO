import java.util.Scanner;
public class Aluno extends Pessoa
{
    // variáveis de instância
       String matricula;
       Curso curso;
   
    public void lerDados()
       {
           super.lerDados();
           
           Scanner s = new Scanner(System.in);
           
           System.out.println("Digite a matricula do aluno:");
           this.matricula = s.nextLine();
         
           System.out.println("Digite o curso do aluno:");
           this.curso = new Curso();
           this.curso.lerDados(); 
           
       }
       public void mostrarDados() 
       {
           super.mostrarDados();
           
           System.out.println("Matricula: "+this.matricula);
           System.out.println("Curso: "+this.curso);
       }
}
