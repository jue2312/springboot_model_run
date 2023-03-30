package com.jue.controller;

import com.jue.domain.Model;
import com.jue.service.impl.ModelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Pride
 */
@RestController()
@RequestMapping("/models")
public class ModelController {
    @Autowired
    private ModelServiceImpl modelService;

    @GetMapping
    public List<Model> getAll(){
        return modelService.list();
    }

    @PostMapping
    public boolean getSave(){
        Model model=new Model();
        model.setName("ll");
        model.setModelParameter("ldsdal");
        model.setJar("ldsdsal");
        model.setInputSourceRule("ddll");
        model.setOutputSourceRule("l23l");
        model.setJarDriver("dsadll");
        model.setBusinessInformation("ldsl");
        return modelService.save(model);
    }


}
