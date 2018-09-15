/*
 * $Id: UserService.java, 2018年9月13日 下午7:15:01 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 zzcode Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by zzcode or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.modules.user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * Title: UserService
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年9月13日 下午7:15:01
 * @modified [who date description]
 * @check [who date description]
 */
// 如果用failback的方式，会有mapping的重复的问题
@FeignClient(value = "user", fallbackFactory = UserServiceFullBackFactory.class)
@RequestMapping("user")
public interface UserService {

    // @HystrixCommand()
    @RequestMapping("test")
    public String test();

}
