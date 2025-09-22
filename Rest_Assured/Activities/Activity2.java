import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class Activity2 {
	@Test(priority=1)
	public void addNewUserFromFile() throws IOException {
		FileInputStream inputJSON = new FileInputStream("path/to/userInfo.json");

		Response response = given()
			.baseUri("https://petstore.swagger.io/v2/user") 
			.header("Content-Type", "application/json") 
			.body(inputJSON) 
			.when().post(); 

		inputJSON.close();

	
		response.then().body("code", equalTo(200));
		response.then().body("message", equalTo("9901"));
	}
	
	@Test(priority=2)
	public void getUserInfo() {
		File outputJSON = new File("src/test/java/activities/userGETResponse.json");

		Response response = given()
			.baseUri("https://petstore.swagger.io/v2/user") // Set base URI
			.header("Content-Type", "application/json") // Set headers
			.pathParam("username", "justinc") // Pass request body from file
			.when().get("/{username}"); // Send POST request
		
		// Get response body
		String resBody = response.getBody().asPrettyString();

		try {
			// Create JSON file
			outputJSON.createNewFile();
			// Write response body to external file
			FileWriter writer = new FileWriter(outputJSON.getPath());
			writer.write(resBody);
			writer.close();
		} catch (IOException excp) {
			excp.printStackTrace();
		}
		
		response.then().body("id", equalTo(9901));
		response.then().body("username", equalTo("justinc"));
		response.then().body("firstName", equalTo("Justin"));
		response.then().body("lastName", equalTo("Case"));
		response.then().body("email", equalTo("justincase@mail.com"));
		response.then().body("password", equalTo("password123"));
		response.then().body("phone", equalTo("9812763450"));
	}
	
	@Test(priority=3)
	public void deleteUser() throws IOException {
		Response response = given()
			.baseUri("https://petstore.swagger.io/v2/user") // Set base URI
			.header("Content-Type", "application/json") // Set headers
			.pathParam("username", "justinc") // Add path parameter
			.when().delete("/{username}"); // Send POST request

		response.then().body("code", equalTo(200));
		response.then().body("message", equalTo("justinc"));
	}
}
