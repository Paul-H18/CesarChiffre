package de.paul;

public class Alphabeth {

    private char[] alpha = new char[36];
    private final int length = alpha.length;

    public Alphabeth() {
        alpha[0] = 'a';
        alpha[1] = 'b';
        alpha[2] = 'c';
        alpha[3] = 'd';
        alpha[4] = 'e';
        alpha[5] = 'f';
        alpha[6] = 'g';
        alpha[7] = 'h';
        alpha[8] = 'i';
        alpha[9] = 'j';
        alpha[10] = 'k';
        alpha[11] = 'l';
        alpha[12] = 'm';
        alpha[13] = 'n';
        alpha[14] = 'o';
        alpha[15] = 'p';
        alpha[16] = 'q';
        alpha[17] = 'r';
        alpha[18] = 's';
        alpha[19] = 't';
        alpha[20] = 'u';
        alpha[21] = 'v';
        alpha[22] = 'w';
        alpha[23] = 'x';
        alpha[24] = 'y';
        alpha[25] = 'z';
        alpha[26] = '0';
        alpha[27] = '1';
        alpha[28] = '2';
        alpha[29] = '3';
        alpha[30] = '4';
        alpha[31] = '5';
        alpha[32] = '6';
        alpha[33] = '7';
        alpha[34] = '8';
        alpha[35] = '9';
    }

    public char getChar(int number) {
        return this.alpha[number];
    }

    public int getIndexFromChar(char c) {
        int wanted = 0;
        for (int i = 0; i < this.getLength(); i++) {
            if(alpha[i] == c) {
                wanted = i;
            }
        }
        return wanted;
    }

    public int getLength() {
        return this.length;
    }





}
