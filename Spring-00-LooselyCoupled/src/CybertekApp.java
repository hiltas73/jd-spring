import service.FullTimeMentor;
import service.MentorAccount;
import service.PartTimeMentor;

public class CybertekApp {
    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();
        //PartTimeMentor partTime = new PartTimeMentor();

        MentorAccount mentor = new MentorAccount(fullTime); //whatever we pass in here (partTime
                                    // or fullTime) we create a new account so easy to make changes
                                    // compared to TightlyCoupled

        mentor.manageAccount();

    }
}
