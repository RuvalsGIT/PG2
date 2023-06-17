package E;

public class CountingNumbersType {
    public static <T> int countingNumbers(T[] array){
        int counter = 0;
        for(T element : array){
            if(element instanceof Number){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Object[] array = {"Hallo", 1, 30.0f, null};
        System.out.println(countingNumbers(array));
    }
}
