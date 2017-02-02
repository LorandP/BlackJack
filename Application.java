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
        int reminder_from_first_number = 0;
        int reminder_from_second_number = 0;
        String number_as_string;

        if (firstNumber < 0 || secondNumber < 0)
            return "Please enter 0 or a positive number.";
        reminder_from_first_number = 21 - firstNumber;
        reminder_from_second_number = 21 - secondNumber;
        if ((reminder_from_first_number < reminder_from_second_number &&
                reminder_from_first_number >= 0) ||
                reminder_from_second_number < 0)
            return number_as_string = Integer.toString(firstNumber);
        else
            return number_as_string = Integer.toString(secondNumber);
    }

    public static void main(String[] args) {
        Application application = new Application();

        System.out.println(application.blackJack(22, 22));
    }
}
