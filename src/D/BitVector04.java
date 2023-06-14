package D;

import java.util.Iterator;

public class BitVector04 extends BitVectorBase implements Iterable {

    @Override
    public Iterator iterator(){
        return new Iterator() {
            int pos = 63;

            @Override
            public boolean hasNext() {
                return pos >= 0;
            }

            @Override
            public Object next() {
                return isSet(pos);
            }
        };
    }

    public static void main(String[] args){
        BitVector01 bitVector01 = new BitVector01();
        bitVector01.setBit(2, true);
        for (Object o : bitVector01){
            System.out.print(((boolean) o) ? 1 : 0);
        }
    }
}
