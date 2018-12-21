package com.zhiyou.model;

import java.security.Timestamp;

public class Role {
	private int role_id;
	private String role_name;
	private String role_desc;
	private int role_permission;
	private int status;
	private String remark;
	private Timestamp create_time;
	private int creater;
	private Timestamp update_time;
	private int updater;
	
	public Role() {
	
	}
	public void setRole_id(int role_id) {
		this.role_id=role_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getRole_desc() {
		return role_desc;
	}
	public void setRole_desc(String role_desc) {
		this.role_desc = role_desc;
	}
	public int getRole_permission() {
		return role_permission;
	}
	public void setRole_permission(int role_permission) {
		this.role_permission = role_permission;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public int getCreater() {
		return creater;
	}
	public void setCreater(int creater) {
		this.creater = creater;
	}
	public Timestamp getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}
	public int getUpdater() {
		return updater;
	}
	public void setUpdater(int updater) {
		this.updater = updater;
	}
	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", role_name=" + role_name + ", role_desc=" + role_desc
				+ ", role_permission=" + role_permission + ", status=" + status + ", remark=" + remark
				+ ", create_time=" + create_time + ", creater=" + creater + ", update_time=" + update_time
				+ ", updater=" + updater + "]";
	}
	
}
