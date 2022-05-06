package trees;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapSort {

    public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("MOCK_DATA.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                list.add(Integer.valueOf(line));
            }

        } catch (FileNotFoundException e) {

            System.out.println(e.getMessage());
        }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        heapSort(arr);
        System.out.println("Heap sort : " + Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {

        buildHeap(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            maxHeapify(arr, 0, i);

        }

    }

    private static void buildHeap(int[] arr) {
        int size = arr.length;
        int index = (int) Math.floor((size - 2) / 2);

        for (int i = index; i >= 0; i--) {
            maxHeapify(arr, i, arr.length);

        }

    }

    private static void maxHeapify(int[] arr, int i, int size) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        int largest = i;

        if (leftChild < size && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }
        if (rightChild < size && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        if (largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            maxHeapify(arr, largest, size);
        }

    }

}
