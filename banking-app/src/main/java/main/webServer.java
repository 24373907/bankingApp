package main;

import Handlers.LoginPageHandler;
import Handlers.defaultHandler;
import Handlers.accountHandlers;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import io.javalin.*;
import io.javalin.http.staticfiles.Location;

import java.io.File;
import java.io.IOException;


public class webServer {

    public static Javalin server;
    public static Configuration fConfig; 

    public static void main(String[] args) throws IOException, TemplateException {
        
        fConfig = setupFreemakerConfig();
        server = startServer();
    }

    public static Javalin startServer() {

        return Javalin.create(config -> {
                    config.staticFiles.add("banking-app/src/main/resources/template", Location.EXTERNAL);
                })
                .get("/", defaultHandler.defaultHandler)
                .get("/login", LoginPageHandler.loginHandler)
                .get("/acc-home", accountHandlers.accountHome)
                .start(8001);
    }

    private static Configuration setupFreemakerConfig() throws IOException {

        Configuration fConfiguration = new Configuration(Configuration.VERSION_2_3_32);
        fConfiguration.setDefaultEncoding("UTF-8");
        fConfiguration.setDirectoryForTemplateLoading(new File("banking-app/src/main/resources/template"));
        fConfiguration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

        return fConfiguration;
    }
}
