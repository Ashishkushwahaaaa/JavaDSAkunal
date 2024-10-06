package Heap;

import java.util.ArrayList;

public class HeapMin<T extends Comparable<T>> {
    private ArrayList<T> list;
    public HeapMin(){
        list = new ArrayList<>();
    }
    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
    private int parent(int index){
        return (index-1)/2;
    }
    private int left(int index){
        return index*2 + 1;
    }
    private int right(int index){
        return index*2+2;
    }
    public void insert(T value){
        list.add(value);
        upheap(list.size() - 1);
    }
    private void upheap(int index){
        if(index==0){
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p))<0){
            swap(index, p);
        }
        upheap(p); 
    }

    //O(logN);
    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("list is empty");
        }
        T temp = list.get(0); //Just getting the value of first element
        T last = list.remove(list.size()-1); //Actually removes the last element from the heap(arraylist);
        if(!list.isEmpty()){ //After removing, if list become empty, means if we set it to 0th index it means we have set it back to index from where we have removed, hence item will not be deleted(so we will set only it list is not empty);
            list.set(0, last);
            downheap(0);
        }
        return temp;
    }
    private void downheap(int index){
        int min = index;
        int left = left(index);
        int right = right(index);

        if (left<list.size() && list.get(min).compareTo(list.get(left))>0) {
            min = left;
        }
        if (right<list.size() && list.get(min).compareTo(list.get(right))>0) {
            min = right;
        }
        if(min!=index){
            swap(min, index);
            downheap(min);
        }
    }
    //HEAPSORT : O(N(logN)); n item to be removed and each removal takes logN time;
    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> data = new ArrayList<>();
        while(!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }
}
