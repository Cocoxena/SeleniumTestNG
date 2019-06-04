package tuto.eclipse.jal.selenium.pageObjects.passengerPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import tuto.eclipse.jal.selenium.loaders.MyDriver;

public class PassengerPageActions {

	public void selectTitle() {
		Select title = new Select(MyDriver.driver.findElement(By.id(PassengerPageIDs.TITLE)));
		title.selectByValue("MRS");
	}

}
