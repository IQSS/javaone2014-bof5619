package com.greptilian.javaone2014bof5619.dataverse;

import java.util.Map;

@RequiredPermissions(Permission.DestructiveEdit)
public class DeleteDataFileCommand implements Command {

    private User user;
    private DataFile dataFile;

    public DeleteDataFileCommand(User user, DataFile dataFile) {
        this.user = user;
        this.dataFile = dataFile;
    }

    public Object execute(CommandContext context) {
        System.out.println("Deleted file!");
        return null;
    }

    @Override
    public Map getAffectedDvObjects() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public User getUser() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
