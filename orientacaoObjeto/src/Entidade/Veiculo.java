package Entidade;
public class Veiculo {
    private String motor;
    private String cor;
    private Double fabricante;
    // abstracao

    public Veiculo(){};

    public Veiculo(String motor){
        this.motor = motor;

    }

    public Veiculo(String motor, String cor, Double fabricante) {
        this.motor = motor;
        this.cor = cor;
        this.fabricante = fabricante;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getFabricante() {
        return fabricante;
    }

    public void setFabricante(Double fabricante) {
        this.fabricante = fabricante;
    }

}
