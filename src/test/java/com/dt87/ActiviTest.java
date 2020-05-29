package com.dt87;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.jupiter.api.Test;

public class ActiviTest {
    @Test
    public void test(){
        ProcessEngineConfiguration ConfigurationFromResource = 
                ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        ProcessEngine processEngine = ConfigurationFromResource.buildProcessEngine();


    }
}
