public class LoggerTest {
	public static void main(String[] args) {
		// Testing Logger with Double entries (assuming they represent error codes)
		Logger<Double> errorCodeLogger = new Logger<>();

		errorCodeLogger.log(404.0);
		errorCodeLogger.log(500.0);

		System.out.println("Last Error Code: " + errorCodeLogger.getLastLog());
		System.out.println("All Error Codes: " + errorCodeLogger.getAllLogs());
	}
}
