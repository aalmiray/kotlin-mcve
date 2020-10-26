package com.acme;

import javafx.beans.binding.BooleanBinding;
import javafx.collections.ObservableList;

import java.util.function.BinaryOperator;
import java.util.function.Function;

import static javafx.beans.binding.Bindings.createBooleanBinding;

public class ReducingBindings {

    public static <T> BooleanBinding reduceThenMapToBoolean(final ObservableList<T> items, final T defaultValue, final BinaryOperator<T> reducer, final Function<? super T, Boolean> mapper) {
        return createBooleanBinding(() -> mapper.apply(items.stream().reduce(reducer).orElse(defaultValue)), items);
    }

}