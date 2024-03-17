package main;

import Handlers.LoginPageHandler;
import freemarker.template.Configuration;
import io.javalin.*;
import io.javalin.http.staticfiles.Location;
import java.io.File;
import java.io.IOException;


public class webServer {

    static Javalin server;
    public static void main(String[] args) throws IOException {
        
        setupFreemakerConfig();
        startServer();
    }

    public static void startServer() {

        Javalin.create(config -> {
                    config.staticFiles.add("banking-app/src/main/resources/public", Location.EXTERNAL);
                })
                .get("/login", LoginPageHandler.loginHandler)
                .start(8079);
    }

    private static void setupFreemakerConfig() throws IOException {

        Configuration fConfiguration = new Configuration(Configuration.VERSION_2_3_32);
        fConfiguration.setDefaultEncoding("UTF-8");
        fConfiguration.setDirectoryForTemplateLoading(new File("banking-app/src/main/resources/public"));
    }
}
