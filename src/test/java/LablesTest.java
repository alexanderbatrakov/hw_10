
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class LablesTest {
    @Test
    @Feature("Issue в репозитории")
    @Story("Создание Issue")
    @Owner("batrakov")
    @Severity(SeverityLevel.CRITICAL)
    @Link(value = "Testing", url = "https://testing.github.com/")
    @DisplayName("Создание Issue для авторизованного пользователя")
    public void testStaticLabels(){

    }
}
