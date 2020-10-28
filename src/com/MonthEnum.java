package com;

public enum MonthEnum {
    JAN(1, "1月"),
    FEB(2, "2月"),
    MAR(3, "3月"),
    APR(4, "4月"),
    MAY(5, "5月"),
    JUN(6, "6月"),
    JUL(7, "7月"),
    AUG(8, "8月"),
    SEPT(9, "9月"),
    OCT(10, "10月"),
    NOV(11, "11月"),
    DEC(12, "12月");

    int month;
    String monthText;

    MonthEnum(int i, String s) {
        this.month = i;
        this.monthText = s;
    }

}
