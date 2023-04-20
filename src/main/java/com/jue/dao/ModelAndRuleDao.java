package com.jue.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jue.domain.ModelAndRule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Pride
 */
@Mapper
public interface ModelAndRuleDao extends BaseMapper<ModelAndRule> {
    @Select("select * from tb_model INNER JOIN  tb_rule ON tb_model.id=tb_rule.id")
    List<ModelAndRule> selectAll();
}
