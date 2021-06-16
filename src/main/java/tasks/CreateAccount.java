package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.UtesCreateAccount;


public class CreateAccount implements Task {

    private String strFistName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strPassword;


    public CreateAccount(String strFistName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strPassword) {
        this.strFistName = strFistName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strPassword = strPassword;
    }

    public static CreateAccount onThePage(String strFistName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strPassword) {
        return Tasks.instrumented(CreateAccount.class, strFistName, strLastName, strEmail, strMonth, strDay, strYear, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtesCreateAccount.JOIN_TODAY_BUTTON),
                Enter.theValue(strFistName).into(UtesCreateAccount.INPUT_FIST_NAME),
                Enter.theValue(strLastName).into(UtesCreateAccount.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(UtesCreateAccount.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMonth).from(UtesCreateAccount.INPUT_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(UtesCreateAccount.INPUT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(UtesCreateAccount.INPUT_YEAR),
                Click.on(UtesCreateAccount.NEXT_BUTTON),
                Click.on(UtesCreateAccount.DEVICES_BUTTON),
                Click.on(UtesCreateAccount.LAST_STEP_BUTTON),
                Enter.theValue(strPassword).into(UtesCreateAccount.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(UtesCreateAccount.INPUT_CONFIRM_PASSWORD),
                Click.on(UtesCreateAccount.INPUT_ACCEPT_TERMS),
                Click.on(UtesCreateAccount.INPUT_ACCEPT_PRIVACY),
                Click.on(UtesCreateAccount.INPUT_COMPLETE)

        );
    }
}
