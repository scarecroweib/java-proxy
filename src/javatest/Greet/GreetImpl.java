/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest.Greet;

/**
 *
 * @author zhangjingwei
 */
public class GreetImpl implements Greet {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    @Override
    public void goodsBye() {
        System.out.println("Goodbye.");
    }
    
}
