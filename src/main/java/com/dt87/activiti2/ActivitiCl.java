package com.dt87.activiti2;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;

import java.util.HashMap;
import java.util.Map;

public class ActivitiCl {

    public static void main(String[] args) {
        //1.创建流程引擎对象ProcessEngine
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        //2.创建任务服务TaskService
        TaskService taskService = defaultProcessEngine.getTaskService();
        //3.处理任务
        //
        Map<String,Object> map = new HashMap<>();

        taskService.complete("15002");
    }
}
