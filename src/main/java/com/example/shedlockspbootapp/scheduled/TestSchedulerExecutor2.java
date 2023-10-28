package com.example.shedlockspbootapp.scheduled;

import net.javacrumbs.shedlock.core.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class TestSchedulerExecutor2 {

    @Scheduled(cron = "0 0/15 * * * ?")
    @SchedulerLock(name = "TaskScheduler_scheduledTask2",
            lockAtLeastForString = "PT2S", lockAtMostForString = "PT3S")
    public void scheduledTask() throws InterruptedException {
        Logger.getAnonymousLogger().info("Hi!!");
        Thread.sleep(5_000);
        Logger.getAnonymousLogger().info("Hi!!");
    }
}