package pergunta1;

import java.util.ArrayList;

public class RedeSocial {
    String datCriacao;
    String username;
    String datNascimento;
    String password;
    ArrayList<Publicacao> listaPublicacao = new ArrayList<Publicacao>();

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.datCriacao = dataCriacao;
        this.username = nomeUsuario;
        this.datNascimento = dataNascimento;
        this.password = senha;
    }

    public String getDataCriacao() {
        return datCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.datCriacao = dataCriacao;
    }

    public String getNomeUsuario() {
        return username;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.username = nomeUsuario;
    }

    public String getDataNascimento() {
        return datNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.datNascimento = dataNascimento;
    }

    public String getSenha() {
        return password;
    }

    public void setSenha(String senha) {
        this.password = senha;
    }

    public ArrayList<Publicacao> getListaPublicacao() {
        return listaPublicacao;
    }

    public void setListaPublicacao(ArrayList<Publicacao> listaPublicacao) {
        this.listaPublicacao = listaPublicacao;
    }

    public void inserePublicacao(Publicacao publi) {
        listaPublicacao.add(publi);
    }

    public void imprimePublicacoes() {
        System.out.println("total de publicacoes " + Publicacao.contadorPublicacao);
        for (Publicacao publi : listaPublicacao) {
            System.out.println(publi);
        }

    }

}
