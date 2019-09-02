import java.util.Scanner;
public class Funcionario extends Pessoa
{
       // variáveis de instância   
        String ctps;
        Double salario;

       public void lerDados()
       {
           super.lerDados();
           
           Scanner s = new Scanner(System.in);
           
           System.out.println("Digite a CTPS do funcionário:");
           this.ctps = s.nextLine();
           
           System.out.println("Digite o salário do funcionário:");
           this.salario = s.nextDouble();
       }
       
       public void mostrarDados() 
       {
           super.mostrarDados();
           
           System.out.println("CTPS: "+this.ctps);
           System.out.println("Salario: "+this.salario);
        }

}
