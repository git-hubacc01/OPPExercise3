class Account  { 
    private String bank_name; 
    private long Account_number;

    Account(String bank_name, long Account_number)   { 
        this.bank_name = bank_name; 
        this.Account_number = Account_number;
    } 
    
	public String getBankName() { 
		return this.bank_name; 
    } 
	
	public long getAccountNumber() {
		return this.Account_number;
    }
} 
