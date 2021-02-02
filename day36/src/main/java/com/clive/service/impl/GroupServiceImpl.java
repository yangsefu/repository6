package com.clive.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clive.bean.TbItemParamGroup;
import com.clive.bean.TbItemParamKey;
import com.clive.mapper.GroupMapper;
import com.clive.service.GroupService;
@Service
public class GroupServiceImpl implements GroupService {
	@Autowired
	private GroupMapper groupMapper; 
//	@Override
//	public TbItemParamGroup findGroupById(Integer id) {
//	TbItemParamGroup group = groupMapper.findGroupById(id);
//		return group;
//	}

	@Override
	public TbItemParamKey findParamKeyById(Integer groupid) {
		TbItemParamKey paramKey = groupMapper.findParamKeyById(groupid);
		return paramKey;
	}
	

}
