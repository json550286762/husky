package com.chou.dms.activiti.service.oa.leave;

import com.chou.dms.activiti.dao.ActivitiDao;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 请假流程结束监听器
 *
 * @author: Henry Yan
 */
@Service
@Transactional
public class LeaveProcessEndListener implements ExecutionListener {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    ActivitiDao activitiDao;

    public void notify(DelegateExecution execution) throws Exception {
        String processInstanceId = execution.getProcessInstanceId();

        int i = activitiDao.deleteFormPropertyByProcessInstanceId(processInstanceId);
        logger.debug("清理了 {} 条历史表单数据", i);
    }
}
