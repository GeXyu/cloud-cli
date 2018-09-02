/*
 * $Id: TestFilter.java, 2018年9月1日 下午12:02:05 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 zzcode Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by zzcode or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.web.filter;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;

/**
 * <p>
 * Title: TestFilter
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年9月1日 下午12:02:05
 * @modified [who date description]
 * @check [who date description]
 */
@Component
public class TestFilter extends ZuulFilter {

    /**
     * @see com.netflix.zuul.IZuulFilter#shouldFilter()
     */
    @Override
    public boolean shouldFilter() {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * @see com.netflix.zuul.IZuulFilter#run()
     */
    @Override
    public Object run() {
        System.out.println("run....");
        return null;
    }

    /**
     * @see com.netflix.zuul.ZuulFilter#filterType()
     */
    @Override
    public String filterType() {
        // TODO Auto-generated method stub
        return "pre";
    }

    /**
     * @see com.netflix.zuul.ZuulFilter#filterOrder()
     */
    @Override
    public int filterOrder() {
        // TODO Auto-generated method stub
        return 0;
    }

}
