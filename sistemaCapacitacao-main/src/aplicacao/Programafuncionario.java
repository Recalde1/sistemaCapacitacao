package aplicacao;
import java.util.Scanner;
import entidades.SalarioFuncionario;
public class Programafuncionario {
    public static void main(String[] args) {
        SalarioFuncionario salarioFunci = new SalarioFuncionario();
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        salarioFunci.setNome(leia.nextLine());
        System.out.println("Digite o Salario bruto: ");
        salarioFunci.setSalarioBruto(leia.nextDouble());
        System.out.println("Digite o Imposto: ");
        salarioFunci.setImposto(leia.nextDouble());
        System.out.println("Dados do Funcionario: "+salarioFunci.getNome()+", R$: "+salarioFunci.calcularSalario());
        System.out.println("Digite a Porcentagem: ");
        double porcentagem = leia.nextDouble();
        salarioFunci.aumentarSalario(porcentagem);
        System.out.println("Dados atualizados: "+salarioFunci.getNome()+", R$: "+salarioFunci.calcularSalario());
    }
}
