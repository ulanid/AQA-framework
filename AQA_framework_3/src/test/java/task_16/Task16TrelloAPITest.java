package task_16;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import task_16.requests.CreateBoardRequest;
import task_16.requests.CreateMemberRequest;
import task_16.requests.CreateOrganizationRequest;
import task_16.responses.BoardResponse;
import task_16.responses.MemberResponse;
import task_16.responses.OrganizationResponse;

import static io.restassured.RestAssured.given;

public class Task16TrelloAPITest {

    private static final String KEY = System.getenv("KEY");
    private static final String TOKEN = System.getenv("TOKEN");

    @Test
    void createAndValidateTeam() {
        CreateOrganizationRequest orgRequest = new CreateOrganizationRequest("Team1", "https://developer.atlassian.com/", "smth", "TestTeamName");

        Response organizationResponse = given()
                .header("Accept", "application/json")
                .contentType(ContentType.JSON)
                .queryParam("displayName", orgRequest.getDisplayName())
                .queryParam("key", KEY)
                .queryParam("token", TOKEN)
                .queryParam("website", orgRequest.getWebsite())
                .queryParam("desc", orgRequest.getDesc())
                .queryParam("name", orgRequest.getName())
                .post("https://api.trello.com/1/organizations")
                .then()
                .statusCode(200)
                .extract().response();

        OrganizationResponse orgActualResponse = organizationResponse.as(OrganizationResponse.class);
        Assert.assertEquals(orgActualResponse.getDisplayName(), "Team1", "Organization display name does not match!");

        CreateBoardRequest boardRequest = new CreateBoardRequest("Board1", orgActualResponse.getId());
        Response boardResponse = given()
                .header("Accept", "application/json")
                .contentType(ContentType.JSON)
                .queryParam("name", boardRequest.getName())
                .queryParam("key", KEY)
                .queryParam("token", TOKEN)
                .queryParam("idOrganization", boardRequest.getIdOrganization())
                .post("https://api.trello.com/1/boards/")
                .then()
                .statusCode(200)
                .extract().response();

        BoardResponse boardActualResponse = boardResponse.as(BoardResponse.class);
        Assert.assertEquals(boardActualResponse.getName(), "Board1", "Board name does not match!");

        CreateMemberRequest memberRequest = new CreateMemberRequest("test@email.com", "Name Surname");
        String inviteUrl = "https://api.trello.com/1/tokens/" + TOKEN + "/member";
        Response memberResponse = given()
                .header("Accept", "application/json")
                .contentType(ContentType.JSON)
                .queryParam("key", KEY)
                .queryParam("token", TOKEN)
                .queryParam("email", memberRequest.getEmail())
                .queryParam("fullName", memberRequest.getFullName())
                .post(inviteUrl)
                .then()
                .statusCode(200)
                .extract().response();

        MemberResponse memberActualResponse = memberResponse.as(MemberResponse.class);
        Assert.assertEquals(memberActualResponse.getFullName(), "Name Surname", "Member full name does not match!");
    }
}


// V2
// Create a new team. Check that the team is created with the name provided in the API call.
// Create a new board on the team. Check that the board is created with the name provided in the API call.
// Add a member to the team. Check that the member is added to the team.
// Add a label to a card on the board. Check that the label is added to the card.

// Make restAssured TC using scenario from Task_15.
// The same using any another API client.


// Add Request and Response clases for each unique endpoints.
// Validate Response Object using your own class comparator.



// key:
// 89ba259efe6e5b7f2134225528086436

// token:
// ATTAcb94baa33c961ce365388a186563a6ef6806c9d142a457a12d00dddd285a68788F4C893C

// https://api.trello.com/1/boards/