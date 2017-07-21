package com.weapp.entity.auth;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * API访问日志
 * @author xiaoqiang
 *
 */
@Document(collection="t_access_logs")
@Data
@AllArgsConstructor
public class AccessLog {
	@Id
	private String id;
	/*api名称*/	
	private String apiName;
	/*接口路径*/
	private String uri;
	/*访问时间*/	
	private Date accessDate;
	/*请求参数*/	
	private String reqParam;
	/*返回参数*/	
	private String resParam;
	/*异常内容*/	
	private String exp;

	public AccessLog(String apiName, String uri, Date accessDate, String reqParam, String resParam, String exp) {
		super();
		this.apiName = apiName;
		this.uri = uri;
		this.accessDate = accessDate;
		this.reqParam = reqParam;
		this.resParam = resParam;
		this.exp = exp;
	}

	public AccessLog() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Date getAccessDate() {
		return accessDate;
	}

	public void setAccessDate(Date accessDate) {
		this.accessDate = accessDate;
	}

	public String getReqParam() {
		return reqParam;
	}

	public void setReqParam(String reqParam) {
		this.reqParam = reqParam;
	}

	public String getResParam() {
		return resParam;
	}

	public void setResParam(String resParam) {
		this.resParam = resParam;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}
}
