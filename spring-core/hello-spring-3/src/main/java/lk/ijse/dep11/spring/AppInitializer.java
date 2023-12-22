package lk.ijse.dep11.spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        FileSystemXmlApplicationContext ctx
                = new FileSystemXmlApplicationContext("file:/home/ranjith-suranga/Desktop/beans.xml");

    }
}
