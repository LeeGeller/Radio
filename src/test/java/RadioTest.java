import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void testRadioStationValid() {
        Radio radio = new Radio();

        radio.setRadioStation(3);
        radio.next();

        int expected = 4;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioStationBorder() {
        Radio radio = new Radio();

        radio.next();

        int expected = 1;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioStationMinus() {
        Radio radio = new Radio();

        radio.setRadioStation(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioStationMinusZero() {
        Radio radio = new Radio();

        radio.setRadioStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioStationEqual() {
        Radio radio = new Radio();

        radio.setRadioStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioStationMinusStation() {
        Radio radio = new Radio();

        radio.setRadioStation(-1);

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioStationOver() {
        Radio radio = new Radio();

        radio.setRadioStation(10);

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioStationNonEqual() {
        Radio radio = new Radio();

        radio.setRadioStation(8);
        radio.next();

        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeValid() {
        Radio radio = new Radio();

        radio.setVolume(66);

        int expected = 66;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeBorder() {
        Radio radio = new Radio();

        radio.setVolume(100);
        radio.nextVolume();


        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMinus() {
        Radio radio = new Radio();

        radio.setVolume(100);
        radio.nextVolume();

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMinusZero() {
        Radio radio = new Radio();

        radio.setVolume(0);
        radio.prevVolume();

        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeOver() {
        Radio radio = new Radio();

        radio.setVolume(102);

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeLess() {
        Radio radio = new Radio();

        radio.setVolume(-5);

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMore() {
        Radio radio = new Radio();

        radio.setVolume(99);
        radio.nextVolume();

        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeLow() {
        Radio radio = new Radio();

        radio.setVolume(100);
        radio.prevVolume();

        int expected = 99;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}