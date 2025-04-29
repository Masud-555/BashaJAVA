
package busdifferentclaobject;


public class LocalBus {
    
     public boolean body;
    public int wheel;
    public int seat;
    public  int fan;
    public  int breck;

    public LocalBus() {
    }

    public LocalBus(boolean body, int wheel, int seat, int fan, int breck) {
        this.body = body;
        this.wheel = wheel;
        this.seat = seat;
        this.fan = fan;
        this.breck = breck;
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
    
}
