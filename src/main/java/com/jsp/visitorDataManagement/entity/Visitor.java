package com.jsp.visitorDataManagement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "visitor_info")
public class Visitor implements Serializable
{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   
   @Column(nullable = false)
   private String name;
   
   private String email;
	
}
