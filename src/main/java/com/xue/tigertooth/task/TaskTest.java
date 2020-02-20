package com.xue.tigertooth.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by xueqi on 2020-02-11 15:56
 */
@Component
@Slf4j
public class TaskTest {
    @Scheduled(cron = "0/10 * * * * ?")
    public void tast1(){
        log.info("定时任务");
    }
}
