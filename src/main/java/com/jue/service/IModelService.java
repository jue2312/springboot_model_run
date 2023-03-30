package com.jue.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jue.domain.Model;

public interface IModelService extends IService<Model> {

    boolean save(Model model);
}
