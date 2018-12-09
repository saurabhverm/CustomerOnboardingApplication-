package com.customeronboardingApp;
import java.io.Serializable;  
import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
@XmlRootElement(name = "customer") 

public class Customer implements Serializable {  
	   private static final long serialVersionUID = 1L; 
	   private String id; 
	   private String name; 
	   private String profession;  
	   public Customer(){} 
	    
	   public Customer(String id, String name, String profession){  
	      this.id = id; 
	      this.name = name; 
	      this.profession = profession; 
	   }  
	   public String getId() { 
	      return id; 
	   }  
	   @XmlElement 
	   public void setId(String id) { 
	      this.id = id; 
	   } 
	   public String getName() { 
	      return name; 
	   } 
	   @XmlElement
	   public void setName(String name) { 
	      this.name = name; 
	   } 
	   public String getProfession() { 
	      return profession; 
	   } 
	   @XmlElement 
	   public void setProfession(String profession) { 
	      this.profession = profession; 
	   }   
	} 
