package Heap;

import java.util.ArrayList;

public class HeapMax<T extends Comparable<T>> {
    private ArrayList<T> list;

    public HeapMax() {
        list = new ArrayList<>();
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    public void insert(T value) {
        list.add(value);
        upheap(list.size() - 1);
    }

    private void upheap(int index) {
        if (index == 0) {
            return;
        }
        int p = parent(index);
        if (list.get(index).compareTo(list.get(p)) > 0) {
            swap(index, p);
            upheap(p);
        }
    }

    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("list is empty");
        }
        T temp = list.get(0);
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }
        return temp;
    }

    private void downheap(int index) {
        int max = index;
        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(max).compareTo(list.get(left)) < 0) {
            max = left;
        }
        if (right < list.size() && list.get(max).compareTo(list.get(right)) < 0) {
            max = right;
        }
        if (max != index) {
            swap(max, index);
            downheap(max);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }

    //If we are given array of element then first add all the element of the array in the list of heap and then heapify 
    public void buildMaxHeap(T[] arr) {
        // Add all elements to the heap list
        for (T value : arr) {
            list.add(value);
        }
        // Perform max downheap starting from the last non-leaf node
        for (int i = list.size() / 2 - 1; i >= 0; i--) {
            downheap(i);
        }
    }
}

