package com.dt87.activiti3;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;

/**
 * 部署流程
 */
public class ActivitiDy {

    public static void main(String[] args) {
        //1.创建流程引擎对象ProcessEngine
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        //2，获取服务仓库对象
        RepositoryService repositoryService = defaultProcessEngine.getRepositoryService();
        //3.部署模型
        Deployment deploy = repositoryService.createDeployment()
                .addClasspathResource("static/holiday4.bpmn")
                .deploy();

        System.out.println(deploy.getName());
        System.out.println(deploy.getId());
    }
}
