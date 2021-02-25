package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class loginPage {
    public static final Target INPUT_EMAIL = Target.the("Donde escribimos el correo ").located(By.id("email"));
    public static final Target INPUT_PASSWORD = Target.the("Donde escribimos La contraseña ").located(By.id("passwd"));
    public static final Target BUTTON_LOGIN = Target.the("Da en el boton para Login ").located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));

    public static final Target BUTTON_ACCOUNT = Target.the("Da en inicio sesion ").located(By.id("SubmitLogin"));

}
