package com.simplilearn.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {

    Admin findByUsername(String username);
}
