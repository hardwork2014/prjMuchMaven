package com.dooioo.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * ThreadPoolExecutor封装类
 * Created by PC-S510 on 14-6-25.
 */
public class MyThreadPoolExcutor extends ThreadPoolExecutor {

    /**
     * 创建线程池
     *corePoolSize
     线程池维护线程的最少数量
     maximumPoolSiz
     线程池维护线程的最大数量
     keepAliveTime
     线程池维护线程所允许的空闲时间
     unit
     线程池维护线程所允许的空闲时间的单位
     workQueue
     线程池所使用的缓冲队列
     handler
     线程池对拒绝任务的处理策略
     一个任务通过 execute(Runnable)方法被添加到线程池，任务就是一个 Runnable类型的对象，任务的执行方法就是 Runnable类型对象的run()方法。

     当一个任务通过execute(Runnable)方法欲添加到线程池时：
     如果此时线程池中的数量小于corePoolSize，即使线程池中的线程都处于空闲状态，也要创建新的线程来处理被添加的任务。
     如果此时线程池中的数量等于 corePoolSize，但是缓冲队列 workQueue未满，那么任务被放入缓冲队列。
     如果此时线程池中的数量大于corePoolSize，缓冲队列workQueue满，并且线程池中的数量小于maximumPoolSize，建新的线程来处理被添加的任务。
     如果此时线程池中的数量大于corePoolSize，缓冲队列workQueue满，并且线程池中的数量等于maximumPoolSize，那么通过 handler所指定的策略来处理此任务。
     也就是：处理任务的优先级为：
     核心线程corePoolSize、任务队列workQueue、最大线程maximumPoolSize，如果三者都满了，使用handler处理被拒绝的任务。

     当线程池中的线程数量大于 corePoolSize时，如果某线程空闲时间超过keepAliveTime，线程将被终止。这样，线程池可以动态的调整池中的线程数。
     * @param corePoolSize
     * @param maximumPoolSize
     * @param keepAliveTime
     * @param unit
     * @param workQueue
     * @param handler
     */
    public MyThreadPoolExcutor(int corePoolSize, int maximumPoolSize,
                               long keepAliveTime, TimeUnit unit,
                               BlockingQueue<Runnable> workQueue,
                               RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, handler);
    }


    public void excuteEnd(){
        super.isShutdown();
        while (super.getPoolSize() > 0){
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
