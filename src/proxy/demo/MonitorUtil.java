package proxy.demo;

public class MonitorUtil {
    private static ThreadLocal<Long> tl = new ThreadLocal<>();

    public static void start() {
        tl.set(System.currentTimeMillis());
    }

    //����ʱ��ӡ��ʱ
    public static void finish(String methodName) {
        long finishTime = System.currentTimeMillis();
        System.out.println(methodName + "times:" + (finishTime - tl.get()) + "ms");
    }
}