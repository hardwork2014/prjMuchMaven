package com.dooioo.thread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.dooioo.thread.JobMain.SYNCENUM;
/**
 * Created by PC-S510 on 14-6-25.
 */
@Component
public class SyncMain {

    @Autowired
    private JobMain jobMain;

    @Scheduled(cron = "0 0 13 ? * *")
    public void syncPropertyJob() throws Exception{
        jobMain.syncBetch(SYNCENUM.Property);
    }

}
