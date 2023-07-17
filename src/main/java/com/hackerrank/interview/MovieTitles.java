package com.hackerrank.interview;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class MovieTitles {
    public String[] getMovieTitles (String substr) throws Exception {
        URI link = URI.create("https://jsonmock.hackerrank.com/api/moviesdata/search/?Title=" + substr);
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(link)
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        TitlesJson titlesPage = gson.fromJson(response.body(), TitlesJson.class);

        List<String> titlesList = new ArrayList<>();
        for(Data data : titlesPage.data) titlesList.add(data.Title);
        return titlesList.toArray(new String[0]);
    }
}

class TitlesJson {
    long page, per_page, total, total_pages;
    Data[] data;
}

class Data{
    int Year;
    String imdbID, Title;
}
