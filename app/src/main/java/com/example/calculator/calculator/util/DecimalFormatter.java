package com.example.calculator.calculator.util;

import android.icu.text.DecimalFormat;

public class DecimalFormatter {

    DecimalFormat decimalFormat = new DecimalFormat("###,###.####");

    public String getDecimalString(String result){
        return decimalFormat.format(Integer.parseInt(result));
    }

    public String getRemoveDecimal(String result){
        return result.replace(",", "");
    }

}
