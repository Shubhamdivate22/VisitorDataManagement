package com.jsp.visitorDataManagement.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.visitorDataManagement.entity.Visitor;
import com.jsp.visitorDataManagement.service.VisitorService;

@RestController
public class VisitorController
{
	@Autowired
	private VisitorService visitorService;
	
	@PostMapping("/visitor")
	public @ResponseBody Visitor saveVisitor(@RequestBody Visitor visitor)
	{
		return visitorService.saveVisitor(visitor);
	}
	
	@PutMapping("/visitor")
	public @ResponseBody Visitor updateVisitor(@RequestBody Visitor visitor)
	{
		return visitorService.updateVisitor(visitor);
	}
	
	@GetMapping("/visitor")
	public @ResponseBody List<Visitor> getAllVisitor()
	{
		return visitorService.getAllVisitor();
	}
	
	@GetMapping("/visitor/{id}")
	public @ResponseBody Visitor getVisitorDataById(@PathVariable("id") int id)
	{
		return visitorService.getVisitorDataById(id);
	}
	
	@DeleteMapping("/visitor")
	public @ResponseBody Visitor deleteVisitorDataById(@RequestParam("id") int id)
	{
		return visitorService.deleteVisitorDataById(id);
	}


}
