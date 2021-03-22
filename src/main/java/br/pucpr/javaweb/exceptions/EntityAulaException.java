package br.pucpr.javaweb.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EntityAulaException extends RuntimeException{

        private String campo;
        private Object valor;
        private String mensagem;

        public EntityAulaException (String campo, Object valor, String mensagem){
            this.campo=campo;
            this.valor=valor;
            this.mensagem =mensagem;
        }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
