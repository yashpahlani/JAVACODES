package JAVArrays;
import java.util.*;
public class Demo13 {
    public static List<List<Integer>> triplet(int n, List<Integer> num) {
        Set<List<Integer>> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (num.get(i) + num.get(j) + num.get(k) == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(num.get(i));
                        temp.add(num.get(j));
                        temp.add(num.get(k));
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
        
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
    
    public static void main(String[] args) {
        int n = 6;
        List<Integer> num = Arrays.asList(1, -3, 2, -2, 3, 0);
        
        List<List<Integer>> result = triplet(n, num);
        
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
