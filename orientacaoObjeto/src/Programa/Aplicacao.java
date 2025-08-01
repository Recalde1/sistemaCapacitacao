package Programa;
import Entidade.Onibus;
import Entidade.Veiculo;
public class Aplicacao {
    public static void main(String[] args) {
        // Instanciamento objeto
        Veiculo carro = new Veiculo();

        carro.setMotor("V12"); //encapsulamento
        System.out.println(carro.getMotor()); // pegando o motor

        Veiculo carro1 = new Veiculo();
        System.out.println(carro1.getMotor());

        Onibus onibus = new Onibus();
        onibus.setAssentos(46);
        onibus.setMotor("V16");
        System.out.println(onibus.getAssentos());
        System.out.println(onibus.getMotor());




    }
}
