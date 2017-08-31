import java.io.FileInputStream;  
import java.io.FileOutputStream; 

class MillionNumbers {

    //Get the Input file
    try{
          Path pp = FileSystems.getDefault().getPath("logs", "access.log");
          Path op = FileSystems.getDefault().getPath("logs1", "output.log");
          //this is in bytes to read the file in chunks    
          final int BUFFER_SIZE = 1024*1024; 

          FileInputStream fis = new FileInputStream(pp.toFile());
          byte buffer[] = new byte[BUFFER_SIZE];
          int read;
          FileOutputStream os = new FileOutputStream(op);
          
          while((read = is.read(buffer)) != -1){
            os.write(buffer, 0, read);
            FileInputStream uis = new FileInputStream(op)
            
            // Insert numbers dynamically to the array
            Integer[] array = uis.read();
            
            //Call QuickSort method to sort the array
            quickSort( array, 0, array.length - 1 );
          }
          fis.close();
          uis.close();
          os.close();
        }catch(Exception e){System.out.println(e);}  
        
        public static void quickSort(Integer[] arr, int low, int high) {
          //check for empty or null array
          if (arr == null || arr.length == 0){
              return;
          }
          if (low >= high){
              return;
          }
          //Get the pivot element from the middle of the list
          int middle = low + (high - low) / 2;
          int pivot = arr[middle];

          // make left < pivot and right > pivot
          int i = low, j = high;
          while (i <= j) 
          {
              while (arr[i] < pivot) 
              {
                  i++;
              }
              //Check until all values on left side array are greater than pivot
              while (arr[j] > pivot) 
              {
                  j--;
              }
              if (i <= j) 
              {
                  swap (arr, i, j);
                  i++;
                  j--;
              }
          }
          //Do same operation as above recursively to sort two sub arrays
          if (low < j){
              quickSort(arr, low, j);
          }
          if (high > i){
              quickSort(arr, i, high);
          }
      }
}        
