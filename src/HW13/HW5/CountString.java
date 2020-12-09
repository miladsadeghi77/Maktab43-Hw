package HW13.HW5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountString {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Amir", "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali",
                "Davood", "Reza", "Mohsen");
        Map<Integer, List<String>> countByLength = name.stream()
                .collect(Collectors.groupingBy(S->S.length()));
        System.out.println(countByLength);
    }
}
