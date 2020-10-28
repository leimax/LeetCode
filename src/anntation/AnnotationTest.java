package anntation;

public class AnnotationTest {

    public static void main(String[] args) {
        try {
            //获取Person的Class对象
            Person person = new Person();
            Class clazz = person.getClass();
            //判断person对象上是否有Info注解
            if (clazz.isAnnotationPresent(LongOu.class)) {
                System.out.println("Person class set Info annotation！");

                //获取该对象上Info类型的注解
                LongOu infoAnno = (LongOu) clazz.getAnnotation(LongOu.class);
                System.out.println("person.name :" + infoAnno.value() + ",person.isDelete:" + infoAnno.isDelete() );
            } else {
                System.out.println("Person类上没有配置Info注解！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}