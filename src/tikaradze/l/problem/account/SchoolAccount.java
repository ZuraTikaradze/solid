package tikaradze.l.problem.account;

public class SchoolAccount implements Account {
    @Override
    public void localTransfer(double amount) {
        System.out.println("Local Transfer Logic here");
    }

    @Override
    public void InternationalTransfer(double amount) {
        throw new RuntimeException("Not Implemented");
    }
}
