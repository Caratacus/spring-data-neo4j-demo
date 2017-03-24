package com.study.neo4j.relation;

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
@RelationshipEntity(type = RelationType.FRIEND)
public class User2FriendRelation{
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
	private User friend;

	public User2FriendRelation() {
	}

	public User2FriendRelation(User user, User friend) {
		this.user = user;
		this.friend = friend;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getFriend() {
		return friend;
	}

	public void setFriend(User friend) {
		this.friend = friend;
	}
}
