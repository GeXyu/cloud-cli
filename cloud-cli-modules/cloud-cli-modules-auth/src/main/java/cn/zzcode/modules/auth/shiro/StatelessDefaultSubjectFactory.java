/*
 * $Id: StatelessDefaultSubjectFactory.java, 2018年9月16日 上午9:42:46 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 zzcode Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by zzcode or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.modules.auth.shiro;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.subject.SubjectContext;
import org.apache.shiro.web.mgt.DefaultWebSubjectFactory;

/**
 * <p>
 * Title: StatelessDefaultSubjectFactory
 * </p>
 * <p>
 * Description:禁用session
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年9月16日 上午9:42:46
 * @modified [who date description]
 * @check [who date description]
 */
public class StatelessDefaultSubjectFactory extends DefaultWebSubjectFactory {

    @Override
    public Subject createSubject(SubjectContext context) {
        context.setSessionCreationEnabled(false);
        return super.createSubject(context);
    }
}
