package C;

public class ArgumentNegativeException extends RuntimeException {
    public ArgumentNegativeException(){
    super();
    }
    public ArgumentNegativeException(String message){
        super(message);
    }
    public ArgumentNegativeException(String message, Throwable ursache){
        super(message, ursache);
    }
}
