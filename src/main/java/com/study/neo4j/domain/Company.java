package com.study.neo4j.domain;

import com.study.neo4j.relationtype.RelationType;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * 公司实体
 * </p>
 *
 * @author Caratacus
 * @date 2017-03-23
 */
@NodeEntity(label = "公司")
public class Company {
	@GraphId
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@Index
	private String name;
	private String address;
	private String mobile;
	private String industry;

	@Relationship(type = RelationType.COLLEAGUE)
	public Set<User> employes = new HashSet<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public Set<User> getEmployes() {
		return employes;
	}

	public void setEmployes(Set<User> employes) {
		this.employes = employes;
	}

}
