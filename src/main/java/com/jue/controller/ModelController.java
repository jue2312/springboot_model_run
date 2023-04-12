package com.jue.controller;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("tb_model")
public class ModelController {
    @Autowired
    private ModelServiceImpl modelService;

    /**
     * 获取所有信息
     * @return
     */
    @GetMapping
    public List<Model> getAll() {
        return modelService.getAll();
    }

    /**
     * 添加一条数据
     * @param model
     * @return
     */
    @PostMapping
    public boolean save(@RequestBody Model model) {
        return modelService.save(model);
    }

    /**
     * 根据实体修改信息
     * @param model
     * @return
     */
    @PutMapping
    public boolean update(@RequestBody Model model) {
        return modelService.modify(model);
    }

    /**
     * 根据id删除记录
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return modelService.delete(id);
    }

    /**
     * 根据id查询记录
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Model getById(@PathVariable Integer id){
        System.out.println();
        return modelService.getById(id);
    }
}
