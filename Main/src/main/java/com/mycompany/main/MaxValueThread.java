/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author yegor
 */
class MaxValueThread extends Thread {

    private final int[] values;
    private int maxValue;

    public MaxValueThread(int[] values) {
        this.values = values;
    }

    public int getMaxValue() {
        return maxValue;
    }

    @Override
    public void run() {
        maxValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }
    }
}
