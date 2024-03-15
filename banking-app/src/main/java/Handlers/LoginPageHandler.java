package Handlers;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class LoginPageHandler {


    public static Context loginHandler(Context ctx) {


        return ctx.render("banking-app\\src\\main\\resources\\html\\index.html");
    }
}
