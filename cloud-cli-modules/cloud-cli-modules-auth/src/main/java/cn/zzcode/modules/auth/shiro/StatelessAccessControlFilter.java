/*
 * $Id: StatelessAccessControlFilter.java, 2018年9月16日 上午10:13:59 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 zzcode Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by zzcode or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.modules.auth.shiro;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.stereotype.Component;

/**
 * <p>
 * Title: StatelessAccessControlFilter
 * </p>
 * <p>
 * Description:认证器
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年9月16日 上午10:13:59
 * @modified [who date description]
 * @check [who date description]
 */
@Component
public class StatelessAccessControlFilter extends AccessControlFilter {

    private static final String OPTIONS = "OPTIONS";

    // isAccessAllowed决定是否继续执行
    @Override
    protected boolean isAccessAllowed(ServletRequest req, ServletResponse resp, Object mappedValue) throws Exception {

        HttpServletRequest request = WebUtils.toHttp(req);
        // HttpServletResponse response = WebUtils.toHttp(resp);

        // 每次会post请求先发送一次options请求
        String method = request.getMethod();
        if (method.equals(OPTIONS)) {
            return false;
        }

        return true;
    }

    // onAccessDenied做后续的操作
    @Override
    protected boolean onAccessDenied(ServletRequest req, ServletResponse resp) throws Exception {

        return true;
    }

}
