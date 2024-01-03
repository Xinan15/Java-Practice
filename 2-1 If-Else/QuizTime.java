/*
    Time Conversion
    Coordinated Universal Time (UTC) is the world's time standard, while Beijing Time (BT) is the local time in Beijing. 
    The difference between UTC and BT is 8 hours, with BT being 8 hours ahead. 

    Your program should input an integer representing BT in hours and minutes.
    In this format, the ones and tens digits signify minutes, while the hundreds and thousands digits indicate hours. 
    For hours less than 10, there is no thousands digit; similarly, for an hour of 0, there is no hundreds digit. 
    If the minutes are less than 10, the leading zero in the tens place must be maintained.

    For example, 1124 represents 11:24, 905 is 9:05, 36 is 0:36, and 7 is 0:07. 
    The valid input range is from 0 to 2359, meaning inputs outside this range will not be accepted by your program. 
    The program must output the corresponding UTC time. Like the input, the output should be an integer where the ones and tens digits represent minutes, and the hundreds and thousands digits represent hours. 
    For hours less than 10, exclude the thousands digit; if the hour is 0, exclude the hundreds digit; for minutes less than 10, retain the zero in the tens place. 
    Note: Be mindful of day transitions during conversions.

    Example:
    Input: 933 (BJT)
    Output: 133 (UTC)
*/

import java.util.Scanner;

public class QuizTime {
    public static void main(String[] args) {

        System.out.println("Please enter BJT:");

        Scanner in = new Scanner(System.in);
        int bjt = in.nextInt();
        int utc;

        if (bjt>=800){
            utc = bjt - 800;
        }else{
            utc = bjt - 800 + 2400;
        }

        System.out.println(utc);

        in.close();
    
    }

}
