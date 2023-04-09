package br.com.unb.oberonpluginunb.psi;

import br.com.unb.oberonpluginunb.OberonFileType;
import br.com.unb.oberonpluginunb.OberonLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class OberonFile extends PsiFileBase {

    public OberonFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, OberonLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return OberonFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Oberon File";
    }

}
