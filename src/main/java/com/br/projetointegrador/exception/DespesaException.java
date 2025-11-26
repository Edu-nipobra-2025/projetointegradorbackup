package com.br.projetointegrador.exception;

public class DespesaException extends RuntimeException {
    public DespesaException(String message) {
        super(message);
    }

    public static class DespesaInvalidaException extends RuntimeException {
        public DespesaInvalidaException(String mensagem) {
            super(mensagem);
        }

        public DespesaInvalidaException(String mensagem, Throwable causa) {
super (mensagem, causa);
        }
    }
}