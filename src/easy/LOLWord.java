package easy;

/**
 * @Author someone
 * @Classname LOLWord
 * @Description This Class is for excise
 * @Date 2020/6/1 下午2:52
 * @Created by someone
 * @Version 1.0
 */
public class LOLWord {
    public static int lengthOfLastWord(String s) {
        int p = s.length() - 1;
        while (p >= 0 && s.charAt(p) == ' ') {
            p--;
        }
        int end = p;
        while (p >= 0 && s.charAt(p) != ' ') {
            p--;
        }
        return end - p;
    }

    public static void main(String[] args) {
        String s ="qweqwe qweqweq";
        System.out.println(lengthOfLastWord(s));
    }
}
