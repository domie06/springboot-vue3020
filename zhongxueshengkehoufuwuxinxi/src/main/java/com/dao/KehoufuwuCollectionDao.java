package com.dao;

import com.entity.KehoufuwuCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KehoufuwuCollectionView;

/**
 * 课后服务收藏 Dao 接口
 *
 * @author 
 */
public interface KehoufuwuCollectionDao extends BaseMapper<KehoufuwuCollectionEntity> {

   List<KehoufuwuCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
