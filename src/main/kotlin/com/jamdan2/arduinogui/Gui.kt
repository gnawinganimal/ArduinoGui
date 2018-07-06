package com.jamdan2.arduinogui

import javafx.geometry.Orientation
import tornadofx.*

class Gui : App(MainView::class)

class MainView : View() {
    override val root = vbox {
        label { text = "servo angle" }
        slider(0, 180, 90, Orientation.HORIZONTAL) {
            majorTickUnit = 15.0
            minorTickCount = 30
            isShowTickLabels = true
            style {
                maxWidth = 300.mm
                minWidth = 300.mm
            }
            valueProperty().addListener { _, _, newValue ->
                link.setServoAngle(newValue.toInt())
            }
        }
    }
}
