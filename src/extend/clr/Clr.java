package extend.clr;

import java.net.URL;
import java.net.URLClassLoader;

public class Clr extends URLClassLoader{
    public Clr(URL[] urls) {
        super(urls);
    }
}