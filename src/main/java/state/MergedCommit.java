package state;

public class MergedCommit implements CommitState {
    private Commit commit;

    public MergedCommit(Commit commit) {
        this.commit = commit;
    }

    @Override
    public void merge() {
        System.out.println("Your commit was already merged");
    }

    @Override
    public void leaveComments() {
        System.out.println("Could not leave comments on merged commit");
    }

    @Override
    public void approveCommit() {
        System.out.println("Commit is already approved");
    }

    @Override
    public void pushFixes() {
        System.out.println("Commit is already merged. No fixes needed");
    }
}
