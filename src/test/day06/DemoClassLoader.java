package test.day06;

import java.net.URL;
import java.net.URLClassLoader;

public class DemoClassLoader/* extends  ClassLoader */{
    public static void main(String[] args) {
        ClassLoader parent = ClassLoader.getSystemClassLoader().getParent();
        System.out.println(parent);
        URL[] urls = ((URLClassLoader) ClassLoader.getSystemClassLoader().getParent()).getURLs();
        for (URL url : urls) {
            System.out.println(url);
        }
    }
}
