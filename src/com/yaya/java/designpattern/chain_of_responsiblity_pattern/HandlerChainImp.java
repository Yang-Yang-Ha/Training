package chain_of_responsiblity_pattern;

import java.util.Iterator;
import java.util.List;

public class HandlerChainImp implements HandlerChain {

    private Iterator<Handler> mHandlers;

    public HandlerChainImp(List<Handler> handlers) {
        mHandlers = handlers.iterator();
    }

    @Override
    public void doHandler(float discount) {
        if (mHandlers.hasNext()){
            Handler handler=mHandlers.next();
            handler.handle(discount,this);
        }
    }
}
