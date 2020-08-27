package question3;

import java.util.HashMap;

/**
 * Hash+双指针滑动窗口 o(n)
 */
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;//左索引
        int right = 0;//右索引
        int len = 0;//最大长度
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            //获取当前char值
            Integer index = map.get(s.charAt(right));
            //map中防止字符，索引放入map
            map.put(s.charAt(right), right);
            //索引不为空 并且索引大于等于左下标
            if (index != null && index >= left) {
                left = index + 1;//设置新左下标+1
            }

            if (right - left + 1 > len) {
                len = right - left + 1;
            }
            right++;
        }
        return len;
    }

    public static void main(String[] args){
        int i = Solution.lengthOfLongestSubstring("abcabce");
        System.out.println("[length]:"+i);



    }



}
