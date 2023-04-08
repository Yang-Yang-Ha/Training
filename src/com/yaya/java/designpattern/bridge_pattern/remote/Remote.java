package bridge_pattern.remote;

import bridge_pattern.device.Device;

public abstract class Remote {

    Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public abstract void nextChannel();

    public abstract void previewChannel();
}
