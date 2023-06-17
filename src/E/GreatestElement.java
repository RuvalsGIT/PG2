package E;
//Aufgabe E.1
public class GreatestElement {
    public static <T extends Comparable<T>> T findGreatest(T[] arr){
    T greatest = arr[0];

    for(T element : arr){
        if(element.compareTo(greatest) > 0){
            greatest = element;
        }
    }
    return greatest;
    }

    public static void main(String[] args) {
        Integer [] intArr = {10,20,50,60};
        Float [] floatArr = {(float)12.5, (float)40.3, (float)12.3, (float)60.0};
        String [] stringArr = {"AA", "BB", "ZZ"};

        System.out.println(findGreatest(intArr));
        System.out.println(findGreatest(floatArr));
        System.out.println(findGreatest(stringArr));

    }
}
