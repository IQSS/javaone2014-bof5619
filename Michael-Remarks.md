# Remarks 
_Michael_
* Slide 1 - We need to start with general concepts. DV is a case study, should be presented later.
* Slide 2  
    * DV4 has to support secure datasets (health, education, etc)
    * This is an adaptaion of the classic command pattern, to include permissions. Normally, it's mentioned with "undo" etc.
    * Another issue is to reuse code between the API and UI.
* Basic command - nice star wars references
* Slide 10 - shouldn't we use `stormTrooper.execute( command )`? #TODO
* Slide 14 - Maybe we should handle the Type.JEDI/Regular different behaviors using inheritance rather than type field checking. More OO.
* Up to #17 - unclear why we need the trooper there - they just delegate tp the command. 
* Maybe add a sequence diagram for the classic command (already have one)
* #17 - after the GoF description - So, really - we take a block of code and its parameters, an use it as a data (think of storing commands in a Map, where the key is an event id - for triggered command execution). What's another version of this? Right, lambda expressions. This is fundamentally different from the traditional procedural Code/Data dichotomy. This opens up lots of opportunities:
    - Macros, as sequence of commands
    - ignoring (permissions/disable)
    - logging
    - testability
    - execute on a different thread
        + Add serialization to that....
    - When commands can invoke commands - we get full recursive-ness
* #19 - Java EE as death-star.... need to lighten this up. Should I add a "powered by Glassfish"/"fork me on SpaceHub" stickers on it?
* #21 - Need to present the problem of merging JEE and Command - need to push the server context to a POJO.

## Additions
- Permission annotations
    + Dealing with inheritance
- Permission sets as bit fields.
- Testability (demo junit code)
- Resuability (demo backing bean/api code)
- Decorators
- Decorator collides with annotations, so we use static/dynamic combo

## Important - So far, no lean beans!
- Question:
    + Java EE MVC uses beans to modify objects
    + Command uses commands to modify objects + permissions etc.
    + Can we replace beans with commands? *Main questions we presented*
        * not entirely, due to dependency injections etc.
        * We can replace everything except `EntityManager`s, JMS queue pools etc.
        * Lessons learned section


