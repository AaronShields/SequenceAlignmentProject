import java.io.*; 
import java.io.FileInputStream; 
import java.util.Scanner; 

public class textGeneration {
    public static void main(String[] args){
        // loop through all test cases 
        File folder = new File("SampleInputs"); 
        File[] files = folder.listFiles(); 

        if(files == null || files.length == 0){
            return; 
        }
        for(File file : files){
            if (!file.isFile()) continue; // ignore directories (corner case)
            File inputFile = new File(file.getPath()); // replace with different files as needed

            try (Scanner myReader = new Scanner(inputFile)){
                while (myReader.hasNextLine()){
                    String data = myReader.nextLine(); 
                    System.out.println(data); 
                    // write script to generate DNA strings 
                }
            }
            catch (FileNotFoundException e) {
                System.out.println("Error"); 
                e.printStackTrace(); 
            }
        }
    }
}