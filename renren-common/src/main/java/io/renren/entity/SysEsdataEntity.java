package io.renren.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 系统日志
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-08 10:40:56
 */
public class SysEsdataEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	 /*"id": 1,
     "department": "中后台研发部",
     "nodes": 13,
     "es_indices": 32,
     "idc_code": "xg",
     "create_time": "2017-04-28T17:56:35.055508",
     "update_time": "2017-05-04T21:17:29.102626",
     "name": "xg-pcd-es-srv",
     "desc": "中后台研发部专用",
     "port": 11002,
     "link": "https://t.elenet.me/ElasticSearch/xg-pcd-es-srv/_plugin/",
     "soa_reginfo": "infra.pcd.elasticsearch:overall.xg",
     "huskar_registered": false,
     "creator": null,
     "updater": null*/
	
	private Long id;
	
	private String department;
	
	private String nodes;
	
	private String es_indices;
	
	private String idc_code;
	
	private Date create_time;
	
	private Date update_time;
	
	private String name;

	private String desc;

	private String port;
	
	private String link;
	
	private String soa_reginfo;
	
	private String huskar_registered;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getNodes() {
		return nodes;
	}

	public void setNodes(String nodes) {
		this.nodes = nodes;
	}

	public String getEs_indices() {
		return es_indices;
	}

	public void setEs_indices(String es_indices) {
		this.es_indices = es_indices;
	}

	public String getIdc_code() {
		return idc_code;
	}

	public void setIdc_code(String idc_code) {
		this.idc_code = idc_code;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getSoa_reginfo() {
		return soa_reginfo;
	}

	public void setSoa_reginfo(String soa_reginfo) {
		this.soa_reginfo = soa_reginfo;
	}

	public String getHuskar_registered() {
		return huskar_registered;
	}

	public void setHuskar_registered(String huskar_registered) {
		this.huskar_registered = huskar_registered;
	}

	
	
	
}
