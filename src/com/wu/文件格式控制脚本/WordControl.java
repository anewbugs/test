package com.wu.文件格式控制脚本;

import java.io.*;
import java.util.Scanner;

public class WordControl {
    public static void main(String[] args) throws Throwable {
        Scanner input = new Scanner(System.in);
        //文件名
        String fileName = input.nextLine();
        //文件路径
        String filePath ="D:\\WordControl\\";

        //读取文件路径
        String fileReadPath = filePath +fileName.trim() +".txt";
        File fileRead = new File(fileReadPath);
        //文件读取流
        FileInputStream fis = new FileInputStream(fileRead);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);


        //写入文件创建
        String fileWritePath = filePath +fileName.trim() +"_new.txt";
        File fileWrite = new File(fileWritePath);
        if(!fileWrite.exists()){
            fileWrite.getParentFile().mkdirs();
        }
        fileWrite.createNewFile();
        //文件写入流
        FileOutputStream fos = new FileOutputStream(fileWrite);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);






        String line = "";
        String temp="";
        char A = 'A';
        while ((line = br.readLine()) != null) {
           String[] str = line.split("、");
           if (str[0].equals(A+"")){
               temp +=line;
               A++;
           }else if(A != 'A'){
               bw.write(temp);
               bw.newLine();
               bw.write(line);
               bw.newLine();
               A='A';
               temp = "";
           }else if (str.length == 1 && str[0].matches("[0-9]+")){
               temp = line;
           }else{
               bw.write(temp+line);
               bw.newLine();
               temp="";
           }


        }


        br.close();
        isr.close();
        fis.close();

        bw.close();
        osw.close();
        fos.close();


    }
}
