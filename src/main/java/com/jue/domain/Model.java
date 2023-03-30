package com.jue.domain;

import lombok.Data;

/**
 * @author Pride
 */
@Data
public class Model {
    private Integer id;
    private String name;
    private String businessInformation ;
    private String inputSourceRule;
    private String outputSourceRule;
    private String jarDriver;
    private String jar;
    private String modelParameter;

}
