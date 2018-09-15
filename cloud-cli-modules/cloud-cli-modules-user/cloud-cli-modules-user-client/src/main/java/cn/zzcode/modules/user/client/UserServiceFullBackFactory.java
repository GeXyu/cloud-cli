/*
 * $Id: UserServiceFullBack.java, 2018年9月15日 下午5:26:11 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 zzcode Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by zzcode or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.modules.user.client;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

/**
 * <p>
 * Title: UserServiceFullBack
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年9月15日 下午5:26:11
 * @modified [who date description]
 * @check [who date description]
 */
@Component
public class UserServiceFullBackFactory implements FallbackFactory<UserService> {

    /**
     * @see feign.hystrix.FallbackFactory#create(java.lang.Throwable)
     */
    @Override
    public UserService create(Throwable cause) {
        return new UserService() {
            @Override
            public String test() {
                System.out.println(" user service fail");
                return "fail";
            }
        };
    }

}
