package atividade;

public class Principal{

    public static void main(String[] args){
        Notificacao not = new Notificacao("Primeiro Exemplo");

        NotificacaoSMS sms = new NotificacaoSMS("Segundo Exemplo");

        not.enviar();
        sms.enviar();
    }
}