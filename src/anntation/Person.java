package anntation;


@LongOu(isDelete = true,value = "css")
public class Person {

    /**
     * ����
     */
    private String name;

    /**
     * ����
     */
    private String address;

    /**
     * ����
     */
    private int age;

    /**
     * �Ƿ���Ч
     */
    private boolean isDelete;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }
}