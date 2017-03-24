package com.study.neo4j.relation;

import com.study.neo4j.domain.Company;
import com.study.neo4j.domain.User;
import com.study.neo4j.relationtype.RelationType;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.util.Date;

/**
 * <p>
 * 公司用户关系
 * </p>
 *
 * @author Caratacus
 * @date 2017-03-23
 */
@RelationshipEntity(type = RelationType.WROKING)
public class User2CompanyRelation {
	@GraphId
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@StartNode
	private User user;

	@EndNode
	private Company company;
	private Date workDate;

	public User2CompanyRelation() {
	}

	public User2CompanyRelation(User user, Company company) {
		this.user = user;
		this.company = company;
	}

	public User getUser() {
		return user;
	}

	public Company getCompany() {
		return company;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Date getWorkDate() {
		return workDate;
	}

	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}
}
