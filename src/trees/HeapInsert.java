package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HeapInsert {

    public static void main(String[] args) {
        // parent = [i-1/2] , leftChild = 2i+1 , rightChild = 2i+2
        ArrayList<Integer> arrlist = new ArrayList<>(List.of(10, 20, 15, 40, 50, 100, 25, 45));

        heapInsert(arrlist, 12);
        System.out.println(arrlist);

    }

    private static void heapInsert(List<Integer> arrlist, int num) {
        arrlist.add(num);
        int parent = (int) Math.floor((arrlist.size() - 2) / 2);
        for (int i = arrlist.size() - 1; i != 0 && arrlist.get(parent) > arrlist.get(i);) {
            Collections.swap(arrlist, parent, i);
            i = parent;
            parent = (int) Math.floor((i - 1) / 2);
        }

    }

}
