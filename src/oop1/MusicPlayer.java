package oop1;

public class MusicPlayer {

    int volume1 = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 실행합니다.");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        volume1++;
        System.out.println("음악 플레이어 볼륨: " + volume1);
    }

    void setVolumeDown() {
        volume1--;
        System.out.println("음악 플레이어 볼륨: " + volume1);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume1);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

}
