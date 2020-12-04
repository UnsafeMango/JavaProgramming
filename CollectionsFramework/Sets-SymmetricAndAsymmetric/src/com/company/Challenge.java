package com.company;

public class Challenge {
    /**
     * When overriding the equals() method in the HeavenlyBody class, we
     * were careful to make sure it will not return true if a HeavenlyBody
     * was compared to the subclass of itself
     *
     * We did that to demonstrate that method, but it was actually
     * unnecessary in the HeavenlyBody class.
     *
     * The mini challenge is just a question: why was it unnecessary?
     *
     *
     *
     * The HeavenlyBody class is final so it cannot be subclassed
     * The Java String class is also final, which  is why it can safely
     * use the instanceOf method without having to worry about
     * comparison with a subclass
     */
}
