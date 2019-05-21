package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.WedsetDao;
import com.bootdo.system.domain.WedsetDO;
import com.bootdo.system.service.WedsetService;



@Service
public class WedsetServiceImpl implements WedsetService {
	@Autowired
	private WedsetDao wedsetDao;
	
	@Override
	public WedsetDO get(Integer id){
		return wedsetDao.get(id);
	}
	
	@Override
	public List<WedsetDO> list(Map<String, Object> map){
		return wedsetDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return wedsetDao.count(map);
	}
	
	@Override
	public int save(WedsetDO wedset){
		return wedsetDao.save(wedset);
	}
	
	@Override
	public int update(WedsetDO wedset){
		return wedsetDao.update(wedset);
	}
	
	@Override
	public int remove(Integer id){
		return wedsetDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return wedsetDao.batchRemove(ids);
	}
	
}
