package com.serenitydemo.www.tasks;

import com.serenitydemo.www.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.ClearElement;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    String userName;
    String password;

    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public static Login on(String userName, String password) {
        return Tasks.instrumented(Login.class, userName, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(userName).into(LoginPage.USER),
                Enter.theValue(password).into(LoginPage.PASSWORD),
                Click.on(LoginPage.BUTTONSIGNIN));
    }
}
