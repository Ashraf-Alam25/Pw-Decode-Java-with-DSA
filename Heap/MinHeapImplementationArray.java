class MinHeap{
    int arr[];
    int size;

    MinHeap(int capacity) {
        arr = new int[capacity];
        size = 0;
    }
    public void add(int num) throws Exception{
        if(size == arr.length) throw new Exception("Heap is full");
        arr[size++] = num;
        upheapify(size-1);
    }
    public void upheapify(int idx){
        int parent = (idx-1)/2;
        if(arr[idx] < arr[parent]){
            swap(idx,parent);
            upheapify(parent);
        }
    }
    public void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    public int peek() throws Exception{
        if(size == 0) throw new Exception("heap is empty");
        return arr[0];
    }
    public int size(){
        return size;
    }
    public int remove() throws Exception{
        if(size == 0) throw new Exception("heap is empty");
        int peek = arr[0];
        swap(0, size-1);
        size--;
        downheapify(0);
        return peek;
    }
    public void downheapify(int i){
        if(i>=size) return;
        int lc = 2*i + 1;
        int rc = 2*i + 2;
        int minIdx = i;
        if(lc<size && arr[lc] < arr[minIdx]) minIdx = lc;
        if(rc<size && arr[rc] < arr[minIdx]) minIdx = rc;
        if(i == minIdx) return;
        swap(i, minIdx);
        downheapify(minIdx);

    }
}
class MinHeapImplementationArray {
    public static void main(String[] args) throws Exception {
        MinHeap pq = new MinHeap(10);
        // System.out.println(pq.size()+" "+pq.peek());
        pq.add(1);
        pq.add(5);
        pq.add(25);
        pq.add(0);
        System.out.println(pq.size()+" "+pq.peek());
        pq.remove();
        System.out.println(pq.size()+" "+pq.peek());

    }
}