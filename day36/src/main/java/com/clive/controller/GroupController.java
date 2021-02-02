package com.clive.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clive.bean.TbItemParamGroup;
import com.clive.bean.TbItemParamKey;
import com.clive.service.GroupService;

@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class GroupController {
	@Autowired
	private GroupService groupService;
	@Test
	public void demo1() {
//		TbItemParamGroup group = groupService.findGroupById(1);
//	    System.out.println(group);
//	    List<TbItemParamKey> paramKeys = group.getParamKeys();
//	  for (TbItemParamKey tbItemParamKey : paramKeys) {
//		System.out.println(tbItemParamKey);
//	}
	}
	@Test
	public void demo2() {
        TbItemParamKey paramKey = groupService.findParamKeyById(1);
	    System.out.println(paramKey);
		TbItemParamGroup group = paramKey.getGroup();
		System.out.println(group);
	 }
}
