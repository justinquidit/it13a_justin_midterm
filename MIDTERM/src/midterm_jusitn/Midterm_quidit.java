package midterm_quidit;


public class Midterm_quidit {

 
    public static void main(String[] args) {
        
 // Single Array
 
//       char letter[]= {'A','B','C','D','E','F','G'}; 
    
//   for(char i = 0; i < letter.length; i++){
//       System.out.print(letter[i] + " ");
//}
       
 //Multi-dimentional Array
 
    int [][]numbers = {
        
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12}
    }; 
    for(int i = 0; i < numbers.length; i++){
        System.out.print("The elements of row" + (i + 1) + " : ");
        for(int y = 0; y < numbers[i].length; y++){
          System.out.print(numbers[i][y] + "  ");
    }
          System.out.println();


    
    
    
    
    }
}
    
    }
    