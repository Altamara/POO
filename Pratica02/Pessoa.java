import java.util.Scanner;
public class Pessoa
{
    // variáveis de instância
        String nome;
        String endereco;
        String telefone;
        String cpf;
           
      public void lerDados()
       {
           Scanner s = new Scanner(System.in);
           
           System.out.println("Digite o nome:");
           this.nome = s.nextLine();
           
           System.out.println("Digite o endereço:");
           this.endereco = s.nextLine();
           
           System.out.println("Digite o telefone:");
           this.telefone = s.nextLine();
           
           System.out.println("Digite o CPF:");
           this.cpf = s.nextLine();
       }    
       
       public void mostrarDados() 
       {
           System.out.println("Nome: "+this.nome);
           System.out.println("Endereço: "+this.endereco);
           System.out.println("Telefone: "+this.telefone);
           System.out.println("CPF: "+this.cpf);
       }
}