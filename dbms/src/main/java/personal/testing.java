package personal;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;


public class testing {


    public static void Main(String[] args) {

        HttpResponse<JsonNode> response = Unirest.get("http://localhost:8002/account")
        .queryString("account-number", "")
        .asJson();

        
    }
}
