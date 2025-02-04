
package com.service;

import java.util.Map;

import com.baomidou.mybatisplus.service.IService;
import com.entity.ConfigEntity;
import com.utils.PageUtils;


/**
 * 系统用户
 * @author zhazhahui

 */
public interface ConfigService extends IService<ConfigEntity> {
	PageUtils queryPage(Map<String, Object> params);
}
