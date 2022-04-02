/*
 * import java.util.ArrayList; import java.util.Arrays; import
 * java.util.Collections; import java.util.Comparator; import
 * java.util.Iterator; import java.util.List;
 * 
 * public class ActivitySelectionProblem {
 * 
 * public static void main(String[] args) { List<Activity> activities = new
 * ArrayList<>( List.of(new Activity(12, 25), new Activity(10, 20), new
 * Activity(20, 30)));
 * 
 * int res = maxActivity(activities); System.out.println(Arrays.asList(res));
 * 
 * }
 * 
 * private static int maxActivity(List<Activity> list) {
 * 
 * Collections.sort(list, new Comparator<Activity>() {
 * 
 * @Override public int compare(Activity o1, Activity o2) { return
 * o1.getFinishTime() - o2.getFinishTime(); } });
 * 
 * System.out.println(list);
 * 
 * int res = 1;
 * 
 * 
 * for (Iterator<Activity> iterator = list.iterator(); iterator.hasNext();) {
 * Activity prev = (Activity) iterator.next(); Activity curr= iterator.next();
 * if(prev.getFinishTime()>=curr.getStartTime()) { res++; prev=curr;
 * 
 * }
 * 
 * }
 * 
 * }
 * 
 * class Mycmp implements Comparator<Activity> {
 * 
 * @Override public int compare(Activity o1, Activity o2) { return
 * o1.getFinishTime() - o2.getFinishTime(); }
 * 
 * }
 * 
 * class Activity { private int startTime; private int finishTime;
 * 
 * public Activity(int startTime, int finishTime) { super(); this.startTime =
 * startTime; this.finishTime = finishTime; }
 * 
 * public int getStartTime() { return startTime; }
 * 
 * public void setStartTime(int startTime) { this.startTime = startTime; }
 * 
 * public int getFinishTime() { return finishTime; }
 * 
 * public void setFinishTime(int finishTime) { this.finishTime = finishTime; }
 * 
 * @Override public String toString() { return "Activity [startTime=" +
 * startTime + ", finishTime=" + finishTime + "]"; }
 * 
 * } }
 */