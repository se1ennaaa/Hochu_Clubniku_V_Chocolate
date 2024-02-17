package com.example.hochu_clubniku_v_chocolate.view

import com.example.hochu_clubniku_v_chocolate.model.CounterModel

class Presenter(private var view: CounterView) {
    private var model = CounterModel()
    fun increment() {
        model.increment()
        view.showNewCount(model.number)

    }

    fun decrement() {
        model.decrement()
        view.showNewCount(model.number)
    }
}
