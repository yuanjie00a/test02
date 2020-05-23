package test.day01;

public class Test05 {
    public static void main(String[] args) {
        System.out.println(getAll(4));
    }
    public  static int getAll(int a){
        if(a>2) {
            return getAll(a - 1) + getAll(a - 2);
        }else {
            return 1;
        }
    }
}
