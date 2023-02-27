import java.util.LinkedList;

public class CircularLinked<T> implements QueueInterface<T> {
LinkedList<T> queue = new LinkedList<T>();



    @Override
    public void push(T item) {
    queue.offer(item);

    }

    @Override
    public T pop() {

        return queue.poll();
    }

    @Override
    public T front() {


        return queue.peek();
    }

    @Override
    public T back() {

        return queue.removeLast();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean empty() {
        return queue.isEmpty();
    }
}
