package aplicacao;
import entidades.Curso;
import entidades.ServidorPublico;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Programa {


//        ServidorPublico isabela = new ServidorPublico();
//        isabela.setNome("Isabela");
//        isabela.setCargo("Auditor");
//        isabela.setOrgao("ANVISA");
//        isabela.setLotacao("Brasilia");
//        isabela.setEmail("isabela@gmail.");


//        System.out.println("Servidor: "+ isabela.getNome());

    List<ServidorPublico> servidores = new ArrayList<>();
    List<Curso> cursos = new ArrayList<>();

    public void adicionarServidorPublico() {
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a Matrícula do Servidor: "));
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do Servidor");
        String orgao = JOptionPane.showInputDialog(null, "Informe o órgão do Servidor");
        String cargo = JOptionPane.showInputDialog(null, "Informe o cargo do Servidor");
        String lotacao = JOptionPane.showInputDialog(null, "Informe o lotação do Servidor");
        String email = JOptionPane.showInputDialog(null, "Informe o email do Servidor");
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário do Servidor"));

        ServidorPublico servidor = new ServidorPublico(matricula, nome, orgao, cargo, lotacao, email, salario);

        servidores.add(servidor);
    }

    public void listarServidoresPublicos(String nome) {
        boolean encontrou = false;
        for (ServidorPublico servidor : servidores) {
            if (servidor.getNome() == nome) {
                System.out.println(servidor);
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            JOptionPane.showMessageDialog(null, "Servidor não encontrado!!!!");

        }
    }

//        listarServidoresPublicos();
//        ListarServidorPublico(int matricula);
//        alterarServidor\publico(ServidorPublico servidor);
//        excluirServidorPublico(int matricula);
    public static void main(String[] args) {
            Programa programa = new Programa();
            programa.adicionarServidorPublico();
            programa.adicionarServidorPublico();
            programa.listarServidoresPublicos();
            programa.listarServidoresPublicos(JOptionPane.showInputDialog(null, "Informe a matricula que deseja pesquisar: "));
        }
        private void listarServidoresPublicos(){

        }
    }


