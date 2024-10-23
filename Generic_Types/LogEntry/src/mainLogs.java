import java.util.List;

public class mainLogs {
    public static void main(String[] args) {
        
        Logger<String> newLogger = new Logger<>();
       
        newLogger.log("Executing the program", LogLevel.INFO);
        newLogger.log("Processing the entries", LogLevel.INFO);           
        newLogger.log("Unexpected Error", LogLevel.ERROR);
        newLogger.log("Debugging line 7", LogLevel.DEBUG);
        newLogger.log("Debugging line 20", LogLevel.DEBUG);
        newLogger.log("Fatal Error", LogLevel.ERROR);
       
        LogEntry<String> lastLog = newLogger.getLastLog();
        System.out.println("Last String Log: " + lastLog);
        
        List<LogEntry<String>> allLogs = newLogger.getAllLogs();
        System.out.println("All String Logs: " + allLogs);
                   
    }
}