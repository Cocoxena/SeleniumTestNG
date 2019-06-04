package tuto.eclipse.jal.selenium.pageObjects.homePage;

import static org.junit.Assert.assertEquals;

import tuto.eclipse.jal.selenium.pageObjects.AllPages;

public class HomePage extends AllPages {

	private static final String HOME_PAGE = "> HOME_PAGE > Checks > ";
	private static final String EXPECTED_PAGE_TITLE = "JAPAN AIRLINES (JAL) - France Region - Airfare to Japan (Tokyo)";

	private static final String DEPARTURE_CITY = "NCE";
	private static final String ARRIVAL_CITY = "HND";
	private static final String DEPARTURE_DATE = "1";
	private static final String DEPARTURE_MONTH = "12";
	private static final String RETURN_DATE = "";
	private static final String RETURN_MONTH = "";
	// private static final String TRAVEL_CLASS = "Economy";

//	private pageName = 

	public HomePage() {
		super();
		System.out.println("A new home page was created");
	}

	public void run() {
		waitForThePage(); // we run the parent class method if we add a parameter
		performChecks();
		performActions();
	}

	public void waitForThePage() {
		HomePageChecks check = new HomePageChecks();
		check.waitForThePage();
		System.out.println("The Home Page has been loaded");
	}

	public void performActions() {
		HomePageActions actions = new HomePageActions();
		actions.closeModal();
		System.out.println("La fenêtre Modal a bien été fermée");
		actions.selectDepartureCity(DEPARTURE_CITY);
		actions.selectArrivalCity(ARRIVAL_CITY);
		actions.setDepartureDate(DEPARTURE_DATE, DEPARTURE_MONTH);
		actions.setReturnDate(RETURN_DATE, RETURN_MONTH);
		// actions.setTravelClass(TRAVEL_CLASS);
		// actions.setAdultNb();
		actions.clickSearchButton();
	}

	public void performChecks() {
		HomePageChecks check = new HomePageChecks();
		assertEquals(HOME_PAGE + "The title is not the expected one", EXPECTED_PAGE_TITLE, check.getPageTitle());
		System.out.println("if wrong, we dont see it");

	}

}
