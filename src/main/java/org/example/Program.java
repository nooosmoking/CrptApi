package org.example;
import java.util.concurrent.TimeUnit;

public class Program {
    public static void main(String[] args) {
        CrptApi api = new CrptApi(TimeUnit.MINUTES, 10);
        while (true){
            api.createDocument(new Document(), "111");
        }
    }
}
