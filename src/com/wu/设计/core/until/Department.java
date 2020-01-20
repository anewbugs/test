package com.wu.设计.core.until;

import com.wu.设计.core.Headquarters;
import com.wu.设计.core.IThreadPlan;
import com.wu.设计.core.ThreadImplementer;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author wu
 * 业务部基类
 */
public class Department implements IThreadPlan {
    //当前线程实例
    final static ThreadLocal<Department> currentDepart = new ThreadLocal<>();
    /**线程执行者*/
    private final ThreadImplementer threadImpl;
    /**所属总部*/
    private Headquarters head;
    /**消息队列*/
    private ConcurrentLinkedQueue<Req> reqs = new ConcurrentLinkedQueue<Req>();



    public Department(Headquarters head){
        this.threadImpl = new ThreadImplementer(this);
        this.head = head;
    }

    public static <T extends Department> T getCurrent() {
        return (T) currentDepart.get();
    }

    @Override
    public void runInit() {
        currentDepart.set(this);
    }

    @Override
    public void runPulse() {

    }

    @Override
    public void runUninstall() {
        currentDepart.set(null);
    }
}
