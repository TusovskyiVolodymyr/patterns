package state;

public class App {
    public static void main(String[] args) {
        Commit commit = new Commit();
        commit.leaveComments();
        commit.approveCommit();
        commit.pushFixes();
        commit.leaveComments();
        commit.merge();
        commit.pushFixes();
        commit.approveCommit();
        commit.merge();
    }
}
