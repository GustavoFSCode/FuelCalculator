package com.example.fuelcalculator

import android.text.InputFilter
import android.text.Spanned
import java.util.regex.Pattern

class DecimalDigitsInputFilter(maxDigitsAfterDecimal: Int = 2) : InputFilter {
    private val pattern = Pattern.compile("^[0-9]*[.,]?[0-9]{0,$maxDigitsAfterDecimal}$")

    override fun filter(
        source: CharSequence,
        start: Int,
        end: Int,
        dest: Spanned,
        dstart: Int,
        dend: Int
    ): CharSequence? {
        val replacement = source.subSequence(start, end).toString()
        val newVal = dest.subSequence(0, dstart).toString() + replacement + dest.subSequence(dend, dest.length).toString()

        if (pattern.matcher(newVal).matches()) {
            return null
        }
        return ""
    }
}