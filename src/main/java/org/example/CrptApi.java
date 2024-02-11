package org.example;
import java.util.*;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CrptApi {
        TimeUnit timeUnit;
        Semaphore semaphore;
        int requestLimit;
        public CrptApi(TimeUnit timeUnit, int requestLimit){
            this.timeUnit = timeUnit;
            this.semaphore = new Semaphore(0);
            this.requestLimit = requestLimit;

            Timer timer = new Timer();
            timer.schedule(new TimerTask(){
                               @Override
                               public void run() {
                                   semaphore.release(requestLimit - semaphore.availablePermits());
                               }},
                    0, timeUnit.toMillis(1));
        }

        public void createDocument(Document document, String signature){
            try{
                semaphore.acquire();
                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.setTimeZone(TimeZone.getTimeZone("Asia/Irkutsk"));
                String jsonDocument = objectMapper.writeValueAsString(document);
                System.out.println(jsonDocument);
            } catch (InterruptedException | JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
    }

