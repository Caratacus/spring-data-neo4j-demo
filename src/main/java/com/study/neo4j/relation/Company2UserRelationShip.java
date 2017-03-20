package com.study.neo4j.relation;

import java.util.Date;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import org.neo4j.ogm.annotation.typeconversion.DateString;
import org.springframework.format.annotation.DateTimeFormat;

import com.study.neo4j.domain.Company;
import com.study.neo4j.domain.User;
import com.study.neo4j.relationtype.RelationType;

/**
 * @Author wtwei .
 * @Date 2017/3/3 .
 * @Time 17:17 .
 */
@RelationshipEntity(type = RelationType.HIRING)
public class Company2UserRelationShip {
    @GraphId
    private Long id;

    @StartNode
    private Company company;

    @EndNode
    private User user;

    @DateString
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hiringDate;

    private String hiringAddress;

    public Company2UserRelationShip(){}

    public Company2UserRelationShip(Company company, User user){
        this.company = company;
        this.user = user;
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

    public Date getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }

    public String getHiringAddress() {
        return hiringAddress;
    }

    public void setHiringAddress(String hiringAddress) {
        this.hiringAddress = hiringAddress;
    }
}
