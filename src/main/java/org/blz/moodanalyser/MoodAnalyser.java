package org.blz.moodanalyser;


public class MoodAnalyser
{
    public static String analyseHappyMood(String message) {
        if (message.contains("any") || message.contains("ANY")) {
            return "happy";
        } else
            return "sad";
    }
    public static String analyseSadMood(String message) {
        if (message.contains("sad") || message.contains("SAD")) {
            return "sad";
        } else
            return "happy";
    }
}
