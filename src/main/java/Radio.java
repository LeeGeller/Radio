public class Radio {

    private int radioStation;
    private int volume;
    private int maxRadiostation;

    public Radio(int countRadiostation) {
        maxRadiostation = countRadiostation - 1;

    }

    public Radio() {
        maxRadiostation = 9;

    }

    public void next() {
        if (radioStation != maxRadiostation) {
            radioStation++;
        } else {
            radioStation = 0;
        }
    }

    public void prev() {
        if (radioStation != 0) {
            radioStation--;
        } else {
            radioStation = maxRadiostation;
        }
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < 0) {
            return;
        }

        if (radioStation > maxRadiostation) {
            return;
        }
        this.radioStation = radioStation;
    }


    public void nextVolume() {

        if (volume != 100) {
            volume++;
        } else {
            volume = 0;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {

        if (volume < 0) {
            return;
        }

        if (volume > 100) {
            return;
        }
        this.volume = volume;
    }

    public void prevVolume() {
        if (volume != 0) {
            volume--;
        } else {
            volume = 100;
        }
    }

}