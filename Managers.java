package Tracker_v3;

public class Managers {
    public static InMemoryTaskManager getDefault() {
        return new InMemoryTaskManager();
    }
}