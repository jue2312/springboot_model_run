package com.jue.controller;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jue.domain.Model;
import com.jue.domain.Rule;
import com.jue.service.impl.ModelServiceImpl;
import com.jue.service.impl.RuleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Pride
 */
@RestController
@RequestMapping("/rules")
@TableName("tb_rule")
public class RuleController {
    @Autowired
    private RuleServiceImpl ruleService;

    /**
     * 获取所有信息
     * @return
     */
    @GetMapping
    public List<Rule> getAll() {
        return ruleService.getAll();
    }

    /**
     * 添加一条数据
     * @param rule
     * @return
     */
    @PostMapping
    public boolean save(@RequestBody Rule rule) {
        return ruleService.save(rule);
    }

    /**
     * 根据实体修改信息
     * @param rule
     * @return
     */
    @PutMapping
    public boolean update(@RequestBody Rule rule) {
        return ruleService.modify(rule);
    }

    /**
     * 根据id删除记录
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return ruleService.delete(id);
    }

    /**
     * 根据id查询记录
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Rule getById(@PathVariable Integer id){
        System.out.println();
        return ruleService.getById(id);
    }
}
