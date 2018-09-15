/*
 * $Id: PayService.java, 2018年9月15日 上午10:27:32 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 zzcode Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by zzcode or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.modules.pay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zzcode.modules.user.client.UserService;

/**
 * <p>
 * Title: PayService
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年9月15日 上午10:27:32
 * @modified [who date description]
 * @check [who date description]
 */
@Service
public class PayService {

    @Autowired
    private UserService userService;

    public String test() {
        System.out.println("pay service test");
        return userService.test();
    }
}
