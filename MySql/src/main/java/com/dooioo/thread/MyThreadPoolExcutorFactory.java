package com.dooioo.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 创建线程工厂
 * Created by PC-S510 on 14-6-25.
 */
public class MyThreadPoolExcutorFactory {
    public static MyThreadPoolExcutor createPoolExcutor(){
        return new MyThreadPoolExcutor(10,20,5, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(10),
                new ThreadPoolExecutor.DiscardOldestPolicy());
    }

}
