package ru.iFellow.Pages;

public class MainPage extends BasePage {

    public void searchFor(String searchText) {
        driver.findElement(searchQuery).click();
        driver.findElement(searchInput).sendKeys(searchText);
    }
}