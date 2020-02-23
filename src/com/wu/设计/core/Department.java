package com.wu.设计.core;

import com.wu.设计.Service;
import com.wu.设计.core.messagepack.Req;

import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author wu
 * 业务部基类
 */
public class Department implements IThreadPlan {

    //todo  日志
    /**当前线程实例*/
    final static ThreadLocal<Department> currentDepart = new ThreadLocal<>();
    /**线程执行者*/
    private final ThreadImplementer threadImpl;


    /**当前业务描述*/
    private Headquarters head;
    private String DepartmentId;

    /**最新一条消息的ID*/
    private long newReqID;

    /**下属服务*/
    private Map<String, Service> services = new ConcurrentHashMap<>();

    /**请求处理栈*/
    private LinkedList<Req> reqActiveStack = new LinkedList<>();

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
