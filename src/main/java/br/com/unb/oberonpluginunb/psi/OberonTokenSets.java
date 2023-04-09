package br.com.unb.oberonpluginunb.psi;

import com.intellij.psi.tree.TokenSet;

public interface OberonTokenSets {

    TokenSet IDENTIFIERS = TokenSet.create(OberonTypes.KEY);

    TokenSet COMMENTS = TokenSet.create(OberonTypes.COMMENT);

}