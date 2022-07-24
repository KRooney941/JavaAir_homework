public class CabinCrewMembers {

    private String name;
    private Rank rank;



    public CabinCrewMembers(String name, Rank rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return this.name;
    }

    public Rank getRank(){
        return this.rank;
    }
}
