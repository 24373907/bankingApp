package Handlers;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class LoginPageHandler {
 
    // public static Context loginHandler(Context ctx) throws IOException {

    //     ctx.result((Files.readAllBytes(Paths.get("banking-app/src/main/resources/public/login.html"))));
    //     return ctx;
    // }

    public static Handler loginHandler = context -> {
        context.result((Files.readAllBytes(Paths.get("banking-app/src/main/resources/public/login.html"))));
    };
}
