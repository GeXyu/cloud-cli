/*
 * $Id: PayServiceAppliaction.java, 2018年9月15日 上午10:23:13 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 zzcode Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by zzcode or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.modules.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>
 * Title: PayServiceAppliaction
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年9月15日 上午10:23:13
 * @modified [who date description]
 * @check [who date description]
 */
@SpringBootApplication
@ComponentScan(basePackages = { "cn.zzcode.modules.user" }) // 加载引入client的jar文件
public class PayServiceAppliaction {

    public static void main(String[] args) {
        SpringApplication.run(PayServiceAppliaction.class, args);
    }

}
