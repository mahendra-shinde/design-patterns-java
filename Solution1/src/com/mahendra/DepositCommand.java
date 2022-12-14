package com.mahendra;

public class DepositCommand implements Command {

	private Account account;
	private Double amount;
	
	
	public DepositCommand(Account account, Double amount) {
		super();
		this.account = account;
		this.amount = amount;
	}


	@Override
	public void execute() {
		System.out.println("Depositing Rs "+amount+" into "+account.getAccNumber());
	}

}
