package com.example.android.miwok;

/**
 * Created by Karnoha on 08.05.2017.
 */

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // Get the default translation of the word
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Get the Miwok translation of the word
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
