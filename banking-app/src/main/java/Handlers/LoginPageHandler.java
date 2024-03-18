package Handlers;

import io.javalin.http.Handler;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import freemarker.template.Template;
import main.webServer;


public class LoginPageHandler {
 
    // public static Context loginHandler(Context ctx) throws IOException {

    //     ctx.result((Files.readAllBytes(Paths.get("banking-app/src/main/resources/public/login.html"))));
    //     return ctx;
    // }

    public static Handler loginHandler = context -> {
        
        Template template = webServer.fConfig.getTemplate("login.ftl");

        HashMap<String, String> data = new HashMap<>();
        data.put("daddy", "me");
        
        File index = new File("banking-app\\src\\main\\resources\\html\\login_ftl.html");
        index.createNewFile();
        Writer fWriter = new FileWriter(index);

        template.process(data, fWriter);
        context.html(new String(Files.readAllBytes(Paths.get("banking-app\\src\\main\\resources\\html\\login_ftl.html"))));

    };
}
