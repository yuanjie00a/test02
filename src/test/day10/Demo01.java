package test.day10;

/**
 * @ProjectName: Test03
 * @Author: YuanJie
 * @CreateDate: 2020-06-18 15:18
 * @Description: ภเหตร๗
 */
public class Demo01 {
    public static void main(String[] args) {
        String a="abcdefg";
        char[] chars = a.toCharArray();
        String b;
        char[] chars1 = new char[a.length()];
      for (int i=0;i<a.length();i++){
          chars1[a.length()-i-1]=chars[i];
      }
    /*  for (char c: chars1){
          System.out.println(c);
      }*/
        String s = String.valueOf(chars1);
        System.out.println(s);
        System.out.println(s.length());
    }
}
