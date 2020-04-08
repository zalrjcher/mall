/**    
 * 版本信息：    友友互娱
 * 日期：Dec 14, 2018    
 * Copyright 足下 Corporation 2018    
 * 版权所有    
 *    
 */
package com.xtuniversity.mall.model.user.dao;
import java.util.Map;
import com.xtuniversity.mall.model.user.entity.User;
import com.xtuniversity.mall.model.base.dao.IBaseDao;

/**
 * 
 * 类名称：user数据接口层 </br>
 * 类描述： </br>
 * 创建人：sky.jiang </br>
 * 
 * @version 1.0
 * 
 */
public interface IUserDao extends IBaseDao<User> {
	void auditing(Map<String, Object> maps);

	void recommend(Map<String, Object> maps);
}
