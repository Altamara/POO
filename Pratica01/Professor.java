import java.util.Scanner;
public class Professor
{
    // variáveis de instância 
        String titulacao;
        String areaPesquisa;
      
       public void lerDados()
       {
                   
           Scanner s = new Scanner(System.in);
                      
           System.out.println("Digite a titulacao do professor:");
           this.titulacao = s.nextLine();
           
           System.out.println("Digite a area de pesquisa do professor:");
           this.areaPesquisa = s.nextLine();
           
       
       }
       
       public void mostrarDados()
       {
           System.out.println("Titulacao: "+this.titulacao);
           System.out.println("Area de Pesquisa: "+this.areaPesquisa);
           
       
       }
}