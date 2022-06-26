package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuildHeap {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(10, 5, 20, 2, 4, 8));
        System.out.println("before build heap: " + arr);
        buildHeap(arr);
        System.out.println("after build heap: " + arr);
    }

    private static void buildHeap(ArrayList<Integer> arr) {
        int index = (int) Math.floor((arr.size() - 2) / 2);

        for (int i = index; i >= 0; i--) {
            minHeapify(arr, i);

        }

    }

    private static void minHeapify(List<Integer> list, int i) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        int smallest = i;
        if (leftChild < list.size() && list.get(leftChild) < list.get(i)) {
            smallest = leftChild;
        }
        if (rightChild < list.size() && list.get(rightChild) < list.get(smallest)) {
            smallest = rightChild;
        }
        if (smallest != i) {
            Collections.swap(list, smallest, i);
            minHeapify(list, smallest);
        }

    }

}
