package F;

public class Queue<E> {
    private int capacity;
    private int size;
    private E[] elements;
    private int first;
    private int last;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.elements = (E[]) new Object[capacity];
        this.first = 0;
        this.last = -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void add(E data) {
        if (isFull()) {
            throw new QueueException("Queue is full!");
        }
        last = (last + 1) % capacity;
        elements[last] = data;
        size++;
    }

    public E remove() {
        if (isEmpty()) {
            throw new QueueException("Queue is empty!");
        }
        E data = elements[first];
        first = (first + 1) % capacity;
        size--;
        return data;
    }

    public E[] toArray() {
        E[] array = (E[]) new Object[size];
        for (int i = 0; i < size; i++) {
            array[i] = elements[(first + i) % capacity];
        }
        return array;
    }
}
class MergeQueues {
    public static <E> Queue<E> merge(Queue<E> queue1, Queue<E> queue2) {
        Queue<E> resultQueue = new Queue<>(queue1.getCapacity() + queue2.getCapacity());

        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            if (!queue1.isEmpty()) {
                resultQueue.add(queue1.remove());
            }
            if (!queue2.isEmpty()) {
                resultQueue.add(queue2.remove());
            }
        }

        return resultQueue;
    }

    public static void main(String[] args) {
            Queue<Integer> queue1 = new Queue<>(5);
            Queue<Integer> queue2 = new Queue<>(7);

            queue1.add(1);
            queue1.add(3);
            queue1.add(5);
            queue1.add(7);
            queue1.add(9);

            queue2.add(2);
            queue2.add(4);
            queue2.add(6);
            queue2.add(8);
            queue2.add(10);
            queue2.add(12);
            queue2.add(14);

            Queue<Integer> resultQueue = MergeQueues.merge(queue1, queue2);

            Object[] resultArray = resultQueue.toArray();
            for (Object element : resultArray) {
                System.out.print(element + " ");
            }
        }
    }


class QueueException extends RuntimeException{

    public QueueException(String txt){
        super("Queue Error: " + txt);
    }
}
