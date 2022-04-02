import java.util.Comparator;
import java.util.Vector;

public class FractionalKnapsack {

	public static void main(String[] args) {

		Vector<Item> list = new Vector<Item>();
		list.add(new Item(10, 60));
		list.add(new Item(40, 40));
		list.add(new Item(20, 100));
		list.add(new Item(30, 120));

		int knapsackWeight = 50;

		list.sort(new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				return o2.getValue() * o1.getWeight() - o1.getValue() * o2.getWeight();

			}

		});

		calculateFractionalknapsack(list, knapsackWeight);

	}

	private static void calculateFractionalknapsack(Vector<Item> list, int knapsackWeight) {
		double fractionalValue = 0;
		double fractionalWeight = 0;

		for (Item i : list) {
			int weight = i.getWeight();
			int value = i.getValue();

			if (fractionalWeight == knapsackWeight)
				break;

			else if (knapsackWeight - fractionalWeight >= weight) {
				fractionalWeight += weight;
				fractionalValue += value;
			} else {
				double ratio = (knapsackWeight - fractionalWeight) / weight;
				fractionalWeight += ratio * weight;
				fractionalValue += ratio *value;

			}
		}

		System.out.println("fractionalWeight=" + fractionalWeight + " , " + "fractionalValue=" + fractionalValue);

	}

}

class Item {

	private int weight;
	private int value;

	public Item(int weight, int value) {
		super();
		this.weight = weight;
		this.value = value;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Item [weight=" + weight + ", value=" + value + "]";
	}

}
