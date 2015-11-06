
/**
 * 
 * 
 * @author (David Mayes 
 * @version 
 */
public class Choice
{

    /**
     * Constructor for objects of class Choice
     */
    public Choice()
    {

    }

    /**
     * @param integer of the percentage ogf the child's marks
     * @return the grade corresponding to that mark
     */
    public static char calcGrade(int mark)
    {

        if (mark > 69)
        {
            return 'A';
        }
        else
        {
            if (mark > 59)
            {
                return 'B';
            }
            else
            {
                if (mark > 49)
                {
                    return 'C';
                }
                else
                {
                    if (mark > 39)
                    {
                        return 'D';
                    }
                    else
                    {
                        return 'E';
                    }

                }
            }
        }
    }

    /**
     * 
     */
    public static void choice2()
    {
        System.out.println("method choice 2 executed");
    }

    /**
     * 
     */
    public static void choice3()
    {
        System.out.println("method choice 3 executed");
    }

    /**
     * 
     */
    public static void exit()
    {
        System.out.println("goodbye");
    }
}
