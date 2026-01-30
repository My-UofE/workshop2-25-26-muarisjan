//figuring out the birthday starting from the first day of that birthday month
// Sunday = 0, ...

// MyBirthday application
public class MyBirthday {
    public static void main(String[] args) {
        // parameters inputted
        int currentDay = Integer.parseInt(args[0]); 
        int currentDate = Integer.parseInt(args[1]); 
        int myBirthdayDate = Integer.parseInt(args[2]); ; 

        // value below is a constant
        final int DAYS_A_WEEK = 7; 
        
        // Tasks

        // 1. calc number of days from current date
        //    to birthday 
        int daysTillBirthday = myBirthdayDate - currentDate;



        // 2. use this along with the current weekday 
        //    to find when the birthday falls

        int birthWeekday = (currentDay + daysTillBirthday) % DAYS_A_WEEK;


        // 3. Display the result
        System.out.println("Birthday falls on: " + birthWeekday);
        String[] weekdays = {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};
        System.out.println("whichis:" + weekdays[birthWeekday]);
    }
}