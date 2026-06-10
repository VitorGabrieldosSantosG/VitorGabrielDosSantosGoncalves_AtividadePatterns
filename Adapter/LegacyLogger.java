package Adapter;

public class LegacyLogger {
    void log(String level, String text){
        System.out.println("[" + level.toUpperCase() + "] " + text);
    };
}
