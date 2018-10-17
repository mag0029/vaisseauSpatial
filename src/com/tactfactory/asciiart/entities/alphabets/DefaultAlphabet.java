package com.tactfactory.asciiart.entities.alphabets;

public abstract class DefaultAlphabet {

	private int h;
	private int w;
	private String[] datas;
	
	public int getH() {
		return h;
	}
	
	public int getW() {
		return w;
	}
	
	public String[] getDatas() {
		return datas;
	}

	public DefaultAlphabet(int h, int w, String[] datas) {
		super();
		this.h = h;
		this.w = w;
		this.datas = datas;
	}
}
