package com.tw.commandend.command;


public class ErrorCommand extends Command {

    public ErrorCommand(String order) {
        super(order);
    }

    @Override
    public void initDisplay(String displayMsg, Command callBackCmd) {
        setOutPut(displayMsg);
        String input = cliReader.nextLine();
        callBackCmd.handleInput(input);
    }
}
