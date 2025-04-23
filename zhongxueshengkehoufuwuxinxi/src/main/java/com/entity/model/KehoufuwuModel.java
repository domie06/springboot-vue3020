package com.entity.model;

import com.entity.KehoufuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课后服务
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KehoufuwuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：课后服务名称
	 */
    public String getKehoufuwuName() {
        return kehoufuwuName;
    }


    /**
	 * 设置：课后服务名称
	 */
    public void setKehoufuwuName(String kehoufuwuName) {
        this.kehoufuwuName = kehoufuwuName;
    }
    /**
	 * 获取：课后服务照片
	 */
    public String getKehoufuwuPhoto() {
        return kehoufuwuPhoto;
    }


    /**
	 * 设置：课后服务照片
	 */
    public void setKehoufuwuPhoto(String kehoufuwuPhoto) {
        this.kehoufuwuPhoto = kehoufuwuPhoto;
    }
    /**
	 * 获取：课后服务类型
	 */
    public Integer getKehoufuwuTypes() {
        return kehoufuwuTypes;
    }


    /**
	 * 设置：课后服务类型
	 */
    public void setKehoufuwuTypes(Integer kehoufuwuTypes) {
        this.kehoufuwuTypes = kehoufuwuTypes;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getKehoufuwuClicknum() {
        return kehoufuwuClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setKehoufuwuClicknum(Integer kehoufuwuClicknum) {
        this.kehoufuwuClicknum = kehoufuwuClicknum;
    }
    /**
	 * 获取：课后服务介绍
	 */
    public String getKehoufuwuContent() {
        return kehoufuwuContent;
    }


    /**
	 * 设置：课后服务介绍
	 */
    public void setKehoufuwuContent(String kehoufuwuContent) {
        this.kehoufuwuContent = kehoufuwuContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
