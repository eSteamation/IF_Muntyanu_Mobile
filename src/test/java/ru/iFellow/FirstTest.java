package ru.iFellow;


import org.junit.jupiter.api.Test;
import ru.iFellow.Hooks.Hook;
import ru.iFellow.Pages.MainPage;
import ru.iFellow.Pages.OnboardingPage;
import ru.iFellow.Pages.SearchList;

public class FirstTest extends Hook {

    @Test
    public void SearchingTest() {
        OnboardingPage onboardingPage = new OnboardingPage();
        MainPage mainPage = new MainPage();
        SearchList searchList = new SearchList();

        onboardingPage.skipOnboarding();
        mainPage.searchFor("java programming");
        searchList.verify("Java", "programming");
    }
}