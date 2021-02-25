package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.loginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private String strEmail;
    private String strPassword;

    public Login(String strEmail, String strPassword) {
        this.strEmail = strEmail;
        this.strPassword = strPassword;
    }

    public static Performable onThePage(String strEmail, String strpassword) {
        return Tasks.instrumented(Login.class,strEmail,strpassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(loginPage.BUTTON_LOGIN),
                Enter.theValue(strEmail).into(loginPage.INPUT_EMAIL),
                Enter.theValue(strPassword).into(loginPage.INPUT_PASSWORD),
                Click.on(loginPage.BUTTON_ACCOUNT)
        );
    }

}
