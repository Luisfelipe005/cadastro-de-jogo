package com.jogos.cadastrodejogo.exception;

import org.springframework.http.HttpStatus;

public class ErrorMessage{
  private int httpStatus;
  private String erro;
  private String mensagem;

    public ErrorMessage(int httpStatus, String erro, String mensagem) {
        this.httpStatus = httpStatus;
        this.erro = erro;
        this.mensagem = mensagem;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
