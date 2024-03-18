package personal;

import io.javalin.Javalin;
import personal.Handlers.requestHandler;

public class DBWebServer {

    public static Javalin server;
    
    public static void main(String[] args) {

        server = Javalin.create()
        .get("/account", requestHandler.reqHandler)
        .start(8002);
    }
}


