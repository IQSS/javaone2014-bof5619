package com.greptilian.javaone2014bof5619.dataverse;

import java.util.Map;

/**
 * @navassoc - - 1 RequiredPermissions
 */
public interface Command<R> {

    public <R> R execute(CommandContext context);

    public Map<String, DvObject> getAffectedDvObjects();

    public User getUser();
}
