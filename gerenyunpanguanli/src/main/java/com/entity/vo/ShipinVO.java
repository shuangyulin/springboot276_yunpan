package com.entity.vo;

import com.entity.ShipinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 视频信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shipin")
public class ShipinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 视频标题
     */

    @TableField(value = "shipin_name")
    private String shipinName;


    /**
     * 视频类别
     */

    @TableField(value = "shipin_types")
    private Integer shipinTypes;


    /**
     * 视频图片
     */

    @TableField(value = "shipin_photo")
    private String shipinPhoto;


    /**
     * 视频
     */

    @TableField(value = "shipin_video")
    private String shipinVideo;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 点击次数
     */

    @TableField(value = "shipin_clicknum")
    private Integer shipinClicknum;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 视频详情
     */

    @TableField(value = "shipin_content")
    private String shipinContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：视频标题
	 */
    public String getShipinName() {
        return shipinName;
    }


    /**
	 * 获取：视频标题
	 */

    public void setShipinName(String shipinName) {
        this.shipinName = shipinName;
    }
    /**
	 * 设置：视频类别
	 */
    public Integer getShipinTypes() {
        return shipinTypes;
    }


    /**
	 * 获取：视频类别
	 */

    public void setShipinTypes(Integer shipinTypes) {
        this.shipinTypes = shipinTypes;
    }
    /**
	 * 设置：视频图片
	 */
    public String getShipinPhoto() {
        return shipinPhoto;
    }


    /**
	 * 获取：视频图片
	 */

    public void setShipinPhoto(String shipinPhoto) {
        this.shipinPhoto = shipinPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getShipinVideo() {
        return shipinVideo;
    }


    /**
	 * 获取：视频
	 */

    public void setShipinVideo(String shipinVideo) {
        this.shipinVideo = shipinVideo;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getShipinClicknum() {
        return shipinClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setShipinClicknum(Integer shipinClicknum) {
        this.shipinClicknum = shipinClicknum;
    }
    /**
	 * 设置：发布日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布日期
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：视频详情
	 */
    public String getShipinContent() {
        return shipinContent;
    }


    /**
	 * 获取：视频详情
	 */

    public void setShipinContent(String shipinContent) {
        this.shipinContent = shipinContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
