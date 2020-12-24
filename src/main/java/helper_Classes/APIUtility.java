package helper_Classes;

public interface APIUtility {
        //directory path
	    String directory_path =System.getProperty("user.dir");
	    //Base URI
		public static final String BASE_URI="https://apichallenges.herokuapp.com";
		//Endpoints
		public static final String TO_DO= BASE_URI+"/todos";
		public static final String CHALLENGER= BASE_URI+"/challenger";
		public static final String CHALLENGES= BASE_URI+"/challenges";
		public static final String HEARTBEAT= BASE_URI+"/heartbeat";
		public static final String SECRET_TOKEN= BASE_URI+"/secret/token";
		public static final String SECRET_NOTE= BASE_URI+"/secret/note";
		
}



