package task_16;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Task16CustomTrelloTest {

    private static final String KEY = System.getenv("KEY");
    private static final String TOKEN = System.getenv("TOKEN");

    @Test
    void customTrelloTest() throws IOException, InterruptedException, URISyntaxException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://api.trello.com/1/organizations?key=" + KEY + "&token=" + TOKEN + "&displayName=TestName"))
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse <String> createOrganizationResponse = HttpClient.newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(createOrganizationResponse.body());
        Assert.assertEquals(createOrganizationResponse.statusCode(), 200, "Invalid StatusCode");

    }
}
