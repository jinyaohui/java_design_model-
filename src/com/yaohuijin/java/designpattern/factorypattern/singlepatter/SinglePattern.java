package com.yaohuijin.java.designpattern.factorypattern.singlepatter;

/*public class SinglePattern {
    private static SinglePattern  single = new SinglePattern();
    private SinglePattern(){

    }
    public SinglePattern getInstance(){
        return single;
    }
}*/

/*public class SinglePattern {
    private static SinglePattern single;

    private SinglePattern() {

    }

    public SinglePattern getInstance() {
        if (single == null) {
            return new SinglePattern();
        }
        return single;
    }
}*/

public class SinglePattern {
    private static SinglePattern single;

    private SinglePattern() {

    }

    public static synchronized SinglePattern getInstance() {
        if (single == null) {
            return new SinglePattern();
        }
        return single;
    }
}