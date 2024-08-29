package OOPs.generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE =  10;
    private int size = 0;

    public CustomArrayList(){
        data = new int[DEFAULT_SIZE];
    }
    public CustomArrayList(int MyDefaultSize){
        data = new int[MyDefaultSize];
    }
    public void add(int value){
        if (full()) {
            resize();
        }
        data[size++] = value; 
    }
    
    private void resize() {
       int[] temp = new int[data.length*2];
       for (int i = 0; i < data.length; i++) {
        temp[i] = data[i];
       }
       data = temp;
    }
    private boolean full() {
        if (size==data.length) {
            return true;
        }
        return false;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public void set(int index, int value){
        data[index] = value;
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "{List = "+ Arrays.toString(data) + " }" + " size = " + size();
    }
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();

        CustomArrayList list = new CustomArrayList();
        list.add(1);

        for (int i = 1; i < 18; i++) {
            list.add(2*i);
        }
        System.out.println(list);

    }
}
