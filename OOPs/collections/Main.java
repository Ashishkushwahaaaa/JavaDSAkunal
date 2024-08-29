package OOPs.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(2);
        list2.add(4);
        list2.add(6);
        System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(3);
        vector.add(8);
        vector.add(4);
        System.out.println(vector);
    }
}
