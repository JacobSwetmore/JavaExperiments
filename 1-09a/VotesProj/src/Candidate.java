public class Candidate {

    //private variables – hidden data
    private String name;
    private int votes = 0;

    //public methods
    public void setName(String inputName) {
        name = inputName;
    }

    public void incrementVote() {
        votes++;
    }
    
    public void setVote(int x){
        votes = x;
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

}