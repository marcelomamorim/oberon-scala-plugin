package br.com.unb.oberonpluginunb;

import br.com.unb.oberonpluginunb.parser.OberonParser;
import br.com.unb.oberonpluginunb.psi.OberonFile;
import br.com.unb.oberonpluginunb.psi.OberonTokenSets;
import br.com.unb.oberonpluginunb.psi.OberonTypes;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

public class OberonParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(OberonLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new OberonLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return OberonTokenSets.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new OberonParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new OberonFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return OberonTypes.Factory.createElement(node);
    }

}
