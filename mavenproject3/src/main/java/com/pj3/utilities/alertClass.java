/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pj3.utilities;

/**
 *
 * @author admin
 */
public class alertClass {
	private static alertClass instance;
	private alertClass() {
	}
	
	public static alertClass getInstance() {
		if(instance == null) {
			instance = new alertClass();
		}
		return instance;
	}
}