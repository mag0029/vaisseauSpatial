package com.tactfactory.asciiart;

import com.tactfactory.asciiart.entities.alphabets.advancealphabet.AdvanceAlphabetSimpleImplementation;
import com.tactfactory.asciiart.entities.alphabets.defaultalphabet.DefaultAlphabetBulbheadImplementation;
import com.tactfactory.asciiart.entities.alphabets.defaultalphabet.DefaultAlphabetEpicImplementation;
import com.tactfactory.asciiart.entities.alphabets.defaultalphabet.DefaultAlphabetSimpleImplementation;
import com.tactfactory.asciiart.managers.AsciiManager;
import com.tactfactory.asciiart.utils.ScannerProvider;

public class Application {

	public static void main(String[] args) {
		AsciiManager manager = new AsciiManager(new AdvanceAlphabetSimpleImplementation());
		
		while(true) {
			manager.getAsciiTranslation(ScannerProvider.getInstance().getScanner().nextLine());
		}
	}
}
