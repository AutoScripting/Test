package handlers;

import util.Task;

public class Banking extends Task {

    @Override
    public boolean activate() {
        return account.getName().equals("test");
    }

    @Override
    public void execute() {

    }
}
