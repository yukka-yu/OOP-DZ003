package Animals;

public class Wolf {

    private int height;
    private int weight;
    private String eye_color;
    private String liveArea;
    private String dateOfFound;
    private String pack_leader;

    public Wolf (int height,  int weight, String eye_color, String liveArea, String dateOfFound, String pack_leader) {
        
        this.height = height;
        this.weight = height;
        this.eye_color = eye_color;
        this.liveArea = liveArea;
        this.dateOfFound = dateOfFound;
        this.pack_leader = pack_leader;
        

    }

    public void Make_sound() {
        System.out.println("RRR");
    }
}