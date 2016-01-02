package util;

import jodd.http.HttpRequest;
import jodd.http.HttpResponse;
import sb.action.Constant;

/**
 * Created by spiritbomb on 10/8/2015.
 */
public class ParseUtil {
    public String getCurrentIP(){
        return HttpRequest.get("http://checkip.amazonaws.com/").send().body().trim();
    }

    public void updateAddress(){
        /*HttpResponse respons = HttpRequest
                .put("https://api.parse.com/1/classes/account/"+ Constant.P.getValue("X-Parse-Object-Id"))
                .header("X-Parse-REST-API-Key", Constant.P.getValue("X-Parse-REST-API-Key"))
                .header("X-Parse-Application-Id", Constant.P.getValue("X-Parse-Application-Id"))
                .header("Content-Type", "application/json")
                .body("{\"address\":\"" + getCurrentIP() + ":" + Constant.P.getValue("port")  + "\"}")
                .send();*/
        HttpResponse response = HttpRequest.get("http://duckdns.org/update/g8tuananh.duckdns.org/8929d214-42d5-4d9f-80ee-d7aaf073c0c4/").send();
        System.out.println("Update IP: "+response.body());
    }
}
