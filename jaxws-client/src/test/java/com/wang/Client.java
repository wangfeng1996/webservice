package com.wang;

import static org.junit.Assert.assertTrue;

import com.wang.service.UserService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Client
{
    public static void main(String[] args) {
//        创建客户端代理对象
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
//        设置远程访问服务地址
        factoryBean.setAddress("http://localhost:8082/ws/user");
//        设置接口的类型
        factoryBean.setServiceClass(UserService.class);
//        对接口生成代理对象
        UserService userService = factoryBean.create(UserService.class);
        String user = userService.getUser();
        System.out.println(user);
    }
}
