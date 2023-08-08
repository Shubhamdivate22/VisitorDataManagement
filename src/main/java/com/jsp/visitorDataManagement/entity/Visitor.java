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

@Data    // this annotation is a shortcut to generate toString,EqulasAndHashCode,getter and setter 
@NoArgsConstructor // this annotation is used for no argument constructor
@AllArgsConstructor  // this annotation is used for parameterized constructor
@Entity                    // this annotation is used to map class with table inside db
@Table(name= "visitor_info")  //  It allows to provide the details of the table that will be used to persist the data into the db
public class Visitor implements Serializable
{
   @Id    // It is used to map the primary key column of the table
   @GeneratedValue(strategy = GenerationType.IDENTITY)  // It automatically generate primary key value
   private Integer id;
   
   @Column(nullable = false)    // It is used to map entity class properties to a column inside table
   private String name;
   
   private String email;
	
}
