package com.doge.ErrorHandling;

import com.doge.AST.Variable;
import com.doge.checking.Scope;

import static com.doge.ErrorHandling.ANSIEscapeCodes.*;

/**
 * Created by michno on 27/3/15.
 */
public class UnDeclaredError extends LanguageError {
    private Variable unDeclaredVariable;
    private Scope scope;

    public UnDeclaredError(Variable unDeclaredVariable, Scope scope, int lineNum) {
        this.unDeclaredVariable = unDeclaredVariable;
        this.scope = scope;
        this.lineNum = lineNum;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Undeclared variable %1$s%4$s%3$s in scope %2$s%5$s%3$s",
                ANSI_RED, ANSI_BLUE, ANSI_RESET,
                unDeclaredVariable, scope);
    }
}
