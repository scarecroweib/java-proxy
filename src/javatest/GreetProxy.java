/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类
 * @author zhangjingwei
 */
public class GreetProxy implements InvocationHandler {

    //绑定的对象
    private Object obj;
    
    private GreetProxy(Object obj){
        this.obj = obj;
    }
    
    //为绑定的对象创建一个代理对象，该对象并非当前类的实例（只是代理类与绑定对象的一个关联或叫作代理对象）
    public static Object newInstatnce(Object obj){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new GreetProxy(obj));
    }
    
    //拦截关联中绑定对象的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        
        System.out.println("==before method " + method.getName());
        result = method.invoke(obj, args);
        System.out.println("==after method " + method.getName());
        
        return result;
    }
    
}
