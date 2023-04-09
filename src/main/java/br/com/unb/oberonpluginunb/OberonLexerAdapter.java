package br.com.unb.oberonpluginunb;

import com.intellij.lexer.FlexAdapter;

public class OberonLexerAdapter extends FlexAdapter {

    public OberonLexerAdapter() {
        super(new OberonLexer(null));
    }

}
