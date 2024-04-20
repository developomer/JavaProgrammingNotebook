package day38_exceptions.shapeTask;

public class InvalidShareException extends RuntimeException{

    public InvalidShareException(String message){
        super(message);
    }

}
