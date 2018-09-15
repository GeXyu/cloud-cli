/*
 * $Id: UserClientAppliaction.java, 2018年9月15日 上午10:59:14 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 zzcode Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by zzcode or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.modules.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>
 * Title: UserClientAppliaction
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年9月15日 上午10:59:14
 * @modified [who date description]
 * @check [who date description]
 */
@SpringBootApplication
@EnableFeignClients
public class UserClientAppliaction {

    public static void main(String[] args) {
        SpringApplication.run(UserClientAppliaction.class, args);
    }
}
