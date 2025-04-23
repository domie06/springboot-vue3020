package com.entity.view;

import com.entity.KehoufuwuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 课后服务
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kehoufuwu")
public class KehoufuwuView extends KehoufuwuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 课后服务类型的值
		*/
		private String kehoufuwuValue;



	public KehoufuwuView() {

	}

	public KehoufuwuView(KehoufuwuEntity kehoufuwuEntity) {
		try {
			BeanUtils.copyProperties(this, kehoufuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 课后服务类型的值
			*/
			public String getKehoufuwuValue() {
				return kehoufuwuValue;
			}
			/**
			* 设置： 课后服务类型的值
			*/
			public void setKehoufuwuValue(String kehoufuwuValue) {
				this.kehoufuwuValue = kehoufuwuValue;
			}











}
