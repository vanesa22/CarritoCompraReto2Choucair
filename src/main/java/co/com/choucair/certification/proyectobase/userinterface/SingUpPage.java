package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SingUpPage {
   //Registro datos personales
    public static final Target ENTER_HOME = Target.the("Selecciona Categoria Mujer").located(By.xpath("//*[@id=\"center_column\"]/ul/li/a/span"));
    public static final Target ADD_CART = Target.the("Agrega al carrito un producto").located(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[2]/div[2]/a[1]/span"));
    public static final Target ENTER_IMAGEN = Target.the("Selecciona una prenda ").located(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img"));
    public static final Target UNIT_PRICE = Target.the("Donde extra el precio dela prenda que agrego al carrito").located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[2]/table/tbody/tr[1]/td[4]/span"));
   public static final Target QUANTITY = Target.the("Donde extra el la cantidad de prendas que agrego al carrito").located(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[5]/input[2]"));
    public static final Target TOTAL_SIPPING = Target.the("Donde extra total del envio").located(By.xpath("//*[@id=\"total_shipping\"]"));
    public static final Target TOTAL_PRICE = Target.the("Donde extra el total del valor que leva en el carrito ").located(By.xpath("//*[@id=\"total_price\"]"));
   //Registro de dirreccion
    public static final Target BUTTON_CART = Target.the("Boton del carrito").located(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
    public static final Target BUTTON_CHECKOUT = Target.the("Boton de pasar por la caja").located(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
    public static final Target BUTTON_GO1 = Target.the("Da en siguiente a la parte 1 de formulario direccion ").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    //Registro de Dispositivo
    public static final Target COMPUTER_NAME = Target.the("Extrae el nombre del computador").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target COMPUTER_VERSION = Target.the("Extrae la version del computador").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target COMPUTER_LANGUAGE = Target.the("Extrae el lenguaje del computador").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));


    public static final Target BUTTON_GO2 = Target.the("Da en siguiente a la parte 2 de formulario dispositivos").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a"));
   //Registro  de Contraseña y confirmacion de privacidad
    public static final Target INPUT_PASSWORD = Target.the("Donde escribimos la contraseña").located(By.id("password"));
    public static final Target INPUT_PASSWORD_CONFIRMATION = Target.the("Donde escribimos la confirmacion de la contraseña").located(By.id("confirmPassword"));
    public static final Target CHECKBOX_UTEST = Target.the("Acepta haber leido los terminos de uTest  ").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX_PRIVACY = Target.the("Acepta haber leido los terminos de seguridad y privacidad ").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_GO3 = Target.the("Da en siguiente a la parte 4 de formulario contraseñas y terminado ").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));

}
