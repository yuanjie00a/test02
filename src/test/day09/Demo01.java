package test.day09;

/**
 * @ProjectName: Test03
 * @Author: YuanJie
 * @CreateDate: 2020-06-12 10:32
 * @Description: ภเหตร๗
 */
public class Demo01 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer aaaaa = stringBuffer.append("aaaaa");
        System.out.println(stringBuffer.length());
        System.out.println(aaaaa.length());
        System.out.println(stringBuffer==aaaaa);
        System.out.println(stringBuffer.equals(aaaaa));
    }
}
