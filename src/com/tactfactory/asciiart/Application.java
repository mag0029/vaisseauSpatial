package com.tactfactory.asciiart;

import com.tactfactory.asciiart.entities.alphabets.DefaultAlphabetBulbheadImplementation;
import com.tactfactory.asciiart.entities.alphabets.DefaultAlphabetEpicImplementation;
import com.tactfactory.asciiart.entities.alphabets.DefaultAlphabetSimpleImplementation;
import com.tactfactory.asciiart.managers.AsciiManager;
import com.tactfactory.asciiart.utils.ScannerProvider;

public class Application {

	public static void main(String[] args) {
		AsciiManager manager = new AsciiManager(new DefaultAlphabetEpicImplementation());
		
		while(true) {
			manager.getAsciiTranslation(ScannerProvider.getInstance().getScanner().nextLine());
		}
	}
}
