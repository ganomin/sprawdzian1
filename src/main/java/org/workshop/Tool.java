package org.workshop;

public class Tool {
    String toolType;

    public Tool(String toolType) {
        this.toolType = toolType;
    }

    void useTool() {
        System.out.println(toolType);
    }
}