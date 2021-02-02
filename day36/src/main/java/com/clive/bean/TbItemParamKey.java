package com.clive.bean;

import java.io.Serializable;

public class TbItemParamKey implements Serializable{
	private Integer Id;
	private String paramName;
//	从这里看是多对一关系
	private TbItemParamGroup group;
	
	
	public TbItemParamGroup getGroup() {
		return group;
	}
	public void setGroup(TbItemParamGroup group) {
		this.group = group;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getParamName() {
		return paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	@Override
	public String toString() {
		return "TbItemParamKey [Id=" + Id + ", paramName=" + paramName + "]";
	} 
	
}
