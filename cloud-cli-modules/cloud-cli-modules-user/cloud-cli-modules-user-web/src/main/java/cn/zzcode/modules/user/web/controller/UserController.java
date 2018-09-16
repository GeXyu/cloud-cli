/*
 * $Id: UserController.java, 2018年9月14日 下午7:15:42 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 zzcode Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by zzcode or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.modules.user.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Title: UserController
 * </p>
 * <p>
 * Description:用户
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年9月14日 下午7:15:42
 * @modified [who date description]
 * @check [who date description]
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Value("${info.profile:error}")
    private String name;

    @RequestMapping("test")
    public String test() {
        System.out.println("user controller test ");
        System.out.println("config : " + name);
        return "TEST";
    }

}
