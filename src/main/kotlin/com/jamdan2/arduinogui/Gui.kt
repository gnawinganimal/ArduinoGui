package com.jamdan2.arduinogui

import java.awt.Dimension
import java.awt.Font
import javax.swing.*

class Gui : JFrame("Arduino Gui") {
    init {
        size = Dimension(2000, 1600)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        contentPane = JPanel()
        contentPane.add(JLabel("servo angle").apply {
            font = Font("Arial", Font.BOLD, 30)
        })
        contentPane.add(JSlider(JSlider.HORIZONTAL, 0, 180, 90).apply {
            preferredSize = Dimension(1500, 500)
            majorTickSpacing = 15
            minorTickSpacing = 5
            paintTicks = true
            paintLabels = true
            addChangeListener {
                with(it.source as JSlider) { link.setServoAngle(this.value) }
            }
        })
    }
}
