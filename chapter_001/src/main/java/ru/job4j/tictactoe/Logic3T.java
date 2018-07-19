package ru.job4j.tictactoe;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        if (this.table[0][0].hasMarkX() && this.table[1][1].hasMarkX() && this.table[2][2].hasMarkX()) {
            return true;
        } else if (this.table[0][2].hasMarkX() && this.table[1][1].hasMarkX() && this.table[2][0].hasMarkX()) {
            return true;
        }
        for (int i = 0; i <= 2; i++) {
            if (this.table[i][0].hasMarkX() && this.table[i][1].hasMarkX() && this.table[i][2].hasMarkX()) {
                return true;
            }
            if (this.table[0][i].hasMarkX() && this.table[1][i].hasMarkX() && this.table[2][i].hasMarkX()) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinnerO() {
        if (this.table[0][0].hasMarkO() && this.table[1][1].hasMarkO() && this.table[2][2].hasMarkO()) {
            return true;
        } else if (this.table[0][2].hasMarkO() && this.table[1][1].hasMarkO() && this.table[2][0].hasMarkO()) {
            return true;
        }
        for (int i = 0; i <= 2; i++) {
            if (this.table[i][0].hasMarkO() && this.table[i][1].hasMarkO() && this.table[i][2].hasMarkO()) {
                return true;
            }
            if (this.table[0][i].hasMarkO() && this.table[1][i].hasMarkO() && this.table[2][i].hasMarkO()) {
                return true;
            }
        }
        return false;
    }


    public boolean hasGap() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if(!this.table[i][j].hasMarkX() && !this.table[i][j].hasMarkO()) {
                    return true;
                }
            }
        }
    return false;
    }
}
