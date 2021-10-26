package org.blz.moodanalyser;


public class MoodAnalyser {

    public static String message = "";

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public static String analyseMood(){
        try {
            if (message.contains("any") || message.contains("ANY") || message.contains("Any")) {
                return "HAPPY";
            }
            else if (message.contains("SAD") || message.contains("Sad") || message.contains("sad")) {
                return "SAD";
            } else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }

    }
}