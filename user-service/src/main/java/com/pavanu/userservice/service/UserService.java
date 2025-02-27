package com.pavanu.userservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavanu.userservice.repository.UserRepository;

import com.pavanu.userservice.model.User;

/**
 * User Service
 * 
 * @author PavanUppuluri
 *
 */
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User save(User user) {
		return userRepository.save(user);
	}

	public List<User> getAll() {
		List<User> users = userRepository.findAll();
		return users;
	}

	public Optional<User> get(Long id) {
		return userRepository.findById(id);
	}

	public void delete(Long id) {
		userRepository.deleteById(id);
	}

	public List<User> getBySiteId(Long siteId) {
		return userRepository.findBySiteId(siteId);
	}

	public List<User> getByOrganizationId(Long organizationId) {
		return userRepository.findByOrganizationId(organizationId);
	}
}
