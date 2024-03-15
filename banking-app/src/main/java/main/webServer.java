package main;

import io.javalin.*;
import Handlers.LoginPageHandler;
import org.thymeleaf.*;

public class webServer {

    static Javalin server;
    public static void main(String[] args) {
        
        startServer();
    }

    public static void startServer() {

        server = Javalin.create(config -> {
            config.fileRenderer(new FileRenderer());
        })
        .get("/", ctx -> LoginPageHandler.loginHandler(ctx))
        .start(8000);
    }
}
