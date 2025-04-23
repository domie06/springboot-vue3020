package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 课后服务
 *
 * @author 
 * @email
 */
@TableName("kehoufuwu")
public class KehoufuwuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KehoufuwuEntity() {

	}

	public KehoufuwuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 课后服务名称
     */
    @TableField(value = "kehoufuwu_name")

    private String kehoufuwuName;


    /**
     * 课后服务照片
     */
    @TableField(value = "kehoufuwu_photo")

    private String kehoufuwuPhoto;


    /**
     * 课后服务类型
     */
    @TableField(value = "kehoufuwu_types")

    private Integer kehoufuwuTypes;


    /**
     * 赞
     */
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 点击次数
     */
    @TableField(value = "kehoufuwu_clicknum")

    private Integer kehoufuwuClicknum;


    /**
     * 课后服务介绍
     */
    @TableField(value = "kehoufuwu_content")

    private String kehoufuwuContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：课后服务名称
	 */
    public String getKehoufuwuName() {
        return kehoufuwuName;
    }
    /**
	 * 获取：课后服务名称
	 */

    public void setKehoufuwuName(String kehoufuwuName) {
        this.kehoufuwuName = kehoufuwuName;
    }
    /**
	 * 设置：课后服务照片
	 */
    public String getKehoufuwuPhoto() {
        return kehoufuwuPhoto;
    }
    /**
	 * 获取：课后服务照片
	 */

    public void setKehoufuwuPhoto(String kehoufuwuPhoto) {
        this.kehoufuwuPhoto = kehoufuwuPhoto;
    }
    /**
	 * 设置：课后服务类型
	 */
    public Integer getKehoufuwuTypes() {
        return kehoufuwuTypes;
    }
    /**
	 * 获取：课后服务类型
	 */

    public void setKehoufuwuTypes(Integer kehoufuwuTypes) {
        this.kehoufuwuTypes = kehoufuwuTypes;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }
    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }
    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getKehoufuwuClicknum() {
        return kehoufuwuClicknum;
    }
    /**
	 * 获取：点击次数
	 */

    public void setKehoufuwuClicknum(Integer kehoufuwuClicknum) {
        this.kehoufuwuClicknum = kehoufuwuClicknum;
    }
    /**
	 * 设置：课后服务介绍
	 */
    public String getKehoufuwuContent() {
        return kehoufuwuContent;
    }
    /**
	 * 获取：课后服务介绍
	 */

    public void setKehoufuwuContent(String kehoufuwuContent) {
        this.kehoufuwuContent = kehoufuwuContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Kehoufuwu{" +
            "id=" + id +
            ", kehoufuwuName=" + kehoufuwuName +
            ", kehoufuwuPhoto=" + kehoufuwuPhoto +
            ", kehoufuwuTypes=" + kehoufuwuTypes +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", kehoufuwuClicknum=" + kehoufuwuClicknum +
            ", kehoufuwuContent=" + kehoufuwuContent +
            ", createTime=" + createTime +
        "}";
    }
}
