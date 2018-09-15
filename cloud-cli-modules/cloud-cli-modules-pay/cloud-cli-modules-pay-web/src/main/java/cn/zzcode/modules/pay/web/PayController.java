/*
 * $Id: PayController.java, 2018年9月15日 上午10:28:59 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 zzcode Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by zzcode or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.modules.pay.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.zzcode.modules.pay.service.PayService;

/**
 * <p>
 * Title: PayController
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年9月15日 上午10:28:59
 * @modified [who date description]
 * @check [who date description]
 */
@RequestMapping
@RestController
public class PayController {

    @Autowired
    private PayService payService;

    @RequestMapping("test")
    public String test() {
        System.out.println("pay controller test");
        return payService.test();
    }

}
