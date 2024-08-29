package OOPs.generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE =  10;
    private int size = 0;

    public CustomGenArrayList(){
        data = new Object[DEFAULT_SIZE];
    }
    public CustomGenArrayList(int MyDefaultSize){
        data = new Object[MyDefaultSize];
    }
    public void add(T value){
        if (full()) {
            resize();
        }
        data[size++] = value; 
    }
    
    private void resize() {
       Object[] temp = new Object[data.length*2];
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

    public T remove(){
        T removed = (T)data[--size];
        return removed;
    }
    public T get(int index){
        return (T)data[index];
    }
    public void set(int index, T value){
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

        CustomGenArrayList<String> list = new CustomGenArrayList<>();
        list.add("Ashish");

        for (int i = 1; i < 18; i++) {
            list.add(""+2*i);
        }
        System.out.println(list);

    }
}
