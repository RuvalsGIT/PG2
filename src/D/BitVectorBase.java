package D;

public class BitVectorBase {
    private long value;

    public final int MAX = 63;
    public final int MIN = 0;

    public BitVectorBase(){

    }
    public long getValue(){
        return value;
    }
    public void setValue( int value){
        this.value = value;
    }

    public BitVectorBase(long initialValue){

    }
    public boolean isSet(int bit){
        long buffer = 1;
        buffer = buffer << bit;
        return (buffer & this.value) > 0;
    }
    public void setBit(int bit, boolean value){
        rangeCheck(bit);
        long buffer = 1;
        buffer = buffer << bit;
        long full = Long.MAX_VALUE;

        if (value) {
            this.value = this.value | buffer;
        }
        else {
            full = full ^ buffer;
            this.value = this.value & full;
        }
    }

    public void rangeCheck(int bit){
        if(bit > MAX || bit < MIN){
            throw new IllegalArgumentException("Argument bit is out of range. Valid range 0-63");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BitVectorBase that = (BitVectorBase) o;

        return value == that.value;
    }

    @Override
    public int hashCode() {
        return (int) (value ^ (value >>> 32));
    }
}
