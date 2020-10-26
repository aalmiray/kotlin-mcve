package com.acme

import javafx.beans.binding.BooleanBinding
import javafx.collections.ObservableList
import java.util.function.BinaryOperator
import java.util.function.Function

fun <T> ObservableList<T>.reduceThenMapToBoolean(defaultValue: T?, reducer: BinaryOperator<T>, mapper: Function<in T, Boolean>): BooleanBinding {
    return ReducingBindings.reduceThenMapToBoolean(this, defaultValue, reducer, mapper)
}
