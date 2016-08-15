/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import javatest.Greet.Greet;
import javatest.Greet.GreetImpl;
import javatest.GreetOther.GreetOther;
import javatest.GreetOther.Greet2;

/**
 *
 * @author zhangjingwei
 */
public class JavaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Greet tmp = new GreetImpl();
        Greet greet = (Greet) GreetProxy.newInstatnce(tmp);
        greet.sayHello("weib");
        greet.goodsBye();
        //将Greet2的对象委托给代理类,greet并不是Greet2的实例，而是一个代理对象
//        GreetOther greet = (GreetOther) GreetProxy.newInstatnce(new Greet2());
//        greet.hello();
    }
    
}
