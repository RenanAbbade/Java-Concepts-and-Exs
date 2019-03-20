package entities;



public class Account {



	private Integer number;

	private String holder;

	protected Double balance;

		

	public Account() {

	}

	

	public Account(Integer number, String holder, Double balance) {

		this.number = number;

		this.holder = holder;

		this.balance = balance;

	}



	public Integer getNumber() {

		return number;

	}



	public void setNumber(Integer number) {

		this.number = number;

	}



	public String getHolder() {

		return holder;

	}



	public void setHolder(String holder) {

		this.holder = holder;

	}



	public Double getBalance() {

		return balance;

	}



	public void withdraw(double amount) {

		balance -= amount + 5.0;

	}



	public void deposit(double amount) {

		balance += amount;

	}

}

------------------------------------------------------------------------------------------------------------------------------
package entities;



public class SavingsAccount extends Account {

	

	private Double interestRate;

	

	public SavingsAccount() {

		super();

	}



	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {

		super(number, holder, balance);

		this.interestRate = interestRate;

	}



	public Double getInterestRate() {

		return interestRate;

	}



	public void setInterestRate(Double interestRate) {

		this.interestRate = interestRate;

	}

	

	public void updateBalance() {

		balance += balance * interestRate;

	}

	

	@Override //por semantica, eu indico ao compilador que a proxima linha contera sobrescrita de métodos da classe filha sobescrevendo método da classe mãe

	public void withdraw(double amount) {

		balance -= amount;

	}

}
