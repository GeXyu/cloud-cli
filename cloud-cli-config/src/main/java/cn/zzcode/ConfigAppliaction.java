/*
 * $Id: ConfigAppliaction.java, 2018年6月15日 下午12:05:08 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>
 * Title: ConfigAppliaction
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月15日 下午12:05:08
 * @modified [who date description]
 * @check [who date description]
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigAppliaction {

    public static void main(String[] args) {
        SpringApplication.run(ConfigAppliaction.class, args);
    }
}
