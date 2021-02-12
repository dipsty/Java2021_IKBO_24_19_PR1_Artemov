import java.util.function.Predicate;

public class PR1 {
    public static void main(String[] args) {
        Predicate<Integer> MailCheck = x -> x > 0;

        String MailInput = "emailexample@service.com";

        boolean MailResultCheck = MailInput.matches("emailexample@service.com");

        if (MailResultCheck) {
            System.out.println(MailCheck.test(1)); //
        }

        else {
            System.out.println(MailCheck.test(0));
        }
    }
}