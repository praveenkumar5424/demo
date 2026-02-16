 class validdate {
    static boolean isLeap (int year) 
    {
        if ((year % 400 ==0 || (year % 100 != 0 && year % 4 == 0)))
            return true;
        else
            return false;
    }
    static boolean isValidDate(int day, int month, int year) 
    {
        if (year < 1 || month < 1 || month > 12 || day < 1 || day > 31)
            return false;
        if (month == 2) 
        {
            if (isLeap(year))
                return (day <= 29);
            else
                return (day <= 28);
        }
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return (day <= 30);
        return true;
    }
    public static void main(String[] args) 
    {
        int day = 29, month = 2, year = 2020;
        if (isValidDate(day, month, year))
            System.out.println("Valid Date");
        else
            System.out.println("Invalid Date");
    }
}public class Innervaliddate {

    
}
        
    

