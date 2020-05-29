package com.dt87.activiti2;

import com.dt87.entity.Holiday;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;

import java.util.HashMap;
import java.util.Map;

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
        //创建assignee对象
        Map<String,Object> map = new HashMap<>();
        map.put("name0","zhangsan");
        map.put("name1","lisi");
        map.put("name2","wangwu");
        map.put("name3","zhouliu");
        //创建变量去控制流程
       /* Holiday holiday1 = new Holiday();
        holiday1.setNum(4);
        map.put("holiday",holiday1);*/
        ProcessInstance holiday = runtimeService.startProcessInstanceByKey("holiday3",map);
        System.out.println(holiday.getId());
        System.out.println(holiday.getName());
        System.out.println(holiday.getProcessDefinitionName());
    }
}
