package poec.imie.plateforme;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import poec.imie.plateforme.entities.Group;
import poec.imie.plateforme.entities.Student;


public class Application {

			
		public static void main(String[] args) throws Exception {
//	        File root = new File("/");
//	        listContent(root, 0);

	        File current = new File("./MyFile.txt");
	        readFile(current);

	        String message = "foo bar";
	        current = new File("./MyFileWrite.txt");
	        writeFile(current, message);
	        readFile(current);
	    }

	    private static void writeFile(File file, String newLine) throws Exception {
	        FileWriter fileWriter = new FileWriter(file);
	        BufferedWriter buffer = new BufferedWriter(fileWriter);

	        buffer.write(newLine);
	        buffer.newLine();

	        buffer.flush();
	        buffer.write(newLine);
	        buffer.newLine();

	        buffer.close();
	        fileWriter.close();
	    }

	    private static void readFile(File file) throws Exception {
	        FileReader fileReader = new FileReader(file);
	        BufferedReader buffer = new BufferedReader(fileReader);

	        while (buffer.ready()) {
	            String line = buffer.readLine();
	            System.out.println(line);
	        }

	        buffer.close();
	        fileReader.close();
	    }


	    private static void listFile(File file, int currentDepth, int maxtDepth) {

	    }

	    /**
	     * List content of directory (Recursively).<p>
	     * This method is deprecated, please use @{link Application.listFile()}.
	     * @param file Path folder to list.
	     * @param currentDepth Current Depth of recursive.
	     * @deprecated
	     */
	    private static void listContent(File file, int currentDepth) {
	        if (file.isDirectory() && currentDepth < 3) {
	            ++currentDepth;
	            String contents[] = file.list();
	            if (contents != null) {
	                for (int i = 0; i < contents.length; i++) {
	                    File content = new File(file.getAbsolutePath() + "//" + contents[i]);

	                    if (content.isDirectory()) {
	                        listContent(content, currentDepth);
	                    }

	                    System.out.println(content.getAbsolutePath());
	                }
	            }
	        }
	    }

	}

		
		
		
		
		
		
		
		
		
		
		
		
		
//        public Group(String groupName, Student numStudent) {
//        	this.groupName;
//            this.student.numStudent;
//
//            System.out.println("Create a new group : " + this.groupName);
//if (listStudent<=1){
//	System.out.println("You can not create a group on your own");
//} else { for (int i = 0; i < 2; i++) {
//            	Student student1 = new Student(this.numStudent);
//                this.listStudent.add(student1);
//	}

	}
