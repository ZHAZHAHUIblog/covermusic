package com.entity.view;

import com.entity.ZaixiantinggeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 在线听歌
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 *  
 * 
 */
@TableName("zaixiantingge")
public class ZaixiantinggeView  extends ZaixiantinggeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZaixiantinggeView(){
	}
 
 	public ZaixiantinggeView(ZaixiantinggeEntity zaixiantinggeEntity){
 	try {
			BeanUtils.copyProperties(this, zaixiantinggeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
