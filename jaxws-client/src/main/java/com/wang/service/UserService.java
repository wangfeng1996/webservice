package com.wang.service;

import javax.jws.WebService;

/**
 * @author 一只永不言弃的小乌龟
 * @create 2021/4/25 下午6:08
 */
@WebService
public interface UserService {
    /**
     * 获取user对象中的信息
     * @return
     */
    public String getUser();
}
