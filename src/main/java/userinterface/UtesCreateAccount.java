package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtesCreateAccount {
    public static final Target JOIN_TODAY_BUTTON = Target.the("Button that takes us to the registration page")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target INPUT_FIST_NAME = Target.the("Enter Name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Enter the last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Enter email")
            .located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("Enter month of birth")
            .located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the("Enter day of birth")
            .located(By.id("birthDay"));
    public static final Target INPUT_YEAR = Target.the("Enter year of birth")
            .located(By.id("birthYear"));
    public static final Target NEXT_BUTTON = Target.the("Next page")
            .located(By.xpath("//span[contains(text(), 'Next: Location')]"));
    public static final Target DEVICES_BUTTON = Target.the("Next Devices")
            .located(By.className("btn-blue"));
    public static final Target LAST_STEP_BUTTON = Target.the("Next Last Step")
            .located(By.xpath("//a/span[contains(text(), 'Next: Last Step')]"));
    public static final Target INPUT_PASSWORD = Target.the("Enter Password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Confirm Password")
            .located(By.id("confirmPassword"));
    public static final Target INPUT_ACCEPT_TERMS = Target.the("Accept the Terms")
            .located(By.id("termOfUse"));
    public static final Target INPUT_ACCEPT_PRIVACY = Target.the("Accept the Privacy")
            .located(By.id("privacySetting"));
    public static final Target INPUT_COMPLETE = Target.the("Complete Setup")
            .located(By.id("laddaBtn"));
    public static final Target WELCOM_MESSAGE = Target.the("Show welcome message")
            .located(By.xpath("//h1[contains(text(), 'Welcome to the world')]"));
}
