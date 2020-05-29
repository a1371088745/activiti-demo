package com.dt87.activiti4;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;

import java.util.List;

public class ActivitiGhTask {

    public static void main(String[] args) {
        //1.创建流程引擎对象ProcessEngine
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        //2.创建任务服务TaskService
        TaskService taskService = defaultProcessEngine.getTaskService();
        //3.根据个人身份和流程查询所有的代办事件
        List<Task> list = taskService.createTaskQuery().processDefinitionKey("holiday3").taskAssignee("zhouliu").list();
        //4.展示
        for(Task task:list){
           if(task != null){
               taskService.setAssignee(task.getId(),null);//设置任务负责人为空，即归还任务
           }
        }
    }
}
