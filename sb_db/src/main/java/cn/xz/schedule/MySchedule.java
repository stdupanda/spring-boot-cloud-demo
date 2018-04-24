package cn.xz.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MySchedule {

    private static final Logger log = LoggerFactory.getLogger(MySchedule.class);

    @Scheduled(cron = "0/30 * * * * ?")
    public void aaa() {
        log.debug("MySchedule @Scheduled {}", System.nanoTime());
    }
}
