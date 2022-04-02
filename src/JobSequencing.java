import java.util.Comparator;
import java.util.Vector;

public class JobSequencing {

	public static void main(String[] args) {

		Vector<Job> vector = new Vector<Job>();
		vector.add(new Job(2, 100));
		vector.add(new Job(2, 60));
		vector.add(new Job(3, 20));
		vector.add(new Job(2, 30));
		
		double start,end;
		
	
		start=System.nanoTime();
		
		vector.sort(new Comparator<Job>() {
			@Override
			public int compare(Job o1, Job o2) {
				return o2.getJobProfit() - o1.getJobProfit();
			}

		});

		calculateProfit(vector, vector.size());
		
		end=System.nanoTime();
		System.out.println((end-start)/1000000000);

	}

	private static void calculateProfit(Vector<Job> vector, int size) {
		boolean slot[] = new boolean[size];
		Vector<Job> resultList = new Vector<Job>();
		resultList.setSize(size);
	
		
		
		int profit = 0;
		// Iterate through all given jobs
		for (int i = 0; i < size; i++) {

			// Find a free slot for this job
			// (Note that we start
			// from the last possible slot)

			for (int j = Math.min(size, vector.get(i).getJobDeadline()) - 1; j >= 0; j--) {

				if (slot[j] == false) {
					resultList.setElementAt(vector.get(i), j);
					profit += vector.get(i).getJobProfit();
					slot[j] = true;
					break;
				}

			}


		}
		
		System.out.println(resultList);
		System.out.println("maximum profit: " + profit);
		return;

	}

}

class Job {

	private int jobDeadline;
	private int jobProfit;

	public Job(int jobDeadline, int jobProfit) {
		super();
		this.jobDeadline = jobDeadline;
		this.jobProfit = jobProfit;
	}

	public int getJobDeadline() {
		return jobDeadline;
	}

	public void setJobDeadline(int jobDeadline) {
		this.jobDeadline = jobDeadline;
	}

	public int getJobProfit() {
		return jobProfit;
	}

	public void setJobProfit(int jobProfit) {
		this.jobProfit = jobProfit;
	}

	@Override
	public String toString() {
		return "Job [jobDeadline=" + jobDeadline + ", jobProfit=" + jobProfit + "]";
	}

}
