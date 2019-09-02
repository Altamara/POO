import java.util.Scanner;
public class Tecnico extends Funcionario
{
    // variáveis de instância 
        String cargo;
        String departamento;

     public void lerDados()
       {
           super.lerDados();
           Scanner s = new Scanner(System.in);
           
           System.out.println("Digite o cargo do tecnico:");
           this.cargo = s.nextLine();
           
           System.out.println("Digite o departamento do tecnico:");
           this.departamento = s.nextLine();
           
       
       }
       
       public void mostrarDados()
       {
           super.mostrarDados();
           System.out.println("Cargo: "+this.cargo);
           System.out.println("Departamento: "+this.departamento);
           
       
       }
}
