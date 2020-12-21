package fileIo;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

        // properties for this class
        // goal: read in a file and parse through it
        private String directoryName; // i.e. 'data', 'src/fileIo'
        private String fileName; // i.e. 'day18.txt', 'jolts.txt'
        private String logFileName; // will hold logging info
        private Path directoryPath; // Path representation of the parent directory for our files
        private Path filePath; // Path representation for the actual file itself
        private Path logFilePath; // Path representation of the log file
        private List<String> fileLines; // Holding spot for the content inside of the data file itself
        private List<String> logFileLines; // Holding spot for the content inside of the log file


    // Constructor
    // Want to send in a directory path name and a file nae, logFile name, and generate EVERYTHING from just those
    // two values

    public FileReader(String directoryName, String fileName, String logFileName){
        this.directoryName = directoryName;
        this.fileName = fileName;
        this.logFileName = logFileName;
        // instantiating path values
        this.directoryPath = Paths.get(directoryName); // Paths.get("data")
        this.filePath = Paths.get(directoryName, fileName);
        this.logFilePath = Paths.get(directoryName, logFileName);

        // Check if files exist, and create them if they don't already exist
        // 


        System.out.println(filePath); // display the file path for the passed in arguments
    }

    // PSVM (you can think of this as being 20 files away from this file - it is STATIC)

    public static void main(String[] args) {
        // Instantiate a FileReader object, and see if it works
        FileReader thisFileReader = new FileReader("data", "day18.txt", "day18.log");
    }

    // Custom Method



        // Getters and Setters
    public String getDirectoryName(){
        return directoryName;
    }

    public void setDirectoryName(String directoryName){

    }
}
