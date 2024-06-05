public abstract class BottleOfWater {
    private String name;
    private int cost;
    private int volume;

    public BottleOfWater (String name, int cost, int volume) {
        this.name = name;
        this.cost = cost;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "BottleOfWater name=" + name + ", cost=" + cost + ", volume=" + volume + "";
    }
}
