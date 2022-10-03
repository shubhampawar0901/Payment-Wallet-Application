package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.entity.CurrentUserSession;
@Repository
public interface CurrentUserSessionDao extends JpaRepository<CurrentUserSession, String> {

	public CurrentUserSession findByUuid(String uuid);
}
