package com.tactfactory.asciiart.managers;

import com.tactfactory.asciiart.entities.alphabets.DefaultAlphabet;

public class AsciiManager {

	private DefaultAlphabet alphabet;

	public AsciiManager(DefaultAlphabet alphabet) {
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
				if (letter >= 65 && letter <= 90) {
					builder.append(ROW.substring((letter - 65) * this.alphabet.getW(),
							(letter - 65) * this.alphabet.getW() + this.alphabet.getW()));
				} else {
					builder.append(ROW.substring(this.alphabet.getW() * 26,
							(this.alphabet.getW() * 26) + this.alphabet.getW()));
				}

			}
			builder.append("\n");
		}

		System.out.println("Translate : " + message);
		System.out.println(builder.toString());

		return result;
	}
}
