package com.bootdo.system.service;

import com.bootdo.system.domain.WedsetDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-05-20 16:09:42
 */
public interface WedsetService {
	
	WedsetDO get(Integer id);
	
	List<WedsetDO> list(Map <String, Object> map);
	
	int count(Map <String, Object> map);
	
	int save(WedsetDO wedset);
	
	int update(WedsetDO wedset);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
