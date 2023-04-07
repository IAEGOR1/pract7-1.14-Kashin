/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author yegor
 */
class MinValueThread extends Thread {

    private final int[] values;
    private int minValue;

    public MinValueThread(int[] values) {
        this.values = values;
    }

    public int getMinValue() {
        return minValue;
    }

    @Override
    public void run() {
        minValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < minValue) {
                minValue = values[i];
            }
        }
    }
}