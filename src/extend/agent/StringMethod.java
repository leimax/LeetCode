package extend.agent;

public class StringMethod {
    public String getInfo(){
        System.out.println("[getInfo]:");
        return "------------нч╡н---------------";
    }

    public int print(int i){
        System.out.println("[i]:"+i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i+1;
    }

    public int count(int i){
        System.out.println("[cnt]:"+i);
        try {
            Thread.sleep(500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i+1;
    }

    /*public static void main(String[] args) {
        System.out.println("main start");
        StringMethod sm = new StringMethod();
        int cnt = 0;
        for(int i=0;i<20;i++){
            if(++cnt%2 == 0){
                i=sm.print(i);
            }else{
                i=sm.count(i);
            }
        }
        System.out.println("main end");
    }*/

}