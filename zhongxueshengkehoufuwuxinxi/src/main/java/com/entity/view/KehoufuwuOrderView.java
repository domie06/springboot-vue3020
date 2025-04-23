package com.entity.view;

import com.entity.KehoufuwuOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 课后服务报名
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kehoufuwu_order")
public class KehoufuwuOrderView extends KehoufuwuOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 申请状态的值
		*/
		private String kehoufuwuOrderYesnoValue;



		//级联表 kehoufuwu
			/**
			* 课后服务名称
			*/
			private String kehoufuwuName;
			/**
			* 课后服务照片
			*/
			private String kehoufuwuPhoto;
			/**
			* 课后服务类型
			*/
			private Integer kehoufuwuTypes;
				/**
				* 课后服务类型的值
				*/
				private String kehoufuwuValue;
			/**
			* 赞
			*/
			private Integer zanNumber;
			/**
			* 踩
			*/
			private Integer caiNumber;
			/**
			* 点击次数
			*/
			private Integer kehoufuwuClicknum;
			/**
			* 课后服务介绍
			*/
			private String kehoufuwuContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public KehoufuwuOrderView() {

	}

	public KehoufuwuOrderView(KehoufuwuOrderEntity kehoufuwuOrderEntity) {
		try {
			BeanUtils.copyProperties(this, kehoufuwuOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 申请状态的值
			*/
			public String getKehoufuwuOrderYesnoValue() {
				return kehoufuwuOrderYesnoValue;
			}
			/**
			* 设置： 申请状态的值
			*/
			public void setKehoufuwuOrderYesnoValue(String kehoufuwuOrderYesnoValue) {
				this.kehoufuwuOrderYesnoValue = kehoufuwuOrderYesnoValue;
			}










				//级联表的get和set kehoufuwu

					/**
					* 获取： 课后服务名称
					*/
					public String getKehoufuwuName() {
						return kehoufuwuName;
					}
					/**
					* 设置： 课后服务名称
					*/
					public void setKehoufuwuName(String kehoufuwuName) {
						this.kehoufuwuName = kehoufuwuName;
					}

					/**
					* 获取： 课后服务照片
					*/
					public String getKehoufuwuPhoto() {
						return kehoufuwuPhoto;
					}
					/**
					* 设置： 课后服务照片
					*/
					public void setKehoufuwuPhoto(String kehoufuwuPhoto) {
						this.kehoufuwuPhoto = kehoufuwuPhoto;
					}

					/**
					* 获取： 课后服务类型
					*/
					public Integer getKehoufuwuTypes() {
						return kehoufuwuTypes;
					}
					/**
					* 设置： 课后服务类型
					*/
					public void setKehoufuwuTypes(Integer kehoufuwuTypes) {
						this.kehoufuwuTypes = kehoufuwuTypes;
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

					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}

					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}

					/**
					* 获取： 点击次数
					*/
					public Integer getKehoufuwuClicknum() {
						return kehoufuwuClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setKehoufuwuClicknum(Integer kehoufuwuClicknum) {
						this.kehoufuwuClicknum = kehoufuwuClicknum;
					}

					/**
					* 获取： 课后服务介绍
					*/
					public String getKehoufuwuContent() {
						return kehoufuwuContent;
					}
					/**
					* 设置： 课后服务介绍
					*/
					public void setKehoufuwuContent(String kehoufuwuContent) {
						this.kehoufuwuContent = kehoufuwuContent;
					}
















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
