package com.study.neo4j.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.neo4j.domain.User;
import com.study.neo4j.repository.UserRepository;
import com.study.neo4j.service.UserService;

/**
 * @Author wtwei
 * @Date 2017/3/2
 * @Time 15:39
 */
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserRepository userRepository;

	@Override
	@Transactional
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	@Transactional
	public void delete(User user) {
		userRepository.delete(user);
	}

	@Override
	@Transactional
	public User findById(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	@Transactional
	public List<User> findAll() {
		Iterable<User> tmpUsers = userRepository.findAll();
		List<User> users = new ArrayList<>();
		for (User tmpUser : tmpUsers) {
			users.add(tmpUser);
		}
		return users;
	}

	@Override
	@Transactional
	public List findByName(String name) {
		return userRepository.findByName(name);
	}

	@Override
	@Transactional
	public void deleteAll() {
		userRepository.deleteAll();
	}

	@Override
	@Transactional
	public List findUserByMobile(String mobile) {
		return userRepository.findByMobile(mobile);
	}
}
