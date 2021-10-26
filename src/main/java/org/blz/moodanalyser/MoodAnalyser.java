package org.blz.moodanalyser;


public class MoodAnalyser
{
    public static String message = "Im in SAD mood";

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public static String analyseMood() {
        if (message.contains("any") || message.contains("ANY") || message.contains("Any")) {
            return "HAPPY";
        }
        if (message.contains("SAD") || message.contains("Sad") || message.contains("sad")) {
            return "SAD";
        } else
            return null;
    }
}