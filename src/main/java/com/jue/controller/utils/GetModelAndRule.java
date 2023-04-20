package com.jue.controller.utils;

import com.jue.domain.Model;
import com.jue.domain.ModelAndRule;
import com.jue.domain.Rule;

/**
 * 获取Model和Rule实体类
 * @author Pride
 */
public class GetModelAndRule {
    public static Model getModel(ModelAndRule modelAndRule){
        Model model=new Model();
        model.setId(modelAndRule.getId());
        model.setPid(modelAndRule.getPid());
        model.setName(modelAndRule.getName());
        model.setBusinessInformation(modelAndRule.getBusinessInformation());
        model.setJarDriver(modelAndRule.getJarDriver());
        model.setJar(modelAndRule.getJar());
        model.setModelParameter(modelAndRule.getModelParameter());
        return model;
    }
    public static Rule getRule(ModelAndRule modelAndRule){
        Rule rule=new Rule();
        rule.setId(modelAndRule.getId());
        rule.setOutputSourceRule(modelAndRule.getOutputSourceRule()); ;
        rule.setInputSourceRule(modelAndRule.getInputSourceRule()); ;
        return rule;
    }
}
