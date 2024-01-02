import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solution {
    public static List<Integer> sortList(List<Integer> unsortedList) {
        // WRITE YOUR BRILLIANT CODE HERE
        // find the mid of the list
        if (unsortedList == null || unsortedList.size() == 0) {
            return List.of();
        }
        
        // get mid of the list
        int mid = list.size() / 2;
        int midVal = list.get(mid);
        
        // make sure
        for (int i = 0; i < unsortedList.size(); i++) {
            int val = unsortedList.get(i);
            if (val <= midVal) continue;
            if (val > midVal) {
            
            }
        }
        return List.of();
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> unsortedList = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        scanner.close();
        List<Integer> res = sortList(unsortedList);
        System.out.println(res.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
