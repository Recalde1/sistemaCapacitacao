package entidades;
public class Produto {
    private String nome;
    private double preco;
    private int qntd;
    private double valorTotal;

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularvalorTotal() {
        double quantidade = this.qntd * preco;
        return (quantidade);
    }
   public void adicionarProduto(int quantidade){
       this.qntd += quantidade;
   }
    public void removerProduto(int quantidade) {
        this.qntd -= quantidade;
    }
    public String repeticao() {
        return nome

        + ",$ "
                + String.format("%.2f", preco)
                + ", "
                + qntd
                + " units, total: $"
                + String.format("%.2f", calcularvalorTotal());
    }
}