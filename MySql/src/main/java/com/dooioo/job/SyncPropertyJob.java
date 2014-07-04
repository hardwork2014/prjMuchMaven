package com.dooioo.job;

import com.dooioo.syncInterface.SyncInterface;
import com.dooioo.thread.JobMain;
import org.springframework.stereotype.Component;

/**
 * Created by PC-S510 on 14-6-25.
 */
@Component
public class SyncPropertyJob implements SyncInterface{

    @Override
    public void syncBetch(JobMain.SYNCENUM type) {

    }
}
