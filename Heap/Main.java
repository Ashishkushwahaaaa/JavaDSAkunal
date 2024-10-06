package Heap;

public class Main {
    public static void main(String[] args) throws Exception{
        
        //MINHEAP ***************************>>>>>>>>>>>>>>>>>>
        // HeapMin<Integer> heap = new HeapMin<>();
        // heap.insert(2);
        // heap.insert(23);
        // heap.insert(13);
        // heap.insert(29);
        // heap.insert(16);

        // System.out.println(heap.remove());
        // System.out.println(heap.remove());
         
        // System.out.println(heap.heapSort());


        //MAXHEAP ***************************>>>>>>>>>>>>>>>>>>
        HeapMax<Integer> heap = new HeapMax<>();
        Integer[] arr = new Integer[]{4,6,2,9,12,19,3,15,54,45};
        heap.buildMaxHeap(arr);
        System.out.print(heap.remove());
        System.out.print(" " +heap.remove());
        System.out.print(" " +heap.remove());
        System.out.println();

        // for (int ele : heap.heapSort()) {
        //     System.out.print(ele +" ");
        // }
        System.out.println(heap.heapSort());
    }
}
