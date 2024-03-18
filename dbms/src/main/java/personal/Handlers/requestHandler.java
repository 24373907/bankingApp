package personal.Handlers;

import io.javalin.http.Handler;
import kong.unirest.JsonNode;
import kong.unirest.json.JSONObject;

public class requestHandler {


    public static Handler reqHandler = context -> {

        System.out.println(context.queryParam("account-number"));
        
        JSONObject jsonResult = new JSONObject();

        jsonResult.append("success", true);

        context.json(jsonResult);
        //context.result("pussyboi");
    };
}
