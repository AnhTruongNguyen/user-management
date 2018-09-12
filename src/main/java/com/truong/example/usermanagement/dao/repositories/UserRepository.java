package com.truong.example.usermanagement.dao.repositories;

import com.truong.example.usermanagement.dao.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
