package arep;

import arep.Connection.HttpConnectServices;



import java.io.IOException;

import static spark.Spark.*;

public class SparkWebApp {

    /**
     * Use method get to redirect response  http and post to receive values from .js and return values in format Json
     */
    public static void main(String[] args) throws IOException {
        port(getPort());
        get("/data", (request, response) ->{
            response.status(200);
            response.type("application/json");
            HttpConnectServices httpConnectService = new HttpConnectServices();
            String number = request.queryParams("number");
            String word = request.queryParams("operation");
            String data = httpConnectService.getData(number,word);
            return data ;
        });

    }

    /*
    * Configure port of spark framework
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4569; //returns default port if heroku-port isn't set
    }

}