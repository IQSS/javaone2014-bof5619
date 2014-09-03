package com.greptilian.javaone2014bof5619.dataverse;

import java.util.Map;

/**
 * @depend - has - RequiredPermissions
 * @depend - has - CommandContext
 */
public interface Command<R> {

    public <R> R execute(CommandContext context);

    public Map<String, DvObject> getAffectedDvObjects();

    public User getUser();
}
