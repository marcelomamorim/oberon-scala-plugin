// This is a generated file. Not intended for manual editing.
package br.com.unb.oberonpluginunb.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import br.com.unb.oberonpluginunb.psi.impl.*;

public interface OberonTypes {

  IElementType PROPERTY = new OberonElementType("PROPERTY");

  IElementType COMMENT = new OberonTokenType("COMMENT");
  IElementType CRLF = new OberonTokenType("CRLF");
  IElementType KEY = new OberonTokenType("KEY");
  IElementType SEPARATOR = new OberonTokenType("SEPARATOR");
  IElementType VALUE = new OberonTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new OberonPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
