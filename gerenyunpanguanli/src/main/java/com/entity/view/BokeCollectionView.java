package com.entity.view;

import com.entity.BokeCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 博客信息收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("boke_collection")
public class BokeCollectionView extends BokeCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String bokeCollectionValue;



		//级联表 boke
			/**
			* 博客标题
			*/
			private String bokeName;
			/**
			* 博客类型
			*/
			private Integer bokeTypes;
				/**
				* 博客类型的值
				*/
				private String bokeValue;
			/**
			* 博客图片
			*/
			private String bokePhoto;
			/**
			* 博客信息 的 用户
			*/
			private Integer bokeYonghuId;
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
			private Integer clicknum;
			/**
			* 博客内容
			*/
			private String bokeContent;

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
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public BokeCollectionView() {

	}

	public BokeCollectionView(BokeCollectionEntity bokeCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, bokeCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getBokeCollectionValue() {
				return bokeCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setBokeCollectionValue(String bokeCollectionValue) {
				this.bokeCollectionValue = bokeCollectionValue;
			}




				//级联表的get和set boke
					/**
					* 获取： 博客标题
					*/
					public String getBokeName() {
						return bokeName;
					}
					/**
					* 设置： 博客标题
					*/
					public void setBokeName(String bokeName) {
						this.bokeName = bokeName;
					}
					/**
					* 获取： 博客类型
					*/
					public Integer getBokeTypes() {
						return bokeTypes;
					}
					/**
					* 设置： 博客类型
					*/
					public void setBokeTypes(Integer bokeTypes) {
						this.bokeTypes = bokeTypes;
					}


						/**
						* 获取： 博客类型的值
						*/
						public String getBokeValue() {
							return bokeValue;
						}
						/**
						* 设置： 博客类型的值
						*/
						public void setBokeValue(String bokeValue) {
							this.bokeValue = bokeValue;
						}
					/**
					* 获取： 博客图片
					*/
					public String getBokePhoto() {
						return bokePhoto;
					}
					/**
					* 设置： 博客图片
					*/
					public void setBokePhoto(String bokePhoto) {
						this.bokePhoto = bokePhoto;
					}
					/**
					* 获取：博客信息 的 用户
					*/
					public Integer getBokeYonghuId() {
						return bokeYonghuId;
					}
					/**
					* 设置：博客信息 的 用户
					*/
					public void setBokeYonghuId(Integer bokeYonghuId) {
						this.bokeYonghuId = bokeYonghuId;
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
					public Integer getClicknum() {
						return clicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setClicknum(Integer clicknum) {
						this.clicknum = clicknum;
					}
					/**
					* 获取： 博客内容
					*/
					public String getBokeContent() {
						return bokeContent;
					}
					/**
					* 设置： 博客内容
					*/
					public void setBokeContent(String bokeContent) {
						this.bokeContent = bokeContent;
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
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
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
