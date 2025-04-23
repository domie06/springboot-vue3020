package com.dao;

import com.entity.KehoufuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KehoufuwuView;

/**
 * 课后服务 Dao 接口
 *
 * @author 
 */
public interface KehoufuwuDao extends BaseMapper<KehoufuwuEntity> {

   List<KehoufuwuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
