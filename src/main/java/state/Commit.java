package state;

public class Commit implements CommitState {

    private CommitState commitState;

    public void setCommitState(CommitState commitState) {
        this.commitState = commitState;
    }

    public Commit() {
        this.commitState = new NewCommit(this);
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
