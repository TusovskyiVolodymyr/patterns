package state;

public class ApprovedCommit implements CommitState {
    private Commit commit;

    public ApprovedCommit(Commit commit) {
        this.commit = commit;
    }

    @Override
    public void merge() {
        System.out.println("Code review +2 \nYour changes was merged!");
        commit.setCommitState(new MergedCommit(commit));
    }

    @Override
    public void pushFixes() {
        System.out.println("Commit already approved. No fixes is needed");
    }

    @Override
    public void leaveComments() {
        System.out.println("There are some comments");
        commit.setCommitState(new CommitWithComments(commit));
    }

    @Override
    public void approveCommit() {
        System.out.println("Commit is approved and ready to merge");
    }
}
