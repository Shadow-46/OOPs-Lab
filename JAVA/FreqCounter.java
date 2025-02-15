import java.util.Arrays;
public class FreqCounter{
  public static void Freqcounter(int arr[], int n){
    boolean visited[] = new boolean[n];
    Arrays.fill(visited, false);
    for (int i ; i < n ; i++) {
      if (visited[i] == true) continue;
      int c = 0;
      boolean test = Arrays.asList(arr).contains(
      