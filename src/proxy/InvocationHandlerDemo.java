package proxy;

import anntation.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class InvocationHandlerDemo {
    public static void main(String[] str){
        //ʹ��Proxy���getProxyClass��̬��������һ����̬������stuProxyClass
        Class<?> stuProxyClass = Proxy.getProxyClass(Person.class.getClassLoader(), new Class<?>[]{Person.class});

        //����һ��InvocationHandler����
        //InvocationHandler aa = new MyInvocationHandler<Person>(stu);
    }

}
