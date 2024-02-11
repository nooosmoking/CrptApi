package org.example;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

    public class CrptApi {
        TimeUnit timeUnit;
        Semaphore semaphore;
        int requestLimit;
        public CrptApi(TimeUnit timeUnit, int requestLimit){
            this.timeUnit = timeUnit;
            this.semaphore = new Semaphore(requestLimit);
            this.requestLimit = requestLimit;

            Timer timer = new Timer();
            timer.schedule(new TimerTask(){
                               @Override
                               public void run() {
                                   semaphore.release(requestLimit-semaphore.availablePermits());
                               }},
                    timeUnit.toMillis(1));
        }

        public void createDocument(Document document, String signature){
            try{
                semaphore.acquire();
                System.out.println("a");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

