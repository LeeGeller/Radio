public class Radio {

    private int radioStation;
    private int volume;

    public void next() {
        if (radioStation != 9) {
            radioStation++;
        } else {
            radioStation = 0;
        }
    }

    public void prev() {
        if (radioStation != 0) {
            radioStation--;
        } else {
            radioStation = 9;
        }
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < 0) {
            return;
        }

        if (radioStation > 9) {
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

