package com.doge.ErrorHandling;

import com.doge.AST.Variable;
import com.doge.checking.Scope;

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
        return super.toString() + "Undeclared variable " + unDeclaredVariable + " in scope " + scope ;
    }
}