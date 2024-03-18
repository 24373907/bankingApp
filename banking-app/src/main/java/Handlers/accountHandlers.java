package Handlers;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONObject;
import main.webServer;
import main.Accounts;

public class accountHandlers {

    public static Handler accountHome = context -> {

        HttpResponse<JsonNode> response = Unirest.get("http://localhost:8002/account")
        .queryString("account-number", context.queryParam("accountNumber"))
        .asJson();


        System.out.println(response.getBody());
        System.out.println(response.toString());

       // System.out.println(responseObj);
        
        context.result("poes");
    };
}
