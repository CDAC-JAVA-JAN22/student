package com.cybage.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cybage.model;

@Repository
public interface StudentRepo extends JPARepository<Student,Integer>{

}