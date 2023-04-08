package bridge_pattern;

import bridge_pattern.device.AppleTv;
import bridge_pattern.remote.AdvancedRemote;
import bridge_pattern.remote.CommonRemote;

public class ClientDemo {

    public static void main(String[] args) {
        AppleTv appleTv = new AppleTv();

        CommonRemote commonRemote = new CommonRemote(appleTv);
        AdvancedRemote advancedRemote = new AdvancedRemote(appleTv);

        commonRemote.previewChannel();
        commonRemote.nextChannel();
        advancedRemote.previewChannel();
        advancedRemote.nextChannel();
    }
}
