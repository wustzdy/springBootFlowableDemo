package com.wustzdy.springboot.flowable.listen;

import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

/**
 * @Author: zhudayang
 * @Description:
 * @Date:
 */
public class BossTaskHandler implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        delegateTask.setAssignee("老板");
    }
}
