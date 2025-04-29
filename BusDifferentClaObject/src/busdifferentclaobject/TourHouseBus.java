
package busdifferentclaobject;


public class TourHouseBus  extends LocalBus {
    
    private int light;
    private int ac;
    private String washroom;
    private int bed;
    private String table;

    public TourHouseBus() {
    }

    public TourHouseBus(int light, int ac, String washroom, int bed, String table) {
        this.light = light;
        this.ac = ac;
        this.washroom = washroom;
        this.bed = bed;
        this.table = table;
    }

    public TourHouseBus(int light, int ac, String washroom, int bed, String table, boolean body, int wheel, int seat, int fan, int breck) {
        super(body, wheel, seat, fan, breck);
        this.light = light;
        this.ac = ac;
        this.washroom = washroom;
        this.bed = bed;
        this.table = table;
    }

    public int getLight() {
        return light;
    }

    public void setLight(int light) {
        this.light = light;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public String getWashroom() {
        return washroom;
    }

    public void setWashroom(String washroom) {
        this.washroom = washroom;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public boolean isBody() {
        return body;
    }

    public void setBody(boolean body) {
        this.body = body;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getFan() {
        return fan;
    }

    public void setFan(int fan) {
        this.fan = fan;
    }

    public int getBreck() {
        return breck;
    }

    public void setBreck(int breck) {
        this.breck = breck;
    }

    public String lBus() {

        String mas = (" \n Body " + body + "\n Wheel " + wheel + " \n No. of Seat" + seat
                + "\n No. of Fan:" + fan + "\n Break" + breck + " \n No of light" + light + "\n Ac" + ac
                + "\n Washroom :" + washroom + "\n No of bed : " + bed + "\n No of table: " + table);
        return mas;
    }
    
}
