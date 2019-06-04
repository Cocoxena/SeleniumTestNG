package tuto.eclipse.jal.selenium.pageObjects.disponibilityPage;

import tuto.eclipse.jal.selenium.pageObjects.AllPages;

public class DisponibilityPage extends AllPages {

	public DisponibilityPage() {
		super();
		System.out.println("La page de disponibilité a été ouverte");
	}

	public void run() {
		// waitForThePage(); // we run the parent class method if we add a parameter
		// performChecks();
		performActions();
	}

//	public void waitForThePage() {
//			DisponibilityPageChecks check = new DisponibilityPageChecks();
//			check.waitForThePage();
//		}
//		

	private void performActions() {
		DisponibilityPageActions actions = new DisponibilityPageActions();
		actions.clickContinueButton();
	}

//	private void performChecks() {
//		DisponibilityPageChecks check = new DisponibilityPageChecks();
//
//	}

}
