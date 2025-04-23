package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.KehoufuwuOrderDao;
import com.entity.KehoufuwuOrderEntity;
import com.service.KehoufuwuOrderService;
import com.entity.view.KehoufuwuOrderView;

/**
 * 课后服务报名 服务实现类
 */
@Service("kehoufuwuOrderService")
@Transactional
public class KehoufuwuOrderServiceImpl extends ServiceImpl<KehoufuwuOrderDao, KehoufuwuOrderEntity> implements KehoufuwuOrderService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<KehoufuwuOrderView> page =new Query<KehoufuwuOrderView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
