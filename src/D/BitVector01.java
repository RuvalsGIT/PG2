package D;

import java.util.Iterator;

public class BitVector01 extends BitVectorBase implements Iterable{
        BitVector01(){super();}
        BitVector01(long init){
            super(init);
        }

        @Override
        public Iterator iterator(){
            return new BitVectorIterator(this);
        }

        public static class BitVectorIterator implements Iterator{
            int pos = 63;

            BitVector01 bitVector01;

            BitVectorIterator(BitVector01 bitVector01){
                this.bitVector01 = bitVector01;
            }

            @Override
            public boolean hasNext(){
                return pos >= 0;
            }

            @Override
            public Object next(){
                return bitVector01.isSet(--pos);
            }
        }

        public static void main(String[] args){
            BitVector01 bitVector01 = new BitVector01();
            bitVector01.setBit(1, true);
            for (Object o : bitVector01){
                System.out.print(((boolean) o) ? 1 : 0);
            }
        }
    }

