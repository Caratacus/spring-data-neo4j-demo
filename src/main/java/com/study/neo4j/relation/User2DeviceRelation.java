package com.study.neo4j.relation;

import com.study.neo4j.domain.Device;
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
@RelationshipEntity(type = RelationType.DEVICE)
public class User2DeviceRelation {
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
	private Device device;

	public User2DeviceRelation() {
	}

	public User2DeviceRelation(User user, Device device) {
		this.user = user;
		this.device = device;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

}
