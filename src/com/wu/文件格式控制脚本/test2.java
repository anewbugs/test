package com.wu.文件格式控制脚本;

import java.io.File;

public class test2 {
    public static void main(String[] args) throws Throwable{
        String filePath ="D:\\WordControl_new\\";
        String fileWritePath = filePath +"_new.doc";
        File fileWrite = new File(fileWritePath);
        if(!fileWrite.exists()){
            fileWrite.getParentFile().mkdirs();
        }
        fileWrite.createNewFile();
    }
}
