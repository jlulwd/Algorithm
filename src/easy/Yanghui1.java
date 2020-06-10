package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author someone
 * @Classname Yanghui
 * @Description This Class is for excise
 * @Date 2020/6/4 下午5:37
 * @Created by someone
 * @Version 1.0
 */
public class Yanghui1 {

    public static List<List<Integer>> generate(int numRows)    {
        if(numRows==0)  {
            return Collections.emptyList();
        }
        List<List<Integer>> list=new ArrayList<>();
        for (int i = 0; i <= numRows; i++) {
            List<Integer> sub=new ArrayList<>();
            for (int j = 0; j <=i; j++) {
                if(j==0||j==i)  {
                    sub.add(1);
                } else  {
                    List<Integer> upSub=list.get(i-1);
                    sub.add(upSub.get(j-1)+upSub.get(j));
                }
            }
            list.add(sub);
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
