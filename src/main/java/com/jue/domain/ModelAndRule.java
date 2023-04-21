package com.jue.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 数据模型和规则表
 * @author Pride
 */
@Data
public class ModelAndRule {
    private Integer id;
    private Integer pid;
    private String name;
    private String businessInformation;
    private String jarDriver;
    private String jar;
    private String modelParameter;
    private String inputSourceRule;
    private String outputSourceRule;
    private Model model=new Model();
    private Rule rule=new Rule();

    public ModelAndRule(Integer id, Integer pid, String name, String businessInformation, String jarDriver, String jar, String modelParameter, String inputSourceRule, String outputSourceRule) {
        this.id = id;
        this.pid = pid;
        this.name = name;
        this.businessInformation = businessInformation;
        this.jarDriver = jarDriver;
        this.jar = jar;
        this.modelParameter = modelParameter;
        this.inputSourceRule = inputSourceRule;
        this.outputSourceRule = outputSourceRule;
    }

    public Model getModel() {
        this.setModel(this.model);
        return model;
    }

    public void setModel(Model model) {
        model.setId(this.id);
        model.setName(this.name);
        model.setPid(this.pid);
        model.setBusinessInformation(this.businessInformation);
        model.setJarDriver(this.jarDriver);
        model.setJar(this.jar);
        model.setModelParameter(this.modelParameter);
        this.model = model;
    }

    public Rule getRule() {
        this.setRule(this.rule);
        return rule;
    }

    public void setRule(Rule rule) {
        rule.setId(this.id);
        rule.setInputSourceRule(this.inputSourceRule);
        rule.setOutputSourceRule(this.outputSourceRule);
        this.rule = rule;
    }
}
