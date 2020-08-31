package extend.clr;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        System.out.println("Starting。。。。。。");
        //D:\oldcode\JavaDemo\out\production\JavaDemo
        //javafx.collections.transformation.SortedList.Main
        try{
            URL u = new URL("file:/D:/");
            URL []urls ={u};

            File f = new File(u.toURI());
            System.out.println(u.toURI().toString());
            System.out.println(f.exists());
            Clr cl = new Clr(urls);
            System.out.println(3+ cl.toString());
            System.out.println(4+ cl.getURLs().toString()+ Arrays.toString(cl.getURLs()));
            Class<?> cls = cl.loadClass("Main");
            System.out.println(cls);
            Object o = cls.newInstance();
            System.out.println(o);
            System.out.println(o.getClass().getClassLoader());
            System.out.println(Test.class.getClassLoader());
            
            
        }catch (MalformedURLException e){
            System.out.println(e);
        } catch (ClassNotFoundException e) {

        } catch (InstantiationException e) {

        } catch (IllegalAccessException e) {

        } catch (URISyntaxException e) {

        }


    }
}