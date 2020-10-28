package proxy;

import anntation.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class InvocationHandlerDemo {
    public static void main(String[] str){
        //使用Proxy类的getProxyClass静态方法生成一个动态代理类stuProxyClass
        Class<?> stuProxyClass = Proxy.getProxyClass(Person.class.getClassLoader(), new Class<?>[]{Person.class});

        //创建一个InvocationHandler对象
        //InvocationHandler aa = new MyInvocationHandler<Person>(stu);
    }

}
