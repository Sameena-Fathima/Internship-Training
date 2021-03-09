package day13;

import java.util.HashMap;
import java.util.Map;

public class Prog4 {

}

class AccountManager { 
//	private Map accountTotals = new HashMap(); 
	private Map<String, Integer> accountTotals = new HashMap<>(); //appropriate types have to be mentioned
	private int retirementFund; 
	
	public int getBalance(String accountName) { 	
		Integer total = (Integer) accountTotals.get(accountName); 
		if (total == null) 
			total = Integer.valueOf(0); 
		return total.intValue(); 
	}
	
	public void setBalance(String accountName, int amount) { 
		accountTotals.put(accountName, Integer.valueOf(amount)); 
	} 
} 
