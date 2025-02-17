
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class MyMentalGame {
    @SuppressWarnings("UnnecessaryContinue")
    public static void main(String[] args) {

                Random ran = new Random();
                int magicNumber ;

                boolean condition = true ;

        while (condition) { 
            
        
                ArrayList<Integer> arrNumbers = new ArrayList<>();
            


                for (int i = 0; i <= 6; i++) {
                    magicNumber = ran.nextInt(1000, 9999);
                    arrNumbers.add(i,magicNumber);

                }

                JOptionPane.showConfirmDialog(null, """
                                                    This game was created to examine the pupil dilation in humans when they are using their minds. 
                                                     The instructions are as follows : You will get a 4 digit number and you treat them as a String 
                                                    after you will use your mind and add 3 on each number separately and write down your answer after you have concatenate all 4 numbers . 
                                                    Example : 3467 the answer is 6790 , NOTE when your addition is greater than 9 then start back to 0""", "WARNINGS", JOptionPane.ERROR_MESSAGE,JOptionPane.OK_OPTION);
                
                JOptionPane.showMessageDialog(null, """
                                                    Welcome to the Mental game named Add-3 
                                                     ================================ 
                                                     You must pick a number from 1 - 6 
                                                     1 - **** 
                                                     2 - **** 
                                                     3 - **** 
                                                     4 - **** 
                                                     5 - **** 
                                                     6 - **** """, "The Intro", JOptionPane.INFORMATION_MESSAGE );

                int myOption = Integer.parseInt(JOptionPane.showInputDialog("Choose your option  : ") );

                magicNumber =  arrNumbers.get(myOption);
            
        
                    JOptionPane.showMessageDialog(null, "The Magic 4 digits are : "+magicNumber , "Numbers", JOptionPane.INFORMATION_MESSAGE);
               
                boolean bTrue = true;
                int answer = 0;
                while (bTrue) { 
                    answer = Integer.parseInt(JOptionPane.showInputDialog("Enter your answer : ",JOptionPane.OK_OPTION));
                    bTrue = String.valueOf(answer).length() > 4;
                }

                String strMagicNumber = String.valueOf(magicNumber);

                String sRealAnswer = " ";

                for (int i = 0; i < strMagicNumber.length(); i++) {
                    char firstNum = strMagicNumber.charAt(i);
                    String strFirstNum = String.valueOf(firstNum);
                    int iFirstNum =  Integer.parseInt(strFirstNum);
                
                    if (iFirstNum + 3 <= 9) {
                        sRealAnswer = sRealAnswer.concat(String.valueOf(iFirstNum+3));
                        continue;
                        
                    } else if(iFirstNum+3 > 9)  
                                {
                                    sRealAnswer = sRealAnswer.concat(String.valueOf(String.valueOf(iFirstNum+3).charAt(1)));
                                    continue;    
                                } 
                }
                
                int iRealAnswer = Integer.parseInt(sRealAnswer.trim());

                if (iRealAnswer == answer ) {

                    JOptionPane.showMessageDialog(null, "You have won big ups man !!!", "Output", JOptionPane.INFORMATION_MESSAGE);

                } else 
                    {
                            JOptionPane.showConfirmDialog(null, "You are wrong the correct answer is  : "+sRealAnswer);
                    }

                    
                    JOptionPane.showConfirmDialog(null, "Do you want to continue ?? ", "Title", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }

    }
}