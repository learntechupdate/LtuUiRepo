package testscripts;

import org.testng.annotations.Test;

import pageobject.UsersPage;

public class UserSearch extends loginTest{

	@Test
	public void userSearch() {
		
		UsersPage up = new UsersPage(driver);
		up.adminTab();
		up.userNameSearchfield("Riyaz");
		up.searchButton();
		//up.resetButton();
	}
	
}
