import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

enum PageStatus {
	REDIRECTED, LOADED, NOT_FOUND, ERROR, BAD_GATEWAY, UNAUTHORIZED
}

public class EnumTypes_Solution_Webchecker {

	public static PageStatus checkStatus(String site) {
		try {
			URI uri = new URI(site);

			URL website = uri.toURL();

			HttpURLConnection connection = (HttpURLConnection) website.openConnection();

			if (connection.getResponseCode() == 404)
				return PageStatus.NOT_FOUND;
			else if (connection.getResponseCode() == 200)
				return PageStatus.LOADED;
			else if (connection.getResponseCode() == 308)
				return PageStatus.REDIRECTED;
			else if (connection.getResponseCode() == 502)
				return PageStatus.BAD_GATEWAY;
			else if (connection.getResponseCode() == 401)
				return PageStatus.UNAUTHORIZED;
			else
				return PageStatus.ERROR;

		} catch (Exception e) {
			return PageStatus.ERROR;
		}
	}

	public static void printPageStatus(PageStatus status) {

		switch (status) {
		case LOADED:
			System.out.println("The page is loaded successfully");
			break;
		case NOT_FOUND:
			System.out.println("The page is not found");
			break;
		case ERROR:
			System.out.println("Error loading the page");
			break;
		case REDIRECTED:
			System.out.println("The page is redirected to another URL");
			break;
		case BAD_GATEWAY:
			System.out.println("Server Error - Bad Gateway");
			break;
		case UNAUTHORIZED:
			System.out.println("Unauthorized Access");
			break;
		default:
			System.out.println("Page Status code not found");
			break;
		}

	}

	public static void main(String[] args) {
		String website;

		System.out.println("------- Scenario 1: Valid website -------");
		website = "http://www.google.com";
		printPageStatus(checkStatus(website));

		System.out.println("\n------- Scenario 2: Error website -------");
		website = "http://www.gle.com";
		printPageStatus(checkStatus(website));

		System.out.println("\n------- Scenario 3: Not Found website -------");
		website = "http://www.google.com/pagenotexist";
		printPageStatus(checkStatus(website));

		System.out.println("\n------- Scenario 4: Redirected website -------");
		website = "https://httpstat.us/308";
		printPageStatus(checkStatus(website));

		System.out.println("\n------- Scenario 5: Server Error -------");
		website = "https://httpstat.us/502";
		printPageStatus(checkStatus(website));

		System.out.println("\n------- Scenario 6: Unauthorized Access -------");
		website = "https://httpstat.us/401";
		printPageStatus(checkStatus(website));

	}
}
