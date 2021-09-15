package com.med.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.med.model.User;

@Repository
public interface MedicalRepository extends JpaRepository<User, Long> {

}
