public class PriorityQueue {
    //Traditional Method of using Priority Queue even though there is already Built in pq is available in the JAVA
    import java.util.*;

    class PriorityQueueTraditional {

        class Node {
            int value;
            int priority;

            Node(int value, int priority) {
                this.value = value;
                this.priority = priority;
            }
        }

        ArrayList<Node> queue = new ArrayList<>();

        // Enqueue
        void enqueue(int value, int priority) {

            queue.add(new Node(value, priority));

            // Highest priority first
            queue.sort((a, b) -> b.priority - a.priority);
        }

        // Dequeue
        Node dequeue() {

            if (queue.isEmpty()) {
                return null;
            }

            return queue.remove(0);
        }

        // Peek
        Node peek() {

            if (queue.isEmpty()) {
                return null;
            }

            return queue.get(0);
        }

        // Size
        int size() {
            return queue.size();
        }

        // Is Empty
        boolean isEmpty() {
            return queue.isEmpty();
        }
    }
    //Second approch of doing PQ Using MAx Heap
    /*
class MaxPriorityQueue {

    class Node {
        int value;
        int priority;

        Node(int value, int priority) {
            this.value = value;
            this.priority = priority;
        }
    }

    Node[] heap = new Node[100];
    int size = 0;

    // Enqueue
    void enqueue(int value, int priority) {

        heap[size] = new Node(value, priority);

        heapifyUp();

        size++;
    }

    // Move node upward
    void heapifyUp() {

        int index = size;

        while (index > 0) {

            int parent = (index - 1) / 2;

            if (heap[index].priority <= heap[parent].priority) {
                break;
            }

            swap(index, parent);

            index = parent;
        }
    }

    // Dequeue highest priority
    Node dequeue() {

        if (size == 0) {
            return null;
        }

        Node max = heap[0];

        heap[0] = heap[size - 1];

        heap[size - 1] = null;

        size--;

        if (size > 0) {
            heapifyDown();
        }

        return max;
    }

    // Move node downward
    void heapifyDown() {

        int index = 0;

        while (true) {

            int left = 2 * index + 1;
            int right = 2 * index + 2;

            int largest = index;

            if (left < size &&
                heap[left].priority > heap[largest].priority) {

                largest = left;
            }

            if (right < size &&
                heap[right].priority > heap[largest].priority) {

                largest = right;
            }

            if (largest == index) {
                break;
            }

            swap(index, largest);

            index = largest;
        }
    }

    // Peek
    Node peek() {

        if (size == 0) {
            return null;
        }

        return heap[0];
    }

    // Size
    int getSize() {
        return size;
    }

    // Is Empty
    boolean isEmpty() {
        return size == 0;
    }

    // Swap
    void swap(int i, int j) {

        Node temp = heap[i];

        heap[i] = heap[j];

        heap[j] = temp;
    }
}
    * */
}
