package com.wu.注解.枚举和接口;

import com.sun.corba.se.impl.orbutil.closure.Constant;
import org.omg.IOP.ENCODING_CDR_ENCAPS;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface EAnn {

    Service.Day key() ;
}
