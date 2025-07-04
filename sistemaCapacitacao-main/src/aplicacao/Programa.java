package aplicacao;
import entidades.Curso;
import entidades.ServidorPublico;
import entidades.Curso;
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

//    List<ServidorPublico> servidores = new ArrayList<>();
 ////  List<Curso> cursos = new ArrayList<>();public void adicionarServidorPublico() {
        //excluirServidorPublico( int matricula);
//        calcularFolhaServidoresPublicos();
//
        public static void main(String[] args) {
            ServidorPublico servidorPublico  = new ServidorPublico();

            servidorPublico.adicionarServidor();;
            servidorPublico.adicionarServidor();
            servidorPublico.listarServidores();

            servidorPublico.listarServidores(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matricula que deseja pesquisar")));servidorPublico.listarServidores(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matricula que deseja pesquisar")));
            servidorPublico.excluirServidores(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matricula a ser excluída")));
        }


    }