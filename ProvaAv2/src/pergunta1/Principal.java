package pergunta1;

import java.util.Date;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {

        String datCriacao = new Date().toString();
        String username = JOptionPane.showInputDialog("Escreva seu nome ");
        String datNascimento = JOptionPane.showInputDialog("Escreva sua data de nascimento ");
        String password = JOptionPane.showInputDialog("Escreva sua senha ");

        RedeSocial rede1 = new RedeSocial(datCriacao, username, datNascimento, password);

        String datPublicacao = new Date().toString();
        String textoPublicacao = JOptionPane.showInputDialog("Escreva o texto da publicacao");
        String linksMideia = JOptionPane.showInputDialog("Escreva o links da publicação");

        Publicacao publi = new Publicacao(datPublicacao, textoPublicacao, linksMideia);

        datPublicacao = new Date().toString();
        textoPublicacao = JOptionPane.showInputDialog("Escreva o texto da publicacao");
        linksMideia = JOptionPane.showInputDialog("Escreva links da publicação");

        publi = new Publicacao(datPublicacao, textoPublicacao, linksMideia);

        rede1.inserePublicacao(publi);

        rede1.imprimePublicacoes();
    }
}