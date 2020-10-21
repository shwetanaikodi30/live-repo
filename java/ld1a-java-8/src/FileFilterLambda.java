import java.io.File;
import java.io.FileFilter;

//Use case : Display all the .java files inside a folder
//1. using java 7 syntax
//2. using java 8 sytnax (Lambda Expressions)
public class FileFilterLambda {
	public static void main(String[] args) {
		//lambdaExpression();
		lambdaExpression1();
	}


	private static void theJava7Way() {
		// Refer an existing directory
		File directoryFile = new File("C:\\Users\\Enzo\\Desktop\\live_he\\live-repo\\java\\ld1a-java-8\\src");
		FileFilter fileFilter = new FileFilterImpl();
		File[] files = directoryFile.listFiles(fileFilter);
//		FileFilterImpl fileFilterImpl = new FileFilterImpl();
//		File[] files = directoryFile.listFiles(fileFilterImpl);
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
	private static void theJava7WayAnonymousClass() {
		// Refer an existing directory
		File directoryFile = new File("C:\\Users\\Enzo\\Desktop\\live_he\\live-repo\\java\\ld1a-java-8\\src");
		//Anonymous class
		FileFilter fileFilter = new FileFilter(){

			@Override
			public boolean accept(File pathname) {
//				boolean isJavaFile = pathname.getName().endsWith(".java");
//				return isJavaFile;
				return  pathname.getName().endsWith(".java");
			}
		};
		File[] files = directoryFile.listFiles(fileFilter);
//		FileFilterImpl fileFilterImpl = new FileFilterImpl();
//		File[] files = directoryFile.listFiles(fileFilterImpl);
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
	private static void lambdaExpression() {
		File directoryFile = new File("C:\\Users\\Enzo\\Desktop\\live_he\\live-repo\\java\\ld1a-java-8\\src");
		//Lambda Expressions
		FileFilter fileFilter =  (File pathname) -> pathname.getName().endsWith(".java");
//		FileFilter fileFilter =  (File pathname) -> {
//			boolean isJavaFile = pathname.getName().endsWith(".java");
//			return isJavaFile;
//		};	
		File[] files = directoryFile.listFiles(fileFilter);
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
	private static void lambdaExpression1() {
		File directoryFile = new File("C:\\Users\\Enzo\\Desktop\\live_he\\live-repo\\java\\ld1a-java-8\\src");
		//Lambda Expressions
//		FileFilter fileFilter =  (File pathname) -> pathname.getName().endsWith(".java");
//		FileFilter fileFilter =  (File pathname) -> {
//			boolean isJavaFile = pathname.getName().endsWith(".java");
//			return isJavaFile;
//		};	
		File[] files = directoryFile.listFiles((File pathname) -> pathname.getName().endsWith(".java"));
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
}

//The FileFilterImpl returns true for the files which match the condition.
//Concrete class
class FileFilterImpl implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		boolean isJavaFile = pathname.getName().endsWith(".java");
		return isJavaFile;
	}
}

//Practice : Modify the code to display only .txt files.