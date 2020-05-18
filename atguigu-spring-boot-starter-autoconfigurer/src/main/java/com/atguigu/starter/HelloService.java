package com.atguigu.starter;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Shawn.Yang
 * @create 2020-05-17-23:23
 */
public class HelloService {

    private HelloProperties helloProperties;

    public String sayHello(String name){
      return helloProperties.getPrefix() + name + helloProperties.getSuffix();
    }

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
