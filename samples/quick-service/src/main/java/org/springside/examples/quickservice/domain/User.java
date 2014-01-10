package org.springside.examples.quickservice.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotBlank;
import org.springside.modules.domain.IdEntity;

import com.fasterxml.jackson.annotation.JsonFormat;

//JPA实体类标识
@Entity
@Table(name = "ss_user")
public class User extends IdEntity {
	private String loginName;
	private String name;
	private Date registerDate;

	public User() {
	}

	public User(Long id) {
		this.id = id;
	}

	// Bean Validator的校验规则
	@NotBlank
	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	// Bean Validator的校验规则
	@NotBlank
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 设定JSON序列化时的日期格式
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}