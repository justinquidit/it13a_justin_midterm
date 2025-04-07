package midterm;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FILE_HANDLING {

    public static void main(String[] args) {
        
       try{
        File myObj = new File("C:\\JUSTIN.rar");
       
        if(myObj.createNewFile()){
             FileWriter sulat = new FileWriter(myObj);
            System.out.print("file created : "+ myObj.getName());
        sulat.write("hi ako si justin");
        sulat.close();
                System.out.print(" succesfull");
                }else{System.out.print("the file already exists ");
       }
       }catch(IOException e){
           System.out.print("error");
       e.printStackTrace();
       }
        
        
     
}
     
    }

