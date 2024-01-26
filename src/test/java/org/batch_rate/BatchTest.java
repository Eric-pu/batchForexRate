package org.batch_rate;

import lombok.extern.slf4j.Slf4j;
import org.batch_rate.schedule.ScheduleBatch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@Slf4j
@SpringBootTest
public class BatchTest {

    @Autowired
    ScheduleBatch scheduleBatch;

    /**
     * 直接啟動批次處理
     * @throws Exception
     */
    @Test
    void BatchApiJob() throws Exception {

        Assertions.assertTrue(scheduleBatch.instantStartBatch());

    }

}
