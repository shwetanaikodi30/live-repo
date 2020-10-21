import java.io.File;
import java.io.FileFilter;

//Use case : Display all the .java files inside a folder
//1. using java 7 syntax
//2. using java 8 sytnax (Lambda Expressions)
public class FileFilterLambda {
	public static void main(String[] args) {
		// Refer an existing directory
		File directoryFile = new File("C:\\Users\\Enzo\\Desktop\\live_he\\live-repo\\java\\ld1a-java-8\\src");
		FileFilterImpl fileFilterImpl = new FileFilterImpl();
		File[] files = directoryFile.listFiles(fileFilterImpl);
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
}

//The FileFilterImpl returns true for the files which match the condition.
class FileFilterImpl implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		boolean isJavaFile = pathname.getName().endsWith(".java");
		return isJavaFile;
	}

}

//Practice : Modify the code to display only .txt files.