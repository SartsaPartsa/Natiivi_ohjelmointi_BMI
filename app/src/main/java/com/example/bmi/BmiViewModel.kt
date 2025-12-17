package com.example.bmi

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BmiViewModel : ViewModel() {

    var heightText by mutableStateOf("")
    var weightText by mutableStateOf("")

    val bmi: Double
        get() {
            val height = heightText.replace(',', '.').toDoubleOrNull()
            val weight = weightText.replace(',', '.').toDoubleOrNull()

            if (height == null || weight == null || height <= 0.0 || weight <= 0.0) {
                return 0.0
            }

            return weight / (height * height)
        }
}
