import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CodeChef {

    public static void main(String[] args) {
        int N = 3;
        String str = "aci";
        int Q = 4;
        int range[][] = { { 1, 1 }, { 1, 2 }, { 1, 3 }, { 2, 2 } };
        int arr[] = { 3, 1, 2 };

        int res = goodString(N, str, Q, range, arr);
        System.out.println(res);
    }

    private static int goodString(int n, String str, int q, int[][] range, int[] arr) {
        StringBuilder sb = new StringBuilder(str);
        int totalOperations = 0;

        if (isDistinct(sb, range))
            return totalOperations;

        for (int i = 0; i < arr.length; i++) {
            sb.setCharAt(arr[i] - 1, '_');
            System.out.println(sb);
            totalOperations++;
            if (isDistinct(sb, range)) {
                break;
            } else {
                continue;
            }

        }

        return totalOperations;
    }

    private static boolean isDistinct(StringBuilder sb, int[][] range) {
        Set<Character> set = new HashSet<>();
        /*
         * HashMap<Integer, Boolean> map = new HashMap<>();
         * 
         * for (int i = 0; i < range.length; i++) {
         * map.put(i, false);
         * }
         */

        for (int i = 0; i < range.length; i++) {
            int l = range[i][0];
            int r = range[i][1];
            set.clear();
            String subString = sb.substring(l - 1, r);
            for (char ch : subString.toCharArray()) {
                if (ch != '_') {
                    if (set.contains(ch))
                        return false;
                    set.add(ch);
                }
            }
        }
        return true;
    }
}
