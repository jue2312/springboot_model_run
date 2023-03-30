package com.jue.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jue.dao.ModelDao;
import com.jue.domain.Model;
import com.jue.service.IModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Pride
 */
@Service
public class ModelServiceImpl extends ServiceImpl<ModelDao, Model> implements IModelService {
    @Autowired ModelDao modelDao;
    private int id;
    @Override
    public boolean save(Model model) {
        return modelDao.insert(model) > 1;
    }
}
