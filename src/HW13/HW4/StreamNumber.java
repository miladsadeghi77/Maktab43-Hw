package HW13.HW4;

import java.util.ArrayList;

public class StreamNumber {
    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(3);
        nums.add(5);
        nums.add(1);
        nums.stream()
                .filter(val->val>1)
                .forEach(val-> System.out.println(val));
    }
}
