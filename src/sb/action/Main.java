package sb.action;

import jodd.http.HttpRequest;
import jodd.http.HttpResponse;

/**
 * Created by spiritbomb on 10/8/2015.
 */
public class Main {
    public static void main(String[] args) {
        /*HttpResponse respons = HttpRequest
                .get("https://api.parse.com/1/classes/account")
                .header("X-Parse-REST-API-Key", "mowM4ZEGtaYWtPxJi21iXZXJGtvGw1VYTpMcgcoz")
                .header("X-Parse-Application-Id", "hkQOQhd0lhSbcFkGyxM8AH0CqJOXifpuyNOP1N7F")
                .query("data-urlencode", "where={\"name\":\"tuananh\"}")
                .send();
        System.out.println(respons.body());*/
        //new Main().callFunction();
        //new Main().check30request();
    }

    public void createAccount(final String name, final String ip){
        String data = "{\"name\":\"" + name + "\",\"ip\":\"" + ip + "\"}";
        HttpResponse respons = HttpRequest
                .post("https://api.parse.com/1/classes/account")
                .header("X-Parse-REST-API-Key", "mowM4ZEGtaYWtPxJi21iXZXJGtvGw1VYTpMcgcoz")
                .header("X-Parse-Application-Id", "hkQOQhd0lhSbcFkGyxM8AH0CqJOXifpuyNOP1N7F")
                .header("Content-Type", "application/json")
                .body(data)
                .send();
        System.out.println(respons.body());
    }
    public void updateIP(final String name){
        HttpResponse respons = HttpRequest
                .put("https://api.parse.com/1/classes/account/NeUilnDajt")
                .header("X-Parse-REST-API-Key", "mowM4ZEGtaYWtPxJi21iXZXJGtvGw1VYTpMcgcoz")
                .header("X-Parse-Application-Id", "hkQOQhd0lhSbcFkGyxM8AH0CqJOXifpuyNOP1N7F")
                .header("Content-Type", "application/json")
                .body("{\"ip\":\"" + getCurrentIP() + "\"}")
                .send();
        System.out.println(respons.body());
    }
    public String getCurrentIP(){
        return HttpRequest.get("http://checkip.amazonaws.com/").send().body().trim();
    }

    public void callFunction(){
        String data = "{\"name\":\"tuananh\",\"ip\":\"192.168.0.6\"}";
        HttpResponse respons = HttpRequest
                .post("https://api.parse.com/1/functions/updateip")
                .header("X-Parse-REST-API-Key", "mowM4ZEGtaYWtPxJi21iXZXJGtvGw1VYTpMcgcoz")
                .header("X-Parse-Application-Id", "hkQOQhd0lhSbcFkGyxM8AH0CqJOXifpuyNOP1N7F")
                .header("Content-Type", "application/json")
                .body(data)
                .send();
        System.out.println(respons.body());
    }

    public void check30request(){
        for(int i = 0; i < 120; ++i){
            new Thread(new More30()).start();
        }
    }
    public class More30 implements Runnable{
        @Override
        public void run() {
            HttpResponse respons = HttpRequest
                    .get("https://api.parse.com/1/classes/account")
                    .header("X-Parse-REST-API-Key", "mowM4ZEGtaYWtPxJi21iXZXJGtvGw1VYTpMcgcoz")
                    .header("X-Parse-Application-Id", "hkQOQhd0lhSbcFkGyxM8AH0CqJOXifpuyNOP1N7F")
                    .query("data-urlencode", "where={\"name\":\"tuananh\"}")
                    .send();
            System.out.println(respons.body());
        }
    }
}
