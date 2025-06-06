package aplicacao;
import java.util.Scanner;
import entidades.Produto;
public class ProgramaProduto{
        public static void main(String[] args) {
            Produto produto = new Produto();
            Scanner leia = new Scanner(System.in);
            System.out.println("Digite o nome: ");
            produto.setNome(leia.nextLine());
            System.out.println("Digite o preço: ");
            produto.setPreco(leia.nextDouble());
            System.out.println("Digite a quantidade no estoque: ");
            produto.setQntd(leia.nextInt());
            System.out.println("Dados do Produto no estoque: "+ produto.repeticao());
            System.out.println("Quantos produtos quer adicionar: ");
            System.out.println("Adicionar produto: ");
            produto.adicionarProduto(leia.nextInt());
            System.out.println("Dados do Produto no estoque: "+ produto.repeticao());
            System.out.println("Remover produto: ");
            produto.removerProduto(leia.nextInt());
            System.out.println("Dados do Produto no estoque: "+ produto.repeticao());


        }
}



