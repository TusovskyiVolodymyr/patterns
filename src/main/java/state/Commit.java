package state;

public class Commit implements CommitState {

    private CommitState commitState;
    private CommitState newCommit;
    private CommitState approvedCommit;
    private CommitState commitWithComments;
    private CommitState mergedCommit;

    public void setCommitState(CommitState commitState) {
        this.commitState = commitState;
    }

    public Commit() {
        this.commitState = new NewCommit(this);
        this.approvedCommit = new ApprovedCommit(this);
        this.newCommit = new NewCommit(this);
        this.commitWithComments = new CommitWithComments(this);
        this.mergedCommit = new MergedCommit(this);
    }

    @Override
    public void merge() {
        commitState.merge();
    }

    @Override
    public void leaveComments() {
        commitState.leaveComments();
    }

    @Override
    public void approveCommit() {
        commitState.approveCommit();
    }

    @Override
    public void pushFixes() {
        commitState.pushFixes();
    }
}
