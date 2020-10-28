package com;

import java.util.Arrays;

/**
 * 1.定义一个月份枚举，1-> 1月， 2 -> 2月，以此类推，根据输入的数值返回对应的月份
 * 2.自定义一个注解，该注解作用于类上，运行时可用，可以被记录到javadoc中。
 */
@MyAnn
public class Main {

    public static void main(String[] args) {
	    System.out.println(Arrays.toString(MonthEnum.values()));
	    System.out.println(MonthEnum.valueOf("JAN"));
	    System.out.println(MonthEnum.APR.month);
	    System.out.println(MonthEnum.APR.monthText);
    }
}
