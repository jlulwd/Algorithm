package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author someone
 * @Classname Roman2Integer
 * @Description This Class is for
 * @Date 2020/5/29 上午6:38
 * @Created by someone
 * @Version 1.0
 */
public class Roman2Integer {
    public static int roman2Int(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length();
        int sum = map.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; --i) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                sum -= map.get(s.charAt(i));
            } else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        System.out.println(roman2Int(line));
    }
}
