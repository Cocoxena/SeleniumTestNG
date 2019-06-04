package tuto.eclipse.testCases;

import org.testng.annotations.Test;

//import org.junit.Test;

import tuto.eclipse.jal.selenium.loaders.BookingFlow;

/**
 * Test to check the booking flow until payment page
 */
public class TestBookingJAL1 extends BookingFlow {

	// création d'une pause avant de cliquer virtuellement sur le bouton "Continue"
	private static void pause(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	@Test
	public void testBooking1() {

		this.run(); // run default tests from the BookingFlow

		pause(3);
		// MyDriver.quitDriver();
	}

//	@Override
//	protected void run() {
//		
//	}
}
