package arep;

import arep.model.Calculation;
import com.google.gson.Gson;


import java.io.IOException;

import static spark.Spark.*;

public class SparkWebApp {

    /**
     * Use method get to redirect to index.html and post to receive values from .js and return values in format Json
     */
    public static void main(String[] args) throws IOException {
        port(getPort());
        get("/data", (request, response) ->{
            response.status(200);
            response.type("application/json");
            String number = request.queryParams("number");
            String word = request.queryParams("operation");
            Calculation calculateValue = new Calculation();
            double value = calculateValue.calculate(number,word);
            return new Gson().toJson("{\"respuesta\": \""+value+"\"}") ;
        });
    }

    /*
    * Configure port of spark framework
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set
    }

}