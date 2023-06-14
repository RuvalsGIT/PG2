package D;

import java.util.Iterator;

public class BitVector03 extends BitVectorBase implements Iterable {

    @Override
    public Iterator iterator(){
        class BitVectorIterator implements Iterator{

            int pos = 63;

            @Override
            public boolean hasNext(){
                return pos >= 0;
            }

            @Override
            public Object next(){
                return isSet(pos--);
            }
        }
        return new BitVectorIterator();
    }

}