package bridge_pattern.remote;

import bridge_pattern.device.Device;

public class CommonRemote extends Remote {

    public CommonRemote(Device device) {
        super(device);
    }

    @Override
    public void nextChannel() {
        device.channelUp("CommonRemote");
    }

    @Override
    public void previewChannel() {
        device.channelDown("CommonRemote");
    }
}
