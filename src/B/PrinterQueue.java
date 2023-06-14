package B;

//Aufgabe B2
public class PrinterQueue {

    private final static PrinterQueue INSTANCE = new PrinterQueue();
    private PrinterQueue(){
    }
    public static PrinterQueue getInstance(){
        return INSTANCE;
    }

    public static void print(String txt){
        System.out.println("Printing job: " + txt);
    }

    public static void main(String[] args) {
        PrinterQueue pq = PrinterQueue.getInstance();
        PrinterQueue.print("Hello World");
    }
}
