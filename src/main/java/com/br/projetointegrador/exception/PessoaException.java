package com.br.projetointegrador.exception;

public class PessoaException extends RuntimeException {

    public PessoaException(String message) {
        super(message);
    }

    // Exceção específica para data inválida
    public static class DataNascimentoInvalidaException extends RuntimeException {

        public DataNascimentoInvalidaException(String mensagem) {
            super(mensagem);
        }

        public DataNascimentoInvalidaException(String mensagem, Throwable causa) {
            super(mensagem, causa);
        }
    }
}
