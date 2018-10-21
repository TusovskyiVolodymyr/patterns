package state;

public class CommitWithComments implements CommitState {
    private Commit commit;

    public CommitWithComments(Commit commit) {
        this.commit = commit;
    }

    @Override
    public void merge() {
        System.out.println("Can't merge commit with comments");
    }

    @Override
    public void leaveComments() {
        System.out.println("Leaving one more comments...");
    }

    @Override
    public void pushFixes() {
        System.out.println("Pushed fixes by comments");
        commit.setCommitState(new FixedCommit(commit));
    }

    @Override
    public void approveCommit() {
        System.out.println("Can't approve commit without fixes...");
    }
}
