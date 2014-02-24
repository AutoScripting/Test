package util;

import com.epicbot.oldschool.script.methods.Methods;

public abstract class Task extends Methods {
    public abstract boolean activate();

    public abstract void execute();
}