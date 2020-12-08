package jdk.java8;

public class LandbdaTest {

    public static  void main(String[] str ){
        mathOperate interf = (int n,int m)-> n+m ;

        mathOperate returninfo = (int a, int b) -> {return a * b;};

        System.out.println(returninfo.mathnum(2,5));

    }




    interface mathOperate{
        int mathnum(int n,int m);
    }
}