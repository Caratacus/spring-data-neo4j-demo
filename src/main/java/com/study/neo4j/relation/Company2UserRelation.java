package com.study.neo4j.relation;

import com.study.neo4j.domain.Company;
import com.study.neo4j.domain.User;
import com.study.neo4j.relationtype.RelationType;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 * <p>
 * 公司用户关系
 * </p>
 *
 * @author Caratacus
 * @date 2017-03-23
 */
@RelationshipEntity(type = RelationType.EMPLOYEE)
public class Company2UserRelation{
	@GraphId
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@StartNode
	private Company company;
	@EndNode
	private User user;

	public Company2UserRelation(Company company, User user) {
		this.user = user;
		this.company = company;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
