package com.br.projetointegrador.exception;

<<<<<<< HEAD
=======

>>>>>>> ffe3fcaa6d3ac4df9c0b23da6dfe499fb8b5e90d
public class CarroException extends RuntimeException {
    public CarroException(String message) {
        super(message);
    }

    public class CarroInvalidoException extends RuntimeException{
        public CarroInvalidoException (String mensagem){
            super (mensagem);
        }
        public CarroInvalidoException(String mensagem, Throwable causa){
            super(mensagem, causa);
        }
    }
}
