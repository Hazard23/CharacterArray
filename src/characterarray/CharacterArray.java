
public class CharacterArray {

    
    public static void main(String[] args) {
        String text = "6901 Sudley Road Manassas VA";
        
        char[] array = text.toCharArray();
        
       
           for (int j = 0; j < (array.length); j++){
               String one = ""+ array[j];
              
              if (one.matches("[0-9]+")){
                   System.out.println(one + " is a digit = *");
               }
              if (one.matches("[A-Z]+")) {
                    System.out.println(one + " is a letter = " + one.toLowerCase());
               }  
              if (one.matches("[a-z]+")){
                    System.out.println(one + " is a letter = " + one.toUpperCase());
               }
           }
                 
                    
                     
    }
            
        
}
 
