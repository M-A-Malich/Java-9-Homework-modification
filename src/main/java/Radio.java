public class Radio {
    private int currentStation;
    private int currentVolume;


    public void nextStation() {
        if (currentStation !=9) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }

    public void prevStation() {
        if (currentStation != 0) {
            currentStation--;
            return;
        }
        currentStation = 9;
    }


    public void increaseCurrentVolume() {
        if (currentVolume != 100) {
            currentVolume++;
            return;
        }
        currentVolume = 100;
    }
    public void decreaseCurrentVolume() {
        if (currentVolume != 0) {
            currentVolume--;
            return;
        }
        currentVolume = 0;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

}
