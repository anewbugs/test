package com.wu.注解.枚举和接口;

public class Service {
    public enum Day implements IEmun{
        M(1),
        T(2);
        int index;
        Day(int index){
            this.index = index;
        }
        public int getIndex(){
            return  index;
        }

    }

    static final Day day = Day.M;
    @EAnn(key = Day.M)
    int x;
}
