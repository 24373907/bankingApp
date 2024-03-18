package Handlers;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import freemarker.template.Template;
import io.javalin.http.Handler;
import main.webServer;

public class defaultHandler {

    public static Handler defaultHandler = context -> {

        Template template = webServer.fConfig.getTemplate("index.ftl");

        HashMap<String, String> data = new HashMap<>();
        data.put("daddy", "me");
        
        File index = new File("banking-app\\src\\main\\resources\\html\\index_ftl.html");
        index.createNewFile();
        Writer fWriter = new FileWriter(index);

        template.process(data, fWriter);
        context.html(new String(Files.readAllBytes(Paths.get("banking-app\\src\\main\\resources\\html\\index_ftl.html"))));
    };
}
