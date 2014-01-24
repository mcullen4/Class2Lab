
package model;

import org.joda.time.DateTime;

/**
 * This class creates a welcome message for the client
 * @author Michele
 */
public class WelcomeService {

    
    private String timeOfDay;
    private String welcomeMessage;

    private String getTimeOfDay() {
        DateTime currentDate = new DateTime();
        System.out.println(currentDate.getHourOfDay());
        if (currentDate.getHourOfDay() >= 0 && currentDate.getHourOfDay() < 12) {
            timeOfDay = "morning";
        } else if (currentDate.getHourOfDay() >= 12 && currentDate.getHourOfDay() < 17) {
            timeOfDay = "afternoon";
        } else {
            timeOfDay = "evening";
        }
        return timeOfDay;
    }
    
    /**
     * This method creates a welcome message to the user.  It retrieves the
     * time of day in terms of (morning, afternoon & evening) for inclusion
     * into this message.
     * @param name A string representing the name of the client
     * @return welcomeMessage a String representing the welcome message 
     */
    public String getWelcomeMessage(String name){
    String time = getTimeOfDay();
    welcomeMessage = "Good "+time+", "+name+".  Welcome to your "
            + "programming resource page.";
    return welcomeMessage;
    }

//    public static void main(String[] args) {
//        WelcomeService welcome = new WelcomeService();
//        String message = welcome.getWelcomeMessage("Michele");
//        System.out.println(message);
//    }
}
