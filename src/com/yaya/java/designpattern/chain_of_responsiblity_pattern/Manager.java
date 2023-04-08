package chain_of_responsiblity_pattern;

public class Manager implements Handler {
    @Override
    public void handle(float discount, HandlerChain handlerChain) {
        if (discount < 0.5f) {
            System.out.println("Manager批准：" + discount);
        } else {
            handlerChain.doHandler(discount);
        }
    }
}
