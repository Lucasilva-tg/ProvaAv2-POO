package pergunta2;

public class AchadoPerdido implements Publicacao {

    String titulo = "";
    String descricao = "";
    String foto = "";
    String tipo = "";
    String localAchado = "";
    String dataHora = "";
    String status = "";

    public String getTitulo() {
        return titulo;
    }

    public AchadoPerdido(String titulo, String descricao, String tipo, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
    }

    public void completaDados(String foto, String local_achado, String data_hora) {
        this.foto = foto;
    this.localAchado = local_achado;
    this.dataHora =data_hora;
   }

@Override
public String toString() {
    return "AchadoPerdido [titulo=" + titulo + ", descricao=" + descricao + ", foto=" + foto + ", tipo=" + tipo
            + ", local_achado=" + localAchado + ", data_hora=" + dataHora + ", status=" + status + "]";
}

@Override
public boolean buscarTitulo(String titulo) { 
    return this.getTitulo().equals(titulo);

    
}

@Override
public String visualizarDetalhes() {
        return this.toString();
    
}

}