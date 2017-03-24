package com.study.neo4j.domain;

import com.study.neo4j.relationtype.RelationType;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * 用户实体
 * </p>
 *
 * @author Caratacus
 * @date 2017-03-23
 */
@NodeEntity(label = "用户")
public class User {
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
	private String sex;
	@Index
	private String mobile;
	private Date birthday;
	private Date createdTime;
	private Date updatedTime;

	@Relationship(type = RelationType.DEVICE)
	private Set<Device> devices = new HashSet<>();
	@Relationship(type = RelationType.FRIEND)
	private Set<User> friends = new HashSet<>();
	@Relationship(type = RelationType.COLLEAGUE)
	private Set<User> colleagues = new HashSet<>();
	public void addFriend(User user) {
		this.friends.add(user);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public Set<Device> getDevices() {
		return devices;
	}

	public void setDevices(Set<Device> devices) {
		this.devices = devices;
	}

	public Set<User> getFriends() {
		return friends;
	}

	public void setFriends(Set<User> friends) {
		this.friends = friends;
	}

	public Set<User> getColleagues() {
		return colleagues;
	}

	public void setColleagues(Set<User> colleagues) {
		this.colleagues = colleagues;
	}

}
