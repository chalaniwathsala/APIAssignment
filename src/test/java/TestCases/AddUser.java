package TestCases;

	import static org.hamcrest.Matchers.*;





import io.restassured.RestAssured;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;

	import Files.PlayLoad;

	public class AddUser {

		public static void main(String[] args) {
			RestAssured.baseURI="https://petstore.swagger.io/v2";
			String userName = "chalaniwathsala";
			String response=given().log().all().header("Content-Type","application/json")
			.body(PlayLoad.CreateUser(userName))
			.when().post("/user")
			.then().log().all().assertThat().body("code", equalTo(200))
			.header("Content-Type","application/json")
			.extract().response().asString();
			System.out.println(response);
			
			//get 
			String getUserName= given().log().all()
			.when().get("/user/chalaniwathsala")
			.then()
			.extract().response().asString();
			System.out.println(getUserName); 
			
			//log in to system
			String logInToSystem= given().log().all().queryParam("username","chalaniwathsala")
			.queryParam("password", "wathsala%4095")
			.when().get("/user/login?username=chalaniwathsala&password=wathsala%4095")
			.then().assertThat().log().all().statusCode(200).extract().response().asString();
			System.out.println(logInToSystem);
			
			//update user name
			System.out.println("update data");
			String newUserName = "chalaniKoralalage";
			String updateResponse = given().log().all().header("Content-Type","application/json")
			.body("  {\r\n"
					+ "    \"id\": 2,\r\n"
					+ "    \"username\": \""+newUserName+"\",\r\n"
					+ "    \"firstName\": \"Chalani\",\r\n"
					+ "    \"lastName\": \"Koralalage\",\r\n"
					+ "    \"email\": \"chalaniwathsala644@gmail.com\",\r\n"
					+ "    \"password\": \"wathsala@95\",\r\n"
					+ "    \"phone\": \"0702252300\",\r\n"
					+ "    \"userStatus\":2\r\n"
					+ "  }")
			.when().put("/user/chalanikoralalage")
			.then().log().all().assertThat().body("code", equalTo(200))
			.header("Content-Type","application/json")//again write header it is like output validation
			.extract().response().asString();
			System.out.println(updateResponse);
			//get user name
			System.out.println("retriview data");
			String getUserNameResponse= given().log().all()
			.queryParam("username", newUserName)
			.when().get("/user/chalaniKoralalage")
			.then().assertThat().log().all().statusCode(200).extract().response().asString();
			System.out.println(getUserNameResponse);
			
			//logout
			System.out.println("Logout current user Logged");
			String logOutToSystem= given().log().all().queryParam("username","chalaniwathsala")
			.queryParam("password", "wathsala%4095")
			.when().get("/user/logout")
			.then().log().all().assertThat().body("code", equalTo(200))
			.header("Content-Type","application/json")
			.extract().response().asString();
			System.out.println(logOutToSystem);
			
			//delete user
			System.out.println("delete user");
			String deleteUser= given().log().all()
			.queryParam("username", newUserName)
			.when().delete("/user/chalaniKoralalage")
			.then().assertThat().log().all().statusCode(200).extract().response().asString();
			System.out.println(deleteUser);
			
			//List of users
			System.out.println("Create List of users with given input array");
			String listOfUsersResponse=given().log().all().header("Content-Type","application/json")
			.body(PlayLoad.ListOfUsersArray())
			.when().post("/user/createWithArray")
			.then().log().all().assertThat().body("code", equalTo(200))
			.header("Content-Type","application/json")
			.extract().response().asString();
			System.out.println(listOfUsersResponse);
			
			//add pet
			System.out.println("Add pet");
			String addPet=given().log().all().header("Content-Type","application/json")
			.body(PlayLoad.PetDetails())
			.when().post("/pet")
			.then().log().all().assertThat()
			.header("Content-Type","application/json")
			.extract().response().asString();
			System.out.println(addPet);
			
			//upload an image
			System.out.println("Upload Image");
			Response uploadImage=given().log().all().header("Content-Type","application/json")
			.when().post("/pet/0/uploadImage");
			System.out.println(uploadImage);
					
			//update existing pet
			System.out.println("Update exsisting pet");
			String newPet = "Browni";
			String updatePet = given().log().all().header("Content-Type","application/json")
					.body("{\r\n"
							+ "  \"id\": 0,\r\n"
							+ "  \"category\": {\r\n"
							+ "    \"id\": 0,\r\n"
							+ "    \"name\": \"Animal\"\r\n"
							+ "  },\r\n"
							+ "  \"name\": \""+newPet+"\",\r\n"
							+ "  \"photoUrls\": [\r\n"
							+ "    \"abc\"\r\n"
							+ "  ],\r\n"
							+ "  \"tags\": [\r\n"
							+ "    {\r\n"
							+ "      \"id\": 0,\r\n"
							+ "      \"name\": \"dog\"\r\n"
							+ "    }\r\n"
							+ "  ],\r\n"
							+ "  \"status\": \"available\"\r\n"
							+ "}")
					.when().put("/pet")
					.then().log().all()
					.extract().response().asString();
					System.out.println(updatePet);
					
			//Find pet by status
			System.out.println("Find pet by status");
			given().log().all().header("Content-Type","application/json")
			.body(PlayLoad.PetDetails())
			.when().get("/pet/findByStatus?status=pending")
			.then().log().all()
			.extract().response().asString();				
		}

		

}
