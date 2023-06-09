abstract class Account{


	//data members
	private int ano;
	private String title;
	private double balance;

	//constructor
	public Account(){
		this(1000,"",0);
	}

	//constructor
	public Account(int a,String t,double b){
		ano=a;
		title=t;
		balance=b;
	}

	public int getAno(){
		return ano;
	}

	
	public double getBalance(){
		return balance;
	}


	public String  getTitle(){
		return title;
	}


	public void setTitle(String t){
		title=t;
	}

	//method to deposit
	public void deposit(double amt){
		balance+=amt;
		System.out.println("Balance after deposit is "+ balance);
	}

	//method definition to withdraw
	public abstract void withdraw(double amt);
}
	

	