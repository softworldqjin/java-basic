package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //음악켜기
        On(data);

        //볼륨증가
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        //음악 플레이어 상태
        showStatus(data);

        //음악 플레이어 끄기

    }

    static void On(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void Off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON");
        } else {
            System.out.println("음악 플레이어 OFF");
            Off(data);
        }
    }
}
