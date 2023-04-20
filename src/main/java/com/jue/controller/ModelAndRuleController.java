package com.jue.controller;

import com.jue.domain.Model;
import com.jue.domain.ModelAndRule;
import com.jue.service.impl.ModelAndRuleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author Pride
 */
@RestController()
@RequestMapping("/models")
public class ModelAndRuleController {
    @Autowired
    private ModelAndRuleServiceImpl modelAndRuleService;

    /**
     * 获取获取Model表和Rule表的全部信息 关联条件id
     * @return
     */
    @GetMapping
    public List<ModelAndRule> getAll() {
        return modelAndRuleService.getAll();
    }

    /**
     * 向Model表和Rule表中添加一条记录
     * @param
     * @return
     */
    @PostMapping
    public boolean save(@RequestBody ModelAndRule modelAndRule) {
        return modelAndRuleService.save(modelAndRule);
    }

    /**
     * 根据ModelAndRule信息修改Model表和Rule表中的信息
     * @param modelAndRule
     * @return
     */
    @PutMapping
    public boolean update(@RequestBody ModelAndRule modelAndRule) {
        return modelAndRuleService.modify(modelAndRule);
    }

    /**
     * 根据id删除Model表和Rule表中的记录
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return modelAndRuleService.delete(id);
    }

    /**
     * 根据id查询Model表和Rule表中的记录
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Model getById(@PathVariable Integer id){
        System.out.println();
        return modelAndRuleService.getById(id);
    }
}
