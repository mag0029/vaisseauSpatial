package com.tactfactory.asciiart.entities.alphabets.defaultalphabet;

import com.tactfactory.asciiart.entities.alphabets.BaseAlphabet;

public abstract class DefaultAlphabet extends BaseAlphabet {

	public DefaultAlphabet(int h, int w, String[] datas) {
		super(h, w, datas, 65, 90, 26);
	}
}
