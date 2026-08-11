class MinHeap {

    ArrayList<Integer> heap = new ArrayList<>();

    // Left child index
    int getLeftChildIndex(int i) {
        return 2 * i + 1;
    }

    // Right child index
    int getRightChildIndex(int i) {
        return 2 * i + 2;
    }

    // Parent index
    int getParentIndex(int i) {
        return (i - 1) / 2;
    }

    // Insert
    void insert(int val) {
        heap.add(val);
        heapifyUp(heap.size() - 1);
    }

    // Heapify Up
    void heapifyUp(int i) {

        while (i > 0) {

            int parent = getParentIndex(i);

            if (heap.get(i) < heap.get(parent)) {

                Collections.swap(heap, i, parent);

                i = parent;
            }
            else {
                break;
            }
        }
    }

    // Peek - return minimum without removing
    Integer peek() {

        if (heap.size() < 1) {
            return null;
        }

        return heap.get(0);
    }

    // Extract Minimum
    Integer extract() {

        if (heap.size() < 1) {
            return null;
        }

        int min = heap.get(0);

        int lastIndex = heap.size() - 1;

        // Swap root with last
        Collections.swap(heap, 0, lastIndex);

        // Remove last
        heap.remove(lastIndex);

        // Restore heap property
        heapifyDown(0);

        return min;
    }

    // Heapify Down
    void heapifyDown(int i) {

        int left = getLeftChildIndex(i);
        int right = getRightChildIndex(i);

        int last = heap.size() - 1;

        int smallest = i;

        // Check left child
        if (left <= last &&
                heap.get(left) < heap.get(smallest)) {

            smallest = left;
        }

        // Check right child
        if (right <= last &&
                heap.get(right) < heap.get(smallest)) {

            smallest = right;
        }

        // Swap if child is smaller
        if (smallest != i) {

            Collections.swap(heap, smallest, i);

            heapifyDown(smallest);
        }
    }

    public static void main(String[] args) {

        MinHeap heap = new MinHeap();

        heap.insert(5);
        heap.insert(10);
        heap.insert(20);
        heap.insert(30);
        heap.insert(1);
        heap.insert(0);

        System.out.println(heap.heap);

        System.out.println("Peek: " + heap.peek());

        System.out.println("Extracted: " + heap.extract());

        System.out.println("After extract: " + heap.heap);

        System.out.println("Peek: " + heap.peek());
    }
}