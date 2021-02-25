package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.SingUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
//import net.serenitybdd.screenplay.actions.
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

public class SingUp implements Task{
    Boolean register = Boolean.TRUE;
    public SingUp( )    {

    }
    public SingUp(Boolean register )
    {
        this.register= register;
    }
    public static SingUp the(){
        return Tasks.instrumented(SingUp.class);
    }

    public static SingUp the(Boolean register){
        return Tasks.instrumented(SingUp.class,register);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        if (this.register){
        actor.attemptsTo(Click.on(SingUpPage.ENTER_HOME));
        }
        actor.attemptsTo(Scroll.to(SingUpPage.ENTER_IMAGEN),
                MoveMouse.to(SingUpPage.ENTER_IMAGEN),
                Click.on(SingUpPage.ADD_CART),
                Click.on(SingUpPage.BUTTON_CHECKOUT));


    }


}
