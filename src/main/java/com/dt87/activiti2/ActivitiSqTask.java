package com.dt87.activiti2;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;

import java.util.List;

/**
 * 候选人拾取任务
 */
public class ActivitiSqTask {

    public static void main(String[] args) {
        //1.创建流程引擎对象ProcessEngine
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        //2.创建任务服务TaskService
        TaskService taskService = defaultProcessEngine.getTaskService();
        //3.根据个人身份和流程查询所有的代办事件
        List<Task> list = taskService.createTaskQuery().processDefinitionKey("holiday3").taskCandidateUser("zhouliu").list();
        //4.展示
        for(Task task:list){
            //判断是否是候选人
            if(task != null){
                //执行拾取操作
                taskService.claim(task.getId(),"zhouliu");
            }
        }
    }
}
