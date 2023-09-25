package org.encap;

public class EncapLearnPOJO {
    private int customerId;
    private String password;
    public void setCustomerId(int customerId) {
    	if(customerId==123) {
    		this.customerId=1;
    	}
    	else if(customerId==321){
    		this.customerId=1;
    	}
    	else if(customerId==456){
    		this.customerId=1;
    	}
    	else {
    		this.customerId=0;
    	}
    }
    public void setPassword(String password) {
    	if(customerId==1&& password.equals("Ravi@123")) {
    		this.password="Ravi Account Authorized";
    	}
    	else if(customerId==1 && password.equals("Ram@123")){
    		this.password="Ram Account Authorized";
    	}
    	
    	else if(customerId==1 && password.equals("Babu@123")){
    		this.password="Babu Account Authorized";
    	}
    	else {
    		this.password="Invalid Account";
    	}
    }
    public int getCustomerId() {
    	if(password.equals("Ravi Account Authorized")) {
		return 10000;
    	}
    	else if(password.equals("Ram Account Authorized")) {
    	return 20000;
    	}
    	else if(password.equals("Babu Account Authorized")) {
    	return 30000;
    	}
    	else {
    		return 0;
    	}
    }
    public String getPassword() {
    	return "Thanks for using HDFC";
    }
    

}
