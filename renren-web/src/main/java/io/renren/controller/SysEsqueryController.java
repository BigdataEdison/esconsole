package io.renren.controller;


import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import io.renren.entity.SysEsdataEntity;
import io.renren.service.SysLogService;
import io.renren.utils.HttpRequest;
import io.renren.utils.PageUtils;
import io.renren.utils.*;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


/**
 * 系统日志
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-08 10:40:56
 */
@Controller
@RequestMapping("/sys/esquery")
public class SysEsqueryController {
	protected final static Logger logger = LoggerFactory.getLogger(SysEsqueryController.class);

	@Autowired
	private SysLogService sysLogService;
	
	/**
	 * 列表
	 */
	@ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("sys:log:list")
	public R list(@RequestParam Map<String, Object> params){
		logger.info("esquery---->"+params.get("name").toString());
		String name = params.get("name").toString();
		//得到string
		String resultdata = HttpRequest.sendGet("http://ebm.elenet.me/services/es/clusters/", "name="+name);
		//json格式
		JSONObject json = JSONObject.parseObject(resultdata);		
		logger.info("1.==>"+json);
		//提取data
		List<Object> dataList = json.getJSONArray("data");
		
		logger.info("2.==>"+dataList);//正常
		JSONObject page = json.getJSONObject("page");
		//当前页
		int current = page.getInteger("current");
		
		//总页数
		int total = page.getInteger("total");
		/*
		Query query = new Query(params);
		List<SysLogEntity> sysLogList = sysLogService.queryList(query);
		int total = sysLogService.queryTotal(query);*/
		
		PageUtils pageUtil = new PageUtils(dataList, total, 10, current);
		return R.ok().put("page", pageUtil);
	}
	
}
