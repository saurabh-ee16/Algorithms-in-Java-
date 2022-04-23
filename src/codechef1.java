import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import resursionAndDp.CoinChange;

public class codechef1 {

	public static void main(String[] args) {
	
		List<Integer> list= new ArrayList<Integer>(Arrays.asList(1,2,3,1000));
		int k=4;
		List<Long> res=bestCombo(list, k);
		System.out.println(res);	
		
	}

	public static List<Long> bestCombo(List<Integer> popularity, int k) {
		TreeSet<Integer> set = new TreeSet<>();
		List<Long> result = new ArrayList<>();

		for (int i = 0; i < popularity.size(); i++) {

			if (!set.contains(popularity.get(i)))
				set.add(popularity.get(i));
			int sum = popularity.get(i);

			for (int j = i + 1; j < popularity.size(); j++) {

				sum += popularity.get(j);

				if (!set.contains(sum)) {
					set.add(sum);
				}

			}

		}

		List<Integer> list = new ArrayList<>(set);
		for (int i = list.size() - 1; i >= list.size() - k; i--) {
			result.add((Long.valueOf(list.get(i))));
		}

		return result;
	}

}

