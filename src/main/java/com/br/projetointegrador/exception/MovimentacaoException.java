package com.br.projetointegrador.exception;

public class MovimentacaoException extends RuntimeException {
    public MovimentacaoException(String message) {
        super(message);
    }
    public static class MovimentacaoInvalidaException extends RuntimeException {

        public MovimentacaoInvalidaException(String mensagem) {
            super(mensagem);
        }

        public MovimentacaoInvalidaException(String mensagem, Throwable causa) {
            super(mensagem, causa);
        }
    }
}
