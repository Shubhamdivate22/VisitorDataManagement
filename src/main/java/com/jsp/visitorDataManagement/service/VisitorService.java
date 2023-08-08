package com.jsp.visitorDataManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.visitorDataManagement.entity.Visitor;
import com.jsp.visitorDataManagement.repository.VisitorDAO;

@Service  // This annotation is used to create a bean and provide identification as a service class
public class VisitorService
{
	@Autowired
	private VisitorDAO visitorDAO;
	
	public Visitor saveVisitor(Visitor visitor)
	{
		return visitorDAO.saveVisitor(visitor);
	}
	
	public Visitor updateVisitor(Visitor visitor)
	{
		return visitorDAO.updateVisitor(visitor);
	}
	
	public List<Visitor> getAllVisitor()
	{
		return visitorDAO.getAllVisitor();
	}
	
	public Visitor getVisitorDataById(int id)
	{
		return visitorDAO.getVisitorDataById(id);
	}
	
	public Visitor deleteVisitorDataById(int id)
	{
		return visitorDAO.deleteVisitorDataById(id);
	}

}
