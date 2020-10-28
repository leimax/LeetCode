package extend.agent;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class TestMain {
    public static void main(String[] args) throws ClassNotFoundException{
//        System.out.println("main start");
//        try {
//            Thread.sleep(3000);
//            StringMethod stringMethod = (StringMethod)Class.forName("extend.agent.StringMethod").newInstance();
//            stringMethod.getInfo();
//            //TestMain.convertToAbbr();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//
//        } catch (IllegalAccessException e) {
//
//        }

            Double aa = 17.123;
        BigDecimal bg = new BigDecimal(aa);
        /**
         * 参数：
         newScale - 要返回的 BigDecimal 值的标度。
         roundingMode - 要应用的舍入模式。
         返回：
         一个 BigDecimal，其标度为指定值，其非标度值可以通过此 BigDecimal 的非标度值乘以或除以十的适当次幂来确定。
         */
        double f1 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(f1);




        NumberFormat percent = NumberFormat.getPercentInstance();
            percent.setMaximumFractionDigits(2);


        System.out.println("main end" + percent.format(f1));

    }

}