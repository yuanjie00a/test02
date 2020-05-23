package test.day02;

import java.io.UnsupportedEncodingException;

/*×Ö·û´®Ç°ºó×ª»»*/
public class Test01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String a="abcdefghjkliasa";
        char[] chars = a.toCharArray();
        byte[] bytes = a.getBytes();
        for ( byte b:bytes
             ) {
            System.out.print(b);
        }
        String s1 = new String(bytes, "UTF-8");
        System.out.println(s1);
        System.out.println(a.length());
        char[] c=new char[a.length()];
      for (int i = 0; i <a.length(); i++) {
          c[a.length()-1-i]=chars[i];

        }
        System.out.println(c);
        String s = String.valueOf(c);
    }


}
