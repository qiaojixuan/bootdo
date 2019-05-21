package com.bootdo.system.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.system.domain.WedsetDO;
import com.bootdo.system.service.WedsetService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-05-20 16:09:42
 */
 
@Controller
@RequestMapping("/system/wedset")
public class WedsetController {
	@Autowired
	private WedsetService wedsetService;
	
	@GetMapping()
	@RequiresPermissions("system:wedset:wedset")
	String Wedset(){
	    return "system/wedset/wedset";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:wedset:wedset")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WedsetDO> wedsetList = wedsetService.list(query);
		int total = wedsetService.count(query);
		PageUtils pageUtils = new PageUtils(wedsetList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:wedset:add")
	String add(){
	    return "system/wedset/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:wedset:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		WedsetDO wedset = wedsetService.get(id);
		model.addAttribute("wedset", wedset);
	    return "system/wedset/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:wedset:add")
	public R save( WedsetDO wedset){
		if(wedsetService.save(wedset)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:wedset:edit")
	public R update( WedsetDO wedset){
		wedsetService.update(wedset);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:wedset:remove")
	public R remove( Integer id){
		if(wedsetService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:wedset:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		wedsetService.batchRemove(ids);
		return R.ok();
	}
	
}
