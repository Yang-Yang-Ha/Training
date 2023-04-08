package chain_of_responsiblity_pattern;

public class Saler implements Handler {
    @Override
    public void handle(float discount, HandlerChain handlerChain) {
        if (discount < 0.05f) {
            System.out.println("Saler批准：" + discount);
        } else {
            handlerChain.doHandler(discount);
        }
    }
}
