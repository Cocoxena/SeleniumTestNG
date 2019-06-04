package tuto.eclipse.jal.selenium.pageObjects.passengerPage;

import tuto.eclipse.jal.selenium.pageObjects.AllPages;

public class PassengerPage extends AllPages {

	public PassengerPage() {
		super();
		System.out.println("La page d'informations passager(s) a été ouverte");
	}

	public void run() {
		// waitForThePage(); // we run the parent class method if we add a parameter
		performChecks();
		performActions();
	}

	private void performActions() {
		PassengerPageActions actions = new PassengerPageActions();
		// actions.

	}

	private void performChecks() {
		// TODO Auto-generated method stub

	}

}
