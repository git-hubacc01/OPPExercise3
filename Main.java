class Main  
{ 
    public static void main (String[] args)  
    { 
        Employee emp = new Employee("Anthony Salloman"); 
        Account acc = new Account("Landbank", 12319); 

        System.out.println(emp.getEmployeeName() +  
						   " has an account with " + acc.getBankName() + " with Account Number:"
						   + acc.getAccountNumber()); 
    } 
}
