package com.wu.设计.core.until;

/**
 * @author wu
 * 执行计时器
 */
public class Watch {
    private long startTime = 0;
    private long endTiem = 0;

    /**
     * 开始计时
     */
    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    /**
     * 结束计时
     */
    public void stop(){
        this.endTiem = System.currentTimeMillis();
    }

    /**
     * @return 计时间隔
     */
    public long getTime(){
        return endTiem - startTime;
    }

    /**
     * 重置时间间隔
     */
    public void reset(){
        startTime = 0;
        endTiem = 0;
    }
}
