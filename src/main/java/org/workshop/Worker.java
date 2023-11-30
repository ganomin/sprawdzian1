package org.workshop;

import java.lang.reflect.Array;

public class Worker {
    public static void main(String[] args) {
        Tool tool = new Tool("MŁOTEK");
        tool.useTool();

        String tool1 = "ŚRÓBOKRĘT";
        String tool2 = "KLUCZ FRANCUSKI";
        String tool3 = "WIERTARA";
        String[] tablica = {tool1, tool2, tool3};

        for (int i = 0; i != 3; i++) {
            Tool moretools = new Tool(tablica[i]);
            moretools.useTool();
        }
    }
}