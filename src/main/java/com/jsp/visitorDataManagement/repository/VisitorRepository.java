package com.jsp.visitorDataManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.visitorDataManagement.entity.Visitor;


public interface VisitorRepository extends JpaRepository<Visitor, Integer> 
{

}
