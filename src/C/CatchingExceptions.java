package C;
//Aufgabe C2
public class CatchingExceptions {
    private int erroneousMethod(int p){
        if (p== 0){
            throw new IllegalArgumentException();
        }
        int x = 0x01;
        return p / (x >> Math.abs(p));
    }

    public void catchExceptions(int passthrough){
        try {
            erroneousMethod(passthrough);
        }
        catch(IllegalArgumentException e){
            System.err.println("exception catched");
        }
        catch (ArithmeticException a){
            System.err.println("exception catched");
        }
    }

    public static void main(String[] args) {
        CatchingExceptions catchingExceptions = new CatchingExceptions();
        catchingExceptions.catchExceptions(-5);
        catchingExceptions.catchExceptions(5);
        catchingExceptions.catchExceptions(0);
    }
}
