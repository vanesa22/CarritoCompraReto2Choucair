package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.SingUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;

import java.util.Arrays;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer() {
    }

    public static Answer toThe(){
        return new Answer();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;

        Double total=0.0;
       // Double quantity= 1.0;
       String quantity = Value.of(SingUpPage.QUANTITY).viewedBy(actor).asString();

        String unite_price = Text.of(SingUpPage.UNIT_PRICE).viewedBy(actor).asString();
        String[] unite_price1 = unite_price.split("\\$");
        String total_sipping = Text.of(SingUpPage.TOTAL_SIPPING).viewedBy(actor).asString();
        String[] total_sipping1 = total_sipping.split("\\$");
        String total_price = Text.of(SingUpPage.TOTAL_PRICE).viewedBy(actor).asString();
        String[] total_price1 = total_price.split("\\$");



        Double precio_unitario = Double.parseDouble(unite_price1[1]);
        Double precio_envio = Double.parseDouble(total_sipping1[1]);
        Double precio_total = Double.parseDouble(total_price1[1]);
        Double cantidad = Double.parseDouble(quantity);

        total =(cantidad*precio_unitario)+precio_envio;

        if (Double.compare(total, precio_total) == 0 ){
            result = true;
        }

        return result;
    }
}
