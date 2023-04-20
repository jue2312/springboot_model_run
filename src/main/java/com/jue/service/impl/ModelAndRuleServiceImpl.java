package com.jue.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jue.controller.utils.GetModelAndRule;
import com.jue.dao.ModelAndRuleDao;
import com.jue.dao.ModelDao;
import com.jue.dao.RuleDao;
import com.jue.domain.ModelAndRule;
import com.jue.service.IModelAndRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Pride
 */
@Service
public class ModelAndRuleServiceImpl extends ServiceImpl<ModelAndRuleDao, ModelAndRule> implements IModelAndRuleService {
    @Autowired
    private ModelDao modelDao;
    @Autowired
    private RuleDao ruleDao;

    @Autowired
    private ModelAndRuleDao modelAndRuleDao;

    @Override
    public boolean save(ModelAndRule modelAndRule) {
        boolean x = modelDao.insert(GetModelAndRule.getModel(modelAndRule)) > 0;
        boolean y = ruleDao.insert(GetModelAndRule.getRule(modelAndRule)) > 0;
        return x == y;
    }

    @Override
    public boolean modify(ModelAndRule modelAndRule) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public ModelAndRule getById(Integer id) {
        return modelAndRuleDao.getById(id);
    }

    @Override
    public List<ModelAndRule> getAll() {
        return modelAndRuleDao.selectAll();
    }
}
