package com.company;

import java.util.ArrayList;
import java.util.List;

public class YearRange {
    private int firstYear;
    private int secondYear;
    private int rangeType;
    private int firstDivisor;
    private int secondDivisor;

    public YearRange(int firstYear, int secondYear) {
        this.firstYear = firstYear;
        this.secondYear = secondYear;
    }

    public int getFirstYear() {
        return firstYear;
    }

    public void setFirstYear(int firstYear) {
        this.firstYear = firstYear;
    }

    public int getSecondYear() {
        return secondYear;
    }

    public void setSecondYear(int secondYear) {
        this.secondYear = secondYear;
    }

    public int getRangeType() {
        return rangeType;
    }

    public void setRangeType(int rangeType) {
        this.rangeType = rangeType;
    }

    public int getFirstDivisor() {
        return firstDivisor;
    }

    public void setFirstDivisor(int firstDivisor) {
        this.firstDivisor = firstDivisor;
    }

    public int getSecondDivisor() {
        return secondDivisor;
    }

    public void setSecondDivisor(int secondDivisor) {
        this.secondDivisor = secondDivisor;
    }

    public void printYears() {
        List<Integer>range_numbers = new ArrayList<>();
        int  count = 3000;
        for (int x =0; x < count;x++){
            int add_year = firstYear+ x;
            range_numbers.add(add_year);
            if (add_year == secondYear){
                break;
            }
        }
       if (secondDivisor ==0){
           divisibleBy4(range_numbers);
       } else{
           divisibleBy14and20(range_numbers);
       }
    }

    public void divisibleBy14and20(List<Integer> range_numbers){
        for (int x = 0; x< range_numbers.size();x++){
            if ((range_numbers.get(x) % firstDivisor )+(range_numbers.get(x) % secondDivisor ) == 0){
                System.out.println(range_numbers.get(x));
            }
        }
    }

    public void divisibleBy4(List<Integer> range_numbers){
        for (int x = 0; x<range_numbers.size();x++){
            if ((range_numbers.get(x) % firstDivisor ) == 0){
                System.out.println(range_numbers.get(x));
            }
        }
    }
}
