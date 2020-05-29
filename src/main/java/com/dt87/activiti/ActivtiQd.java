package com.dt87.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;

/**
 * 启动一个流程实例
 */
public class ActivtiQd {

    public static void main(String[] args) {
        //1.创建ProcessEngine对象
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        //2.或去运行的服务接口对象
        RuntimeService runtimeService = defaultProcessEngine.getRuntimeService();
        //3.创建流程对象
        ProcessInstance holiday = runtimeService.startProcessInstanceByKey("holiday");
        System.out.println(holiday.getId());
        System.out.println(holiday.getName());
        System.out.println(holiday.getProcessDefinitionName());
    }
}
