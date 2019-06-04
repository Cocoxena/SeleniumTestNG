package tuto.eclipse.jal.selenium.pageObjects.disponibilityPage;

import org.openqa.selenium.By;

import tuto.eclipse.jal.selenium.loaders.MyDriver;

public class DisponibilityPageActions {

	protected void clickContinueButton() {
		MyDriver.driver.findElement(By.id(DisponibilityPageIDs.CONTINUE_BUTTON_ID)).click();
	}

}
