package bridge_pattern.device;

public interface Device {

    String deviceName();

    void channelUp(String remoteName);

    void channelDown(String remoteName);
}
