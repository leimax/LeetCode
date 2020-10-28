package proxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StuInvocationHandler<T> implements InvocationHandler {
    //invocationHandler���еı��������
    T target;

    public StuInvocationHandler(T target) {
        this.target = target;
    }

    /**
     * proxy:����̬�������
     * method����������ִ�еķ���
     * args���������Ŀ�귽��ʱ�����ʵ��
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy ��" + method.getName() + " method");

        //��������в����ⷽ��,����÷�����ʱ
        MonitorUtil.start();
        Object result = method.invoke(target, args);
        MonitorUtil.finish(method.getName());
        return result;
    }
}