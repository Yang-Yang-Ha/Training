package bridge_pattern.device;

public class AppleTv implements Device {

    @Override
    public String deviceName() {
        return "Apple Tv";
    }

    @Override
    public void channelUp(String remoteName) {
        System.out.println(remoteName + " press the next one.");
    }

    @Override
    public void channelDown(String remoteName) {
        System.out.println(remoteName + " press the preview one.");
    }
}
