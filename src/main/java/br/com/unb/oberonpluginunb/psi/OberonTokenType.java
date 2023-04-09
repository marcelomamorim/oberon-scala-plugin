package br.com.unb.oberonpluginunb.psi;

import br.com.unb.oberonpluginunb.OberonLanguage;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class OberonTokenType extends IElementType {

    public OberonTokenType(@NotNull @NonNls String debugName) {
        super(debugName, OberonLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "OberonTokenType." + super.toString();
    }

}
