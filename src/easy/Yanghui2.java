package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author someone
 * @Classname Yanghui2
 * @Description This Class is for excise
 * @Date 2020/6/8 下午5:02
 * @Created by someone
 * @Version 1.0
 */
public class Yanghui2 {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < rowIndex; i++) {
            res.add(1);
            for (int j = i - 1; j > 0; --j) {
                res.set(j, res.get(j - 1) + res.get(j));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getRow(5));
    }
}
