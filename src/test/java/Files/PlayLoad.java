package Files;

public class PlayLoad {
	public static String CreateUser(String userName){
		return " {\r\n"
				+ "    \"id\": 2,\r\n"
				+ "    \"username\": \""+userName+"\",\r\n"
				+ "    \"firstName\": \"Chalani\",\r\n"
				+ "    \"lastName\": \"Koralalage\",\r\n"
				+ "    \"email\": \"chalaniwathsala644@gmail.com\",\r\n"
				+ "    \"password\": \"wathsala@95\",\r\n"
				+ "    \"phone\": \"0702252300\",\r\n"
				+ "    \"userStatus\":2\r\n"
				+ "  }";
		
	}
	
	public static String PetDetails() {
		return "{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"Animal\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"doggie\",\r\n"
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
				+ "}";
		
		
	}
	
	public static String ListOfUsersArray() {
		return "[\r\n"
				+ "  {\r\n"
				+ "    \"id\": 3,\r\n"
				+ "    \"username\": \"dewmisanjeewani\",\r\n"
				+ "    \"firstName\": \"dewmi\",\r\n"
				+ "    \"lastName\": \"sanjeewani\",\r\n"
				+ "    \"email\": \"dew@gmail.com\",\r\n"
				+ "    \"password\": \"dew12\",\r\n"
				+ "    \"phone\": \"0701123232\",\r\n"
				+ "    \"userStatus\": 3\r\n"
				+ "  },\r\n"
				+ "{\r\n"
				+ "    \"id\": 4,\r\n"
				+ "    \"username\": \"damiduT\",\r\n"
				+ "    \"firstName\": \"damidu\",\r\n"
				+ "    \"lastName\": \"rathnayake\",\r\n"
				+ "    \"email\": \"dammi@gmail.com\",\r\n"
				+ "    \"password\": \"dam123\",\r\n"
				+ "    \"phone\": \"0773424564\",\r\n"
				+ "    \"userStatus\": 4\r\n"
				+ "  }\r\n"
				+ "]";
	}
}
