package com.clive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.clive.bean.TbItemParamGroup;
import com.clive.bean.TbItemParamKey;



public interface GroupService {
	
	/**
	 * 根据规格参数组的id 查询规格参数组信息和这个组对应的项信息
	 * @param id 规格参数组id
	 * @return
	 */
//   TbItemParamGroup findGroupById(Integer id);
	/**
	 * 
	 * @param id 规格参数组id
	 * @return 根据规格参数组的id 查询规格参数组信息和这个组对应的项信息
	 */
    TbItemParamKey findParamKeyById(Integer id);	
}
