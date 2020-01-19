package com.wu.设计.core;

/**
 * 线程处理程序
 * @author wu
 */
public class ThreadHandler extends Thread{
    /**心跳间隔*/
    private static final int INTERVAL = 20;
    /**线程执行计划*/
    private IThreadPlan plan;
    /**线程运行标志*/
    private volatile boolean runFlag = false;
    /**线程中断标志*/
    private volatile boolean waitFlag = false;

}
