package org.blz.moodanalyser;

public class MoodAnalysisException extends Exception {
        public String message;

        public MoodAnalysisException(String message) {
            super(message);
        }
    }

