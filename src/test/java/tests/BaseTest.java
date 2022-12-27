package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static config.Config.URL;


public class BaseTest {

    public void setUp() {
        WebDriverManager.chromedriver().setup(); // автоматически скачаем драйвер, укажем путь и основные настройки
        Configuration.browser = "chrome"; // указали, какой вид браузера для селениума
        Configuration.driverManagerEnabled = true; // присутствует настройка веб менеджера (выше)
        Configuration.browserSize = "1920x1080"; // размер окна
        Configuration.headless = false;
        /*
         будем ли мы видеть браузер во время тестов
        нужна в основном для Дженкинса, потому что там нет монитора, это сервер, hadless создает некий виртуальный
        монитор и в нем запускает хром */
    }
    @BeforeEach
    public void init() { // при каждом запуске тестов будет происходить инициализация веб драйвера
        setUp();  // метод инициализации
    }
    @AfterEach
    public void tearDown() { // метод для закрытия браузера
        Selenide.closeWebDriver();
    }
    @Test
    public void test() {
        MainPage mainPage = new MainPage(URL);

    }

}


