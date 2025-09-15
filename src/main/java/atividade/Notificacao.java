package atividade;

public class Notificacao{
    private String mensagem;

    protected void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }

    public String getMensagem(){
        return this.mensagem;
    }

    public void enviar(){
        System.out.println("Enviando mensagem: " + this.getMensagem());
    }

    public Notificacao(String mensagem){
        this.setMensagem(mensagem);
    }
}