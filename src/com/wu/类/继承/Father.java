package com.wu.类.继承;

public class Father {
    public Father() {
        System.out.println(this.getClass());
    }

    public Father(Class clazz) {

    }

    public void put (){
        prit();
    }

    public void prit() {
        System.out.println(this);
    }
}
