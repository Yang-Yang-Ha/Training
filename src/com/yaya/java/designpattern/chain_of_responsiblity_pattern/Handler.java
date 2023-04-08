package chain_of_responsiblity_pattern;

public interface Handler {

    void handle(float discount, HandlerChain handlerChain);

}
