// This is a generated file. Not intended for manual editing.
package br.com.unb.oberonpluginunb.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static br.com.unb.oberonpluginunb.psi.OberonTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import br.com.unb.oberonpluginunb.psi.*;

public class OberonPropertyImpl extends ASTWrapperPsiElement implements OberonProperty {

  public OberonPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull OberonVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OberonVisitor) accept((OberonVisitor)visitor);
    else super.accept(visitor);
  }

}
