
/**
 * Contains methods to display a menu to the user and recieve selections.
 * 
 * @author David Mayes 
 * @version 
 */
public class Menu
{
    

    /**
     * 
     */
    public Menu()
    {
        
        
    }
    /**
     * Displays menu to the user
     */
    public void displayMenu()
    {
        System.out.println("please select one of the options below");
        System.out.println("1. Calculate Grade");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("0. Exit");
    }
    /**
     * 
     */
    public void processUserChoices()
    {
        int choiceMade;
        do
        {
        displayMenu();
        choiceMade = Genio.getInteger();
        switch(choiceMade)
        {
              case 1:
                int percent;
                int i;
                i = 1;
                 while (i == 1)
                {
                System.out.println("Please enter the percentage of the student's mark");
                percent = Genio.getInteger();
               
                if ((percent >= 0) && (percent <= 100))
                {
                    char grade;
                    grade = Choice.calcGrade(percent);
                    System.out.println("Student's grade: " + grade);
                    i++;
                }
                else
                {
                    System.out.println("Invalid mark value, please try again");
                }
                }
                break;
              case 2:
                Choice.choice2();
                break;
              case 3:
                Choice.choice3();
                break;
              case 0:
                Choice.exit();
                break;
              default:
                System.out.println("Invalid selection, please try again");
                break;
        }
        } 
        while (choiceMade != 0);
    }
}
