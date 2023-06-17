package E;

public class Pairs<K extends Comparable<K>, V> implements Comparable<Pairs<K,V>>{
    private K key;
    private V value;

    public Pairs(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }
    public void setKey(K key){
        this.key = key;
    }
    public V getValue(){
        return value;
    }
    public void setValue(V value){
        this.value = value;
    }

    @Override
    public int compareTo(Pairs<K, V> o) {
        return this.key.compareTo(o.key);
    }

    public static <K extends Comparable<K>, V> Pairs<K,V> findSmallest(Pairs<K,V>[] pairs){
        if(pairs.length == 0){
            throw new IllegalArgumentException("Array is Empty!");
        }
        Pairs<K,V> smallest = pairs[0];
        for(Pairs<K,V> element : pairs){
            if(smallest.compareTo(element) > 0){
                smallest = element;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Pairs p1 = new Pairs(3,"Vale");
        Pairs p2 = new Pairs(5, "Zoe");
        Pairs p3 = new Pairs(1, "Prog2");

        Pairs[] pArr = {p1, p2, p3};
        System.out.println(findSmallest(pArr).value);

    }
}
