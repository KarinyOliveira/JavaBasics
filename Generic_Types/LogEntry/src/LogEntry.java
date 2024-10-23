
enum LogLevel {
	INFO, DEBUG, ERROR
}

public class LogEntry<T> {
    private final T message;
    private final LogLevel level;

    public LogEntry(T message, LogLevel level) {
        this.message = message;
        this.level = level;
    }

    public T getMessage() {
        return message;
    }

    public LogLevel getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "LogLevel: " + level + ", Message: " + message;
    }
}
