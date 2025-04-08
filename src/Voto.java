public class Voto {

    private int id;
    private int votanteID;
    private int cantidatoID;
    int[] timestamp = new int[3];

    public Voto(int id, int votanteID, int cantidatoID, int[] timestamp) {

        this.id = id;
        this.votanteID = votanteID;
        this.cantidatoID = cantidatoID;
        this.timestamp = new int[]{0, 0, 0};

    }

    public int getId() {
        return id;
    }

    public int getVotanteID() {
        return votanteID;
    }

    public int getCantidatoID() {
        return cantidatoID;
    }

    public int[] getTimestamp() {
        return timestamp;
    }

    void setId(int id) {
        this.id = id;
    }
    
    void setVotanteID(int votanteID) {
        this.votanteID = votanteID;
    }
    
    void setCantidatoID(int cantidatoID) {
        this.cantidatoID = cantidatoID;
    }
    
    void setTimestamp(int[] timestamp) {
        this.timestamp = timestamp;
    }

}

