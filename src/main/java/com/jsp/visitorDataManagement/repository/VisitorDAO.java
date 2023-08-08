package com.jsp.visitorDataManagement.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.jsp.visitorDataManagement.entity.Visitor;

@Repository
public class VisitorDAO 
{
	@Autowired
	private VisitorRepository  visitorRepository;
	
	public Visitor saveVisitor(Visitor visitor)
	{
		return visitorRepository.save(visitor);
	}
	
	public Visitor updateVisitor(Visitor visitor)
	{
		return visitorRepository.save(visitor);
	}
	
	public List<Visitor> getAllVisitor()
	{
		return visitorRepository.findAll();
	}
	
	public Visitor getVisitorDataById(int id)
	{
		return visitorRepository.findById(id).orElse(new Visitor(HttpStatus.NOT_FOUND.value(),HttpStatus.NOT_FOUND.name(),HttpStatus.NOT_FOUND.name()));
	}
	
	public Visitor deleteVisitorDataById(int id)
	{
		Visitor visitor = getVisitorDataById(id);
		if(visitor.getId()!= 404)
		{
			visitorRepository.deleteById(id);
		}
		 return visitor;
	}


}
