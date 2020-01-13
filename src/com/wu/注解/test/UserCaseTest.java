package com.wu.注解.test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.wu.注解.test.UseCase.*;

public class UserCaseTest {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(args);
        }
        List<Integer> useCases = new ArrayList<Integer>();
        Collections.addAll(useCases, 47, 48, 49, 50);

    }


    public static void trackUseCases(List<Integer> useCases, Class<?> cl) {


        for (Method m : cl.getDeclaredMethods()) {
            //获得注解的对象
            UseCase.UseCases uc = m.getAnnotation(UseCases.class);
            if (uc != null) {
                System.out.println("Found Use Case:" + uc.id() + " "
                        + uc.description());
                System.out.println( useCases.remove(new Integer(uc.id())));

            }
        }
        for (int i : useCases) {
            System.out.println("Warning: Missing use case-" + i);
        }
    }
}
