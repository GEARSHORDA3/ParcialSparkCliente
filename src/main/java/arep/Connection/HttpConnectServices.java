package arep.Connection;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;


public class HttpConnectServices {


    public String getData(String number, String operation) {
        String answerByApi = null;
        Request request = new Request.Builder()
                .url("https://davidvargasarepcalculo.herokuapp.com/data?number=" + number + "&operation="+operation)
                .get()
                .build();
        OkHttpClient httpClient = new OkHttpClient();

        Response answer;

        try {
            answer = httpClient.newCall(request).execute();
            if (answer.isSuccessful()) {
                answerByApi = answer.body().string();
            }
        } catch (IOException e) {
        }
        return answerByApi;
    }

}
