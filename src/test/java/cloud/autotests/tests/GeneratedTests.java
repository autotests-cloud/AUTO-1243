package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Проверка гугла")
    void generatedTest() {
        step("Открыть 'https://google.com/'", () -> {
            step("// todo: just add selenium action");
        });

        step("Ввести 'selenide'", () -> {
            step("// todo: just add selenium action");
        });

        step("Отправить форму", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить заголовок содержит 'selenide'", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://google.com/'", () ->
            open("https://google.com/"));

        step("Page title should have text 'Bevor Sie zur Google Suche weitergehen'", () -> {
            String expectedTitle = "Bevor Sie zur Google Suche weitergehen";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://google.com/'", () ->
            open("https://google.com/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}