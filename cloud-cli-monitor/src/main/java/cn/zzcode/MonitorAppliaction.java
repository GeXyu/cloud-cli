/*
 * $Id: MonitorAppliaction.java, 2018年9月1日 下午12:32:23 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 zzcode Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by zzcode or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>
 * Title: MonitorAppliaction
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年9月1日 下午12:32:23
 * @modified [who date description]
 * @check [who date description]
 */
@SpringBootApplication
@EnableEurekaClient
// @EnableAdminServer
public class MonitorAppliaction {

    public static void main(String[] args) {
        SpringApplication.run(MonitorAppliaction.class, args);
    }

}
