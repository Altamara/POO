import java.util.Scanner;
public class Funcionario
{
       // variáveis de instância   
        String nome;
        String endereco;
        String telefone;
        String cpf;
        String ctps;
        Double salario;

       public void lerDados()
       {
           Scanner s = new Scanner(System.in);
          
           System.out.println("Digite a CTPS do funcionário:");
           this.ctps = s.nextLine();
           System.out.println("Digite o salário do funcionário:");
           this.salario = s.nextDouble();
       }
       
       public void mostrarDados() 
       {
           System.out.println("Nome: "+this.nome);
           System.out.println("Endereço: "+this.endereco);
           System.out.println("Telefone: "+this.telefone);
           System.out.println("CPF: "+this.cpf);
           System.out.println("CTPS: "+this.ctps);
           System.out.println("Salario: "+this.salario);
        }

}
