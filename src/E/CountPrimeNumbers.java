package E;

public class CountPrimeNumbers {
    public static <T> boolean isPrime(Number x){
        if (x.doubleValue() < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(x.doubleValue()); i++)
            if (x.doubleValue() % i == 0)
                return false;

        return true;
    }

    public static <T> int primeNumbersCounter(Number[] arr){
        int primeCounter = 0;
        for(int i = 0; i < arr.length; i++){
            if(isPrime(arr[i])){
                primeCounter++;
            }
        }
        return primeCounter;
    }

    public static void main(String[] args) {
        Integer[] intArr = {5, 4, 10, 7, 8, 9, 13};
        System.out.println(primeNumbersCounter(intArr));

        Float[] floatArr = {5.0f, 4.0f, 10.0f, 7.0f,8.0f, 9.0f, 13.0f };
        System.out.println(primeNumbersCounter(floatArr));
        
    }
}
