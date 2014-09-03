package com.greptilian.javaone2014bof5619.dataverse;

public class Client {

    // https://github.com/IQSS/dataverse for the actual code
    public static void main(String[] args) {

        // in practice, this is an @EJB
        EjbDataverseEngine commandEngine = new EjbDataverseEngine();

        System.out.println("# Command pattern in Dataverse");
        User user1 = new User();
        DataFile file1 = new DataFile();
        Command delFileCmd = new DeleteDataFileCommand(user1, file1);
        try {
            commandEngine.submitAndExecute(delFileCmd);
        } catch (CommandException ex) {
            System.out.println("Uh oh! " + ex);
        }
    }

}
