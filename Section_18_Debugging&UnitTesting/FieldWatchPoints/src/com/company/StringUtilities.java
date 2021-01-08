package com.company;

public class StringUtilities {
    private StringBuilder sBuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder sBuilder, char c) {
        sBuilder.append(c);
        charsAdded++;
    }
}
// Watches always appear in the variable pane and are updated as the application runs
// Watch turns blue when the last statement executed changed it's value

// Field watchpoint is a type of breakpoint (alt + left-click)..anytime charsAdded is modified, the program would automatically break