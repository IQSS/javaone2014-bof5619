package com.greptilian.javaone2014bof5619.dataverse;

// this is all much more complicated in practice
/**
 * @navassoc - - - Command
 */
class EjbDataverseEngine {

    private CommandContext ctxt;

    public <R> R submitAndExecute(Command<R> aCommand) throws CommandException {

        // might throw PermissionException or IllegalCommandException
        return aCommand.execute(getContext());
    }

    public CommandContext getContext() {
        return ctxt;
    }

}
