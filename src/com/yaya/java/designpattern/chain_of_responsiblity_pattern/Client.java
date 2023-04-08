package chain_of_responsiblity_pattern;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Handler> handlers=new ArrayList<>();
        handlers.add(new Saler());
        handlers.add(new Manager());
        HandlerChainImp handlerChainImp=new HandlerChainImp(handlers);
        handlerChainImp.doHandler(0.45f);
    }
}
