package com.dt87.activiti1;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;

import java.util.List;

public class ActivitiDb {

    public static void main(String[] args) {
        //1.创建流程引擎对象ProcessEngine
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        //2.创建任务服务TaskService
        TaskService taskService = defaultProcessEngine.getTaskService();
        //3.根据个人身份和流程查询所有的代办事件
        List<Task> list = taskService.createTaskQuery().processDefinitionKey("holiday3").taskAssignee("zhouliu").list();
        //4.展示
        for(Task task:list){
            System.out.println("流程实例id："+task.getProcessInstanceId());
            System.out.println("任务id："+task.getId());
            System.out.println("任务负责人："+task.getAssignee());
            System.out.println("任务名称："+task.getName());
        }
    }
}
