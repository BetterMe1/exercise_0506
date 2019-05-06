package exercise.exercise_0506;

// 时间效率
/*
整数中1出现的次数（从1到n整数中1出现的次数）
题目描述
求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 */
/*
public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        if(n < 0){
            return 0;
        }
        int d = 10;
        int count = 0;
        while(n*10 >= d){
            int tmp = n%d;
            count += ((d/10)*(n/d) + (tmp >= (2*(d/10)-1) ? d/10 :
                    (tmp >= (n/d) ? tmp%(d/10)+1 : 0)));
            d*=10;
        }
        return count;
    }
}
*/

/*
把数组排成最小的数
题目描述
输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
/*
import java.util.*;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        if(numbers.length == 0 || numbers == null){
            return "";
        }
        int len = numbers.length;
        String[] str = new String[len];
        for(int i=0; i<len; i++){
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str,new Comparator<String>(){
            public int compare(String s1,String s2){
                String c1 = s1+s2;
                String c2 = s2+s1;
                return c1.compareTo(c2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<len; i++){
            sb.append(str[i]);
        }
        return sb.toString();
    }
}
*/

//时间空间效率的平衡
/*
第一个只出现一次的字符位置
题目描述
在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
 如果没有则返回 -1（需要区分大小写）.
 */

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        int len = str.length();
        for(int i=0; i<len; i++){
            char a = str.charAt(i);
            if(str.indexOf(a) == str.lastIndexOf(a)){
                return i;
            }
        }
        return -1;
    }
}