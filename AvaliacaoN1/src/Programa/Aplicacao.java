package Programa;
import Entidades.Conta;
import javax.swing.*;

public class Aplicacao {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do Titular: ");
        Integer numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero da conta: "));
       int resposta = JOptionPane.showConfirmDialog(null, "Deseja realiar um depósito?");
   Conta conta;
    if(resposta == 0) {
        Double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe" +
                "o valor a ser depositado: "));
        conta = new Conta(nome, numero, valor);
    }
    else {
       conta = new Conta(nome, numero);

    }
    JOptionPane.showMessageDialog(null, "conta"+conta);

    Double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do deposito"));
    conta.depositar(valor);

    valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do saque"));
    conta.sacar(valor);
    JOptionPane.showMessageDialog(null, ""+conta);

    nome = JOptionPane.showInputDialog(null, "Informe o nome do Titular: ");
    numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero da conta: "));
    resposta = JOptionPane.showConfirmDialog(null, "Deseja realiar um depósito?");
        Conta conta2;
        if(resposta == 0) {
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe" +
                    "o valor a ser depositado: "));
            conta2 = new Conta(nome, numero, valor);
        }
        else {
            conta2 = new Conta(nome, numero);

        }
        JOptionPane.showMessageDialog(null, "conta"+conta2);

    valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da transferencia? "));
    conta.transferir(conta2, valor);
    }
}
