package com.company;

public class multip {
    public multip() {
    }

    public int[][] test() {
        int tab[][];
        tab = new int[12][12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                tab[i][j] = (i + 1) * (j + 1);
                System.out.println(tab[i][j]);
            }
        }

        return tab;
    }
}
