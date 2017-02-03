import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;

/**
 * Created by Lori on 2/2/2017.
 */
public class Application {
    /**
     * This method returns whichever value is nearest to 21.
     * @param firstNumber first value.
     * @param secondNumber second value.
     * @return the value that is nearest to 21.
     */
    private String blackJack(int firstNumber, int secondNumber) {
        int reminderFromFirstNumber = 0;
        int reminderFromSecondNumber = 0;
        String numberAsString;

        if (firstNumber < 0 || secondNumber < 0)
            return "Please enter 0 or a positive number.";
        reminderFromFirstNumber = 21 - firstNumber;
        reminderFromSecondNumber = 21 - secondNumber;
        if ((reminderFromFirstNumber < reminderFromSecondNumber &&
                reminderFromFirstNumber >= 0) ||
                reminderFromSecondNumber < 0)
            return numberAsString = Integer.toString(firstNumber);
        else
            return numberAsString = Integer.toString(secondNumber);
    }

    public static void main(String[] args) {
        Application application = new Application();

        System.out.println(application.blackJack(19, 22));
    }
}
