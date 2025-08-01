package Entidade;

public class Onibus extends Veiculo {
    private Integer assentos;

    public Onibus() {
    }

    public Onibus(Integer assentos) {
        this.assentos = assentos;
    }

    public Onibus(String motor, Integer assentos) {
        super(motor);
        this.assentos = assentos;
    }
    public Onibus(String motor, String cor, Double fabricante, Integer assentos) {
        super(motor, cor, fabricante); // super é um co
        this.assentos = assentos;
    }

    public Integer getAssentos() {

        return assentos;
    }

    public void setAssentos(Integer assentos) {

        this.assentos = assentos;
    }
}

