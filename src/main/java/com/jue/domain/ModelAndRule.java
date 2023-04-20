package com.jue.domain;

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
}
