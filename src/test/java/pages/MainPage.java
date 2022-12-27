package pages;

import com.codeborne.selenide.Selenide;

public class MainPage {
    public MainPage(String url) {
        Selenide.open(url);
    }
}
