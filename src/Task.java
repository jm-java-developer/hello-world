/**
 * Created by Jarek on 2017-05-23.
 */
public class Task {
    private static Task ourInstance = new Task();

    public static Task getInstance() {
        return ourInstance;
    }

    private Task() {
    }
}
