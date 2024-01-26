package org.batch_rate.schedule;


import lombok.extern.slf4j.Slf4j;
import org.batch_rate.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ScheduleBatch {

    @Autowired
    BatchService batchService;

    @Scheduled(cron = "0 0 18 * * ?")
    public boolean startBatch() throws Exception {
        try {
            batchService.insertExchangeRate();

            return true;
        } catch (Exception e){
            log.error(e.getMessage());
            e.printStackTrace();
            return false;
        }

    }

    public boolean instantStartBatch() throws Exception {
        try {
            batchService.insertExchangeRate();

            return true;
        } catch (Exception e){
            log.error(e.getMessage());
            e.printStackTrace();
            return false;
        }

    }

}
