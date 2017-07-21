package com.weapp.entity.auth;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * API接口管理
 * @author xiaoqiang
 *
 */
@Document(collection="t_apis")
@Data
@AllArgsConstructor
public class ApiInfo {
	@Id
	private String id;
	/*接口名称*/
	private String name;
	/*接口地址*/
	private String uri;
	/*权限之和
	 * Get = 1
	 * POST = 2 
	 * PUT = 4
	 * DELETE = 8
	 */
	private Integer crud;
	/*每天调用次数上限*/
	private Integer accessLimit;
	/*版本号*/	
	private String version;
	/*是否可用*/
	private boolean disabled;
	/*解密算法*/	
	private String algorithm;
	
	private Date createDate;
	public ApiInfo(String name,String uri, Integer accessLimit, String version, boolean disabled, String algorithm, Date createDate) {
		super();
		this.name = name;
		this.uri = uri;
		this.accessLimit = accessLimit;
		this.version = version;
		this.disabled = disabled;
		this.algorithm = algorithm;
		this.createDate = createDate;
	}

	public ApiInfo() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Integer getCrud() {
		return crud;
	}

	public void setCrud(Integer crud) {
		this.crud = crud;
	}

	public Integer getAccessLimit() {
		return accessLimit;
	}

	public void setAccessLimit(Integer accessLimit) {
		this.accessLimit = accessLimit;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
