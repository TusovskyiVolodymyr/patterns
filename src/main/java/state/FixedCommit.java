package state;

public class FixedCommit implements CommitState {

    private Commit commit;

    public FixedCommit(Commit commit) {
        this.commit = commit;
    }

    @Override
    public void merge() {
        System.out.println("Can't merge without approval");
    }

    @Override
    public void pushFixes() {
        System.out.println("Fixes already pushed. Waiting for approve!");
    }

    @Override
    public void leaveComments() {
        System.out.println("There are some comments...");
        commit.setCommitState(new CommitWithComments(commit));
    }

    @Override
    public void approveCommit() {
        System.out.println("Looks good for me approved");
        commit.setCommitState(new ApprovedCommit(commit));
    }
}
