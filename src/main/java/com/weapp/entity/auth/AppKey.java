package com.weapp.entity.auth;

import java.util.Date;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * app认证实体
 * @author xiaoqiang
 *
 */
@Document(collection="t_appkeys")
@Data
@AllArgsConstructor
public class AppKey {
	@Id
	private String id;
	/*分发的应用ID*/
	private String appId;
	/*密钥*/	
	private String secretKey;
	/*创建日期*/	
	private Date createDate;
	/*有效截止日期，为2030-01-01 00：00:00表示无日期限制*/	
	private Date validDate;
	/*应用权限等级*/	
	private String appGrade;
	/*是否禁用*/	
	private Boolean disabled;
	/*拥有的api，及调用次数上限*/	
	private Map<String, Map<String,Integer>> apis;

	public AppKey(String appId, String secretKey, Date createDate, Date validDate, String appGrade, Boolean disabled,
			Map<String, Map<String,Integer>> apis) {
		super();
		this.appId = appId;
		this.secretKey = secretKey;
		this.createDate = createDate;
		this.validDate = validDate;
		this.appGrade = appGrade;
		this.disabled = disabled;
		this.apis = apis;
	}

	public AppKey() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getValidDate() {
		return validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

	public String getAppGrade() {
		return appGrade;
	}

	public void setAppGrade(String appGrade) {
		this.appGrade = appGrade;
	}

	public Boolean getDisabled() {
		return disabled;
	}

	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}

	public Map<String, Map<String, Integer>> getApis() {
		return apis;
	}

	public void setApis(Map<String, Map<String, Integer>> apis) {
		this.apis = apis;
	}
}
