package exceptions;

public class EmailException extends RuntimeException {

    public EmailException(){
        super("El email es inválido");
    }

    public EmailException(String message){
        super(message);
    }
}
