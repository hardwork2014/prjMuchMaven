package com.dooioo.thread;

import com.dooioo.job.SyncPropertyJob;
import com.dooioo.syncInterface.SyncInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by PC-S510 on 14-6-25.
 */
@Component
public class JobMain implements SyncInterface{

    @Autowired
    private SyncPropertyJob syncPropertyJob;

    public enum SYNCENUM{
        Property
    };

    @Override
    public void syncBetch(SYNCENUM type) {

    }

    private SyncInterface getSyncServer(SYNCENUM type ) throws Exception{
        switch(type){
            case Property:
                return syncPropertyJob;
            default:
                throw new Exception("==========================wrong syncType");
        }
    }



}
