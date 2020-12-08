package demo;

import java.util.HashMap;

public class Tests {
    public static void main(String[] str){
        Object ob = 1;
        int h = 1;
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("css1",1);
        map.put("css2",2);
        map.put("css3",3);


        map.get("css3");

        System.out.println("[1]:"+(ob.hashCode()) );
        System.out.println("[1]:"+( 1^h       ) );
        System.out.println("[2]:"+(h >> 4));
        System.out.println("[3]:"+(h >>> 4));
    }
}