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
         * ������
         newScale - Ҫ���ص� BigDecimal ֵ�ı�ȡ�
         roundingMode - ҪӦ�õ�����ģʽ��
         ���أ�
         һ�� BigDecimal������Ϊָ��ֵ����Ǳ��ֵ����ͨ���� BigDecimal �ķǱ��ֵ���Ի����ʮ���ʵ�������ȷ����
         */
        double f1 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(f1);




        NumberFormat percent = NumberFormat.getPercentInstance();
            percent.setMaximumFractionDigits(2);


        System.out.println("main end" + percent.format(f1));

    }

}