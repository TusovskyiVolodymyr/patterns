package state;

public class NewCommit implements CommitState {
    private Commit commit;

    public NewCommit(Commit commit) {
        this.commit = commit;
    }

    @Override
    public void pushFixes() {
        System.out.println("No comments is here...");
    }

    @Override
    public void merge() {
        System.out.println("Can't merge non approved commit");
    }

    @Override
    public void leaveComments() {
        System.out.println("Leaved some comments");
        commit.setCommitState(new CommitWithComments(commit));
    }

    @Override
    public void approveCommit() {
        System.out.println("Looks good to me approved");
        commit.setCommitState(new ApprovedCommit(commit));
    }
}
