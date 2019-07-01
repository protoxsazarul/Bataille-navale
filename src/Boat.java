public abstract class Boat {
    private boolean isSinked;
    private Spot[] boatSpots = new Spot[];
    private int nbSpots;

    public int getNbSpots() {
        return nbSpots;
    }

    public void setNbSpots(int nbSpots) {
        this.nbSpots = nbSpots;
    }

    public boolean getSinked() {
        return isSinked;
    }

    public void setSinked(boolean sinked) {
        isSinked = sinked;
    }
}
