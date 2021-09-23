package Lesson7;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;
import java.util.Date;

public class Lesson7 {
    public static void main(String[] args) throws

            IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://api.openweathermap.org/data/2.5/onecall?exclude=current,minutely,hourly,alerts&lat=59.940461&lon=29.8145014&appid=c2bfa969d02d8739c3fadad5ca642794&units=metric&lang=ru")
                .method("GET", null)
                .build();
        Response response = client.newCall(request).execute();

        var json=response.body().string();
        System.out.println(json);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        WeatherResponse weather = objectMapper.readValue(json,WeatherResponse.class);
        System.out.println(weather.daily.size());
        for (int i=0; (i<weather.daily.size())&&i<5; i++) {
            var day=weather.daily.get(i);
            var date= new Date(day.dt*1000);
        System.out.println("В городе Санкт-Петербург на дату " + date+"  ожидается "+day.weather.get(0).description + ", температура  " +day.temp.day);
        }
    }
}
