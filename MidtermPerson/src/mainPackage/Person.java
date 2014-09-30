package mainPackage;

public class Person {
	  
	
	private String name, address, phoneNumber, emailAddress;
	  
	
	public Person() {
		  
	  }
	 
	public Person(String name, String address, String phoneNumber, String emailAddress){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		}
	
//Getters and Setters for all four parameters.	
	public String getName(){
		return name;	
		}
	 
	public void setName(String name){
		this.name = name;
	 	}
	 
	public String getAddress(){
		return address;
	 	}
	 
	public void setAddress(String address){
		this.address = address;
	 	}
	 
	public String getPhoneNumber(){
		return phoneNumber;
		}
	 
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	 	}
	 
	public String getEmailAddress(){
		return emailAddress;
		}
	 
	public void setEmailAddress(String emailAddress){
		this.emailAddress = emailAddress;
		}
	
	
	@Override
	public String toString(){
		return getClass().getName() + "\n" + name;
		}
	}
