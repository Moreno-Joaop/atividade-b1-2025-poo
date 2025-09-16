package atividade;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Livro extends Midia{
    private String titulo;
    private String editora;
    private int numeroPaginas;

    @Override
    public String getInformacoes(){
        String mensagem = "Título: " + this.getTitulo();
        mensagem += "Autor: "+ this.getAutor();

        return mensagem;
    }
}
