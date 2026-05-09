package StackAndQueue;
import java.util.*;

//1 Approch=> using 1 queue.

public class ImplementationOfStackUsingQueue {
    Queue<Integer> q;

    public ImplementationOfStackUsingQueue() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);

        // Rotate queue to bring new element to front
        for(int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

// 2 Approch => Using 2 Queue.

class ImplementationOfStackUsingQueue2 {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public ImplementationOfStackUsingQueue2() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        // Step 1: add new element to q2
        q2.add(x);

        // Step 2: move all elements from q1 → q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Step 3: swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
