import java.util.*;

public class MaxHeap {
    static void convertToMaxHeap(int[] heap) {

        int n = heap.length;

        // Start from the last non-leaf node
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapifyDown(heap, i, n);
        }
    }

     static void heapifyDown(int[] heap, int i, int n) {

        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check left child
        if (left < n && heap[left] > heap[largest]) {
            largest = left;
        }

        // Check right child
        if (right < n && heap[right] > heap[largest]) {
            largest = right;
        }

        // If child is larger, swap
        if (largest != i) {

            int temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;

            // Continue heapifying
            heapifyDown(heap, largest, n);
        }
    }

    public static void main(String[] args) {

        int[] heap = {1, 3, 2, 7, 6, 4};

        convertToMaxHeap(heap);

        System.out.println(Arrays.toString(heap));
    }
}
