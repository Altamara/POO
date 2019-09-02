import java.util.Scanner;
public class Curso
{
    // variáveis de instância
       String codigo;
       String nome;
       String duracao;

       public void lerDados()
       {
           Scanner s = new Scanner(System.in);
           
           System.out.println("Digite o codigo do Curso:");
           this.codigo = s.nextLine();
           
           System.out.println("Digite o nome do Curso:");
           this.nome = s.nextLine();
           
           System.out.println("Digite a duracao do Curso:");
           this.duracao = s.nextLine();
                      
           
       }
        public void mostrarDados() 
       {
           System.out.println("Codigo: "+this.codigo);
           System.out.println("Nome: "+this.nome);
           System.out.println("Duracao: "+this.duracao);
       }
}
