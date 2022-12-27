package pages;

import com.codeborne.selenide.Selenide;
import config.DateAdds;

import static config.DateAdds.addDays;


public class MainPage{
    public MainPage(String url) {
        Selenide.open(url);
    }

    public static void main(String[] args) {


        DateAdds dateAdds = new DateAdds();
        System.out.println(addDays("27.12.2022", 4));
    }
}
