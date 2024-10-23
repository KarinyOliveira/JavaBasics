import java.util.ArrayList;
import java.util.List;

public class Logger<T> {
	private List<T> logs = new ArrayList<>();

	public void log(T entry) {
		logs.add(entry);
	}

	public T getLastLog() {
		if (logs.isEmpty()) {
			return null;
		}
		return logs.get(logs.size() - 1);
	}

	public List<T> getAllLogs() {
		return new ArrayList<>(logs);
	}
}
