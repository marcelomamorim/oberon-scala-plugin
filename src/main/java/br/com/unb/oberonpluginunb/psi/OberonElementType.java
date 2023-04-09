package br.com.unb.oberonpluginunb.psi;

import br.com.unb.oberonpluginunb.OberonLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class OberonElementType extends IElementType {

    public OberonElementType(@NotNull @NonNls String debugName) {
        super(debugName, OberonLanguage.INSTANCE);
    }

}
