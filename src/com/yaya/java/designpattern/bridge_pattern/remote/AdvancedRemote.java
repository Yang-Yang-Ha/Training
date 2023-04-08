package bridge_pattern.remote;

import bridge_pattern.device.Device;

public class AdvancedRemote extends Remote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void nextChannel() {
        device.channelUp("AdvancedRemote");
    }

    @Override
    public void previewChannel() {
        device.channelDown("AdvancedRemote");
    }
}
