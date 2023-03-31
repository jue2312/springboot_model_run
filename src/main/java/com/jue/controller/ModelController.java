package com.jue.controller;

import com.jue.domain.Model;
import com.jue.service.impl.ModelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<Model> getAll() {
        return modelService.getAll();
    }

    @PostMapping
    public boolean save(@RequestBody Model model) {
        return modelService.save(model);
    }

    @PutMapping
    public boolean update(@RequestBody Model model) {
        return modelService.modify(model);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return modelService.delete(id);
    }

    @GetMapping("/{id}")
    public Model getById(@PathVariable Integer id){
        System.out.println();
        return modelService.getById(id);
    }
}
