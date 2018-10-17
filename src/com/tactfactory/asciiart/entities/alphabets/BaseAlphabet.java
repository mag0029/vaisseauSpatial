package com.tactfactory.asciiart.entities.alphabets;

public abstract class BaseAlphabet {

	private int h;
	private int w;
	private String[] datas;
	private int minRange;
	private int maxRange;
	private int itemNb;
	
	public int getH() {
		return h;
	}
	
	public int getW() {
		return w;
	}
	
	public String[] getDatas() {
		return datas;
	}

	public int getMinRange() {
		return minRange;
	}

	public int getMaxRange() {
		return maxRange;
	}

	public int getItemNb() {
		return itemNb;
	}

	public BaseAlphabet(int h, int w, String[] datas, int minRange, int maxRange, int itemNb) {
		super();
		this.h = h;
		this.w = w;
		this.datas = datas;
		this.minRange = minRange;
		this.maxRange = maxRange;
		this.itemNb = itemNb;
	}
}
