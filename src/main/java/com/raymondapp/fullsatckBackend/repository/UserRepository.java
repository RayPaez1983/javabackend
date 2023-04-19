package com.raymondapp.fullsatckBackend.repository;

import com.raymondapp.fullsatckBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
