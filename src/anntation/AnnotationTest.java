package anntation;

public class AnnotationTest {

    public static void main(String[] args) {
        try {
            //��ȡPerson��Class����
            Person person = new Person();
            Class clazz = person.getClass();
            //�ж�person�������Ƿ���Infoע��
            if (clazz.isAnnotationPresent(LongOu.class)) {
                System.out.println("Person class set Info annotation��");

                //��ȡ�ö�����Info���͵�ע��
                LongOu infoAnno = (LongOu) clazz.getAnnotation(LongOu.class);
                System.out.println("person.name :" + infoAnno.value() + ",person.isDelete:" + infoAnno.isDelete() );
            } else {
                System.out.println("Person����û������Infoע�⣡");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}