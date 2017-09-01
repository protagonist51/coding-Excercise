import java.io.FileInputStream; 
import java.util.regex.*;

public class ReadFileLog {  
     public static void main(String args[]){    
          try{  
            //Asuming that file is in D drive   
            FileInputStream fin=new FileInputStream("D:\\testout.txt");    
            String inputString = null;   
            while((inputString=fin.read())!=-1){    
               int countNumber = countOccurances(inputString);
               System.out.println("SprintsController => show action ran"+ countNumber+ "times");
            }
            
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
     }  
     
     public static int countOccurances(String input) {
        Pattern pattern = Pattern.compile("Processing by SprintsController#show as JSONAPI");
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while (matcher.find()){
        {
          count++;
        }
        return count++;
     }
}  
