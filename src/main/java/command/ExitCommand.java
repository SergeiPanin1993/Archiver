package command;

import main.ConsoleHelper;

public class ExitCommand implements Command{

    public void execute() throws Exception {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
