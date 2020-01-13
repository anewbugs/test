package com.wu.注解.test;

import javax.swing.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
public class UseCase {

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE})
    public @interface UseCases  {
        public String id() ;
        public String description() default "no description";
    }

    public @interface a {}
}
