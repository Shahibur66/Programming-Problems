
package happy.ladybugs;


import java.util.Scanner;

public class StrongPassword{
    
    
    
 static int minimumNumber(int n, String password) {
       
     
     
        int digitCount = 0;
        int lowerCount = 0;
        int upperCount = 0;
        int specialCount = 0;
        
        int addCount = 0;
        
        for(char c : password.toCharArray()){
            if(Character.isDigit(c)){
                digitCount++;
            }
            else if(Character.isLowerCase(c)){
                lowerCount++;
            }
            else if(Character.isUpperCase(c)){
                upperCount++;
            }
            else{
                specialCount++;
            }
        }
        
        if(digitCount == 0){
          
            addCount++;
            digitCount++;
        }
        
        if(lowerCount == 0){
          
            addCount++;
            lowerCount++;
        }
        
        if(upperCount == 0){
          
            addCount++;
            upperCount++;
        }
        
        if(specialCount == 0){
          
            addCount++;
            specialCount++;
        }
        
        
        int total = digitCount + lowerCount + upperCount + specialCount;
        
     
        if(total - 6 < 0){
            addCount += 6 - total;
        }
        
        return addCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}
