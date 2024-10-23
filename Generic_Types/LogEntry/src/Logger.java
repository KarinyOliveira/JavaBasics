import java.util.ArrayList;
import java.util.List;

public class Logger<T> {
	private final List<LogEntry<T>> logs;

	public Logger() {
		this.logs = new ArrayList<>();
	}

	public void log(T message, LogLevel level) {
		logs.add(new LogEntry<>(message, level));
	}

	public LogEntry<T> getLastLog() {
		return logs.isEmpty() ? null : logs.get(logs.size() - 1);
	}

	public List<LogEntry<T>> getAllLogs() {
		return new ArrayList<>(logs);
	}

}
