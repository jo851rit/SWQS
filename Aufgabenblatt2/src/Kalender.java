public class Kalender implements IKalender {
    public boolean tagGueltig(int tag, int monat) {
        if((tag == 30 || tag == 31) && monat == 2) {
            return false;
        }
        if(tag <= 0 || tag > 31) {
            return false;
        }
        if(monat < 1 || monat > 3) {
            return false;
        }
        return true;
    }
}
