package Interface;

public interface VotingApp {
	//public static final int age=15;
	void name();
	void registerUser();
	void requestVotingNo();
	
}

 class kids implements VotingApp
{    
	 
	 int age;
	 
	 public kids(int age) 
	 {
		this.age = age;
	}
	public void name()
	 	{
	 		
	 		System.out.println("Welcome on Registration Partal");
	 	}
	 	public void registerUser()
	 	{
	 		if(age<12)
	 			System.out.println("You have Succcessfully Register under kids");
	 		else
	 			System.out.println("You have not Succcessfully Register");
	 	}
	 	
	 	
	 	public void requestVotingNo()
	 	{
	 		if(age>12)
	 			System.out.println("Sorry cannot go for voting because Age must be greater than 12 to vote");
	 	}
}
 class Adult implements VotingApp
 {

	public void name() {
		
		
	}

	public void registerUser() {
		
		
	}

	public void requestVotingNo() {
		
		
	}
	 
	 
 }