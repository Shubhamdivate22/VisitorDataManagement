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

@RestController  // It is combination of @Controller and @ResponseBody
public class VisitorController
{
	@Autowired  // It is used ton perform dependency injection
	private VisitorService visitorService;
	
	@PostMapping("/visitor")   // It is composed annotation that acts as a shortcut for @RequestMapping(method= RequestMethod.Post)
	public @ResponseBody Visitor saveVisitor(@RequestBody Visitor visitor)
	{
		return visitorService.saveVisitor(visitor);
	}
	
	@PutMapping("/visitor")  // It is composed annotation that acts as a shortcut for @RequestMapping(method= RequestMethod.Put)
	public @ResponseBody Visitor updateVisitor(@RequestBody Visitor visitor)
	{
		return visitorService.updateVisitor(visitor);
	}
	
	@GetMapping("/visitor")   // It is composed annotation that acts as a shortcut for @RequestMapping(method= RequestMethod.Get)
	public @ResponseBody List<Visitor> getAllVisitor()
	{
		return visitorService.getAllVisitor();
	}
	
	@GetMapping("/visitor/{id}")
	public @ResponseBody Visitor getVisitorDataById(@PathVariable("id") int id)
	{
		return visitorService.getVisitorDataById(id);
	}
	
	@DeleteMapping("/visitor")   // It is composed annotation that acts as a shortcut for @RequestMapping(method= RequestMethod.Delete)
	public @ResponseBody Visitor deleteVisitorDataById(@RequestParam("id") int id)
	{
		return visitorService.deleteVisitorDataById(id);
	}


}
