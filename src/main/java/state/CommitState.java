package state;

public interface CommitState {
     void merge();
     void leaveComments();
     void approveCommit();
     void pushFixes();
}
