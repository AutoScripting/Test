import com.epicbot.oldschool.script.Script;
import com.epicbot.oldschool.script.ScriptManifest;
import handlers.Banking;
import util.Task;

import java.util.ArrayList;

@ScriptManifest(authors = {"Jangan"}, name = "Test Script", description = "not sure yet")
public class Test extends Script {
    private final ArrayList<Task> mainTask = new ArrayList<Task>();

    @Override
    public boolean onStart() {
        return mainTask.add(new Banking());
    }

    @Override
    public int loop() {
        for (Task task : mainTask) {
            if (task.activate())
                task.execute();
        }
        return 1000;
    }
}
