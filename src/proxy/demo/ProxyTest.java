package proxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {

        //����һ��ʵ��������������Ǳ�����Ķ���
        Person zhangsan = new Student("zhangsan");

        //����һ�����������������InvocationHandler
        InvocationHandler stuHandler = new StuInvocationHandler<Person>(zhangsan);

        //����һ���������stuProxy������zhangsan����������ÿ��ִ�з��������滻ִ��Invocation�е�invoke����
        Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, stuHandler);

        //����ִ���Ͻ���ѵķ���
        stuProxy.giveMoney();
    }
}