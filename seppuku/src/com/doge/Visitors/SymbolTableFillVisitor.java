package com.doge.Visitors;

import com.doge.AST.*;
import com.doge.checking.Symbol;
import com.doge.checking.SymbolTable;
import com.doge.types.ScopeType;

/**
 * Created by Søren on 25-03-2015.
 */
public class SymbolTableFillVisitor extends BaseASTVisitor<Void> {

    private SymbolTable symbolTable;
    public SymbolTableFillVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    @Override
    public Void VisitTopNode(TopNode node) {
        for (FunctionDclNode FuncDecl : node.getFunctionDeclarations())
            visit(FuncDecl);
        visit(node.getStatements());
        return null;
    }

    @Override
    public Void VisitFunctionDclNode(FunctionDclNode node) {
        symbolTable.currentScope().define(node.getVariable());
        symbolTable.pushScope(ScopeType.FUNCDECL);
        for (Variable variable : node.getParameters()) {
            symbolTable.currentScope().define(variable);
        }
        visit(node.getFunctionBody());
        symbolTable.popScope();
        return null;
    }

    @Override
    public Void VisitForLoopNode(ForLoopNode node) {
        symbolTable.pushScope(ScopeType.LOOP);
        visit(node.getInitialize());
        visit(node.getBody());
        symbolTable.popScope();
        return null;
    }

    @Override
    public Void VisitWhileLoopNode(WhileLoopNode node) {
        symbolTable.pushScope(ScopeType.LOOP);
        visit(node.getBody());
        symbolTable.popScope();
        return null;
    }

    //TODO scope pr. if, else if, og else, right??
    @Override
    public Void VisitConditionalNode(ConditionalNode node) {
        visit(node.getConditionalExpression());
        symbolTable.pushScope(ScopeType.CONDITIONAL);
        symbolTable.pushScope(ScopeType.LOCAL);
        visit(node.getBody());
        symbolTable.popScope();
        for (ConditionalNode ifElse : node.getIfElses()) {
            visit(ifElse.getConditionalExpression());
            symbolTable.pushScope(ScopeType.LOCAL);
            visit(ifElse.getBody());
            symbolTable.popScope();
        }
        if(node.getElseBody() != null) {
            symbolTable.pushScope(ScopeType.LOCAL);
            visit(node.getElseBody());
            symbolTable.popScope();
        }
        symbolTable.popScope();
        return null;
    }

    @Override
    public Void VisitConditionalExpressionNode(ConditionalExpressionNode node) {
        if (node.getLValue() != null)
            visit(node.getLValue());
        if (node.getRValue() != null)
            visit(node.getRValue());
        return null;
    }

    @Override
    public Void VisitDeclarationNode(DeclarationNode node) {
        symbolTable.currentScope().define(node.getVariable());
        visit(node.getExpression());
        return null;
    }

    @Override
    public Void VisitExpressionNode(ExpressionNode node) {
        if (node.getLValue() != null)
            visit(node.getLValue());
        if (node.getRValue() != null)
            visit(node.getRValue());
        return null;
    }

    @Override
    public Void VisitVariableExpressionNode(VariableExpressionNode node) {
        Variable tmpVariable = node.getVariable();
        Symbol tmpSymbol = symbolTable.currentScope().resolve(tmpVariable.getId());
        if (tmpSymbol != null)
            symbolTable.currentScope().define(tmpSymbol);
        else
            symbolTable.currentScope().define(tmpVariable);
        return null;
    }
}
