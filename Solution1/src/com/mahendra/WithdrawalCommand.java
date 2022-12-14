package com.mahendra;

public class WithdrawalCommand implements Command {

	private Account account;
	private Double amount;
	
	
	public WithdrawalCommand(Account account, Double amount) {
		super();
		this.account = account;
		this.amount = amount;
	}


	@Override
	public void execute() {
		System.out.println("Withdrawing Rs "+amount+" from "+account.getAccNumber());
	}

}
