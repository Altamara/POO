import java.util.Scanner;
public class AlunoPosGraduacao extends Aluno
{
    // variáveis de instância 
    String graduacao;
    String instituicao;
    int anoInicio;
    int anoConclusao;

    public void lerDados()
       {
           super.lerDados();
           
           Scanner s = new Scanner(System.in);
           
           System.out.println("Digite a graduacao:");
           this.graduacao = s.nextLine();
         
           System.out.println("Digite a instituicao:");
           this.instituicao = s.nextLine();
           
           System.out.println("Digite o ano de inicio:");
           this.anoInicio = s.nextInt();
           
           System.out.println("Digite o ano de conclusao:");
           this.anoConclusao = s.nextInt();
           
           
           
       }
       public void mostrarDados() 
       {
           super.mostrarDados();
           
           System.out.println("Graduacao: "+this.graduacao);
           System.out.println("Instituicao: "+this.instituicao);
           System.out.println("Ano de inicio: "+this.anoInicio);
           System.out.println("Ano de conclusao: "+this.anoConclusao);
       }
}
