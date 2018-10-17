package com.tactfactory.asciiart.managers;

import com.tactfactory.asciiart.entities.alphabets.BaseAlphabet;

public class AsciiManager {

	private BaseAlphabet alphabet;

	public AsciiManager(BaseAlphabet alphabet) {
		super();
		this.alphabet = alphabet;
	}

	public String[] getAsciiTranslation(String message) {
		String[] result = new String[this.alphabet.getH()];

		message = message.toUpperCase();
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < this.alphabet.getH(); i++) {
			String ROW = this.alphabet.getDatas()[i];

			// char maj 65 => 90
			for (char letter : message.toCharArray()) {
				if (letter >= this.alphabet.getMinRange() && letter <= this.alphabet.getMaxRange()) {
					builder.append(ROW.substring((letter - this.alphabet.getMinRange()) * this.alphabet.getW(),
							(letter - this.alphabet.getMinRange()) * this.alphabet.getW() + this.alphabet.getW()));
				} else {
					builder.append(ROW.substring(this.alphabet.getW() * this.alphabet.getItemNb(),
							(this.alphabet.getW() * this.alphabet.getItemNb()) + this.alphabet.getW()));
				}

			}
			builder.append("\n");
		}

		System.out.println("Translate : " + message);
		System.out.println(builder.toString());

		return result;
	}
}
