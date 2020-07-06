package com.liuhai.boot.start;

public class LiuHelloService {

    private LiuProperties properties;

    public LiuHelloService() {
    }

    public LiuHelloService(LiuProperties properties) {
        this.properties = properties;
    }

    public void sayHello(){
        System.out.println("Hello " + properties.getName() + " " + properties.getWords());
    }
}
