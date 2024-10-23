import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOTesting {

	public static void main(String[] args) {

		String filePathString = "/Users/karinyoliveira/Documents/CCTB/ISM107_Java_2/workspace/Class12.JavaIOTesting/src/sample.txt";
		Path filePath = Paths.get(filePathString);

		// Take the absolute path
		Path absolutePath = PathHandler.getAbsolutePath(filePath);
		System.out.println("Absolute path: " + absolutePath);

		// Take the file name
		Path fileName = PathHandler.getFilename(filePath);
		System.out.println("File name: " + fileName);

		try {

			PathHandler.displayTree(filePath.getParent());

		} catch (IOException e) {

			e.printStackTrace();

		}

		// Insert content
		String content = "Insert content for testing purpose";

		FileHandler.writeFile(filePathString, content);

		if (FileHandler.fileExists(filePathString)) {

			System.out.println("File exists: " + filePathString);
			String fileContent = FileHandler.readFile(filePathString);
			System.out.println("File content: " + fileContent);

		} else {

			System.out.println("File does not exist: " + filePathString);

		}
	}
}
