/*
 * $Id: PaymentApplication.java, 2018年9月7日 下午10:30:07 XiuYu.Ge Exp $
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
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import cn.zzcode.modules.auth.AuthAppliaction;
import cn.zzcode.modules.user.UserClientAppliaction;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>
 * Title: PaymentApplication
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年9月7日 下午10:30:07
 * @modified [who date description]
 * @check [who date description]
 */
@EnableSwagger2
@EnableDiscoveryClient
@EnableAutoConfiguration
@ComponentScan(basePackages = { "cn.zzcode.modules.user", "cn.zzcode.modules.auth", "cn.zzcode.modules.pay" }) // 加载引入client的jar文件
@SpringBootApplication(exclude = { PayServiceAppliaction.class, UserClientAppliaction.class, AuthAppliaction.class })
public class PaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }

    // -------
    private static final String BASE_PACKAGE = "cn.zzcode.modules.pay.web";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.any()).build();
    }
}
