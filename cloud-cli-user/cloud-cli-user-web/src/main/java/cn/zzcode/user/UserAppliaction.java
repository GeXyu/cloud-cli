/*
 * $Id: UserAppliaction.java, 2018年9月4日 下午1:04:07 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 zzcode Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by zzcode or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>
 * Title: UserAppliaction
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年9月4日 下午1:04:07
 * @modified [who date description]
 * @check [who date description]
 */
@SpringBootApplication
@EnableEurekaClient
public class UserAppliaction {
    public static void main(String[] args) {
        SpringApplication.run(UserAppliaction.class, args);
    }
}
