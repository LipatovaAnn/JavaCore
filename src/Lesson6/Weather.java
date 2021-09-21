package Lesson6;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Weather {
    public static void main(String[] args) throws

            IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://api.openweathermap.org/data/2.5/forecast?lat=59.940461&lon=29.8145014&appid=c2bfa969d02d8739c3fadad5ca642794&units=metric&lang=ru")
                .method("GET", null)
                .build();
        Response response = client.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(response.isRedirect());
        System.out.println(response.isSuccessful());
        System.out.println(response.protocol());
        System.out.println(response.receivedResponseAtMillis());
        System.out.println(response.body().string());
    }
}


