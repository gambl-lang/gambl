package com.doge.MiscComponents.PrettyPrinter.Visitors;

import com.doge.ContextualAnalysis.AST.*;
import com.doge.SyntaxAnalysis.Visitors.BaseASTVisitor;

import java.util.ArrayList;

/**
 * Pretty printing which prints the AST out as the code it was before MiscComponents.
 */
public class PrettyPrintVisitor extends BaseASTVisitor<String> {
    private StringBuilder printer;

    public PrettyPrintVisitor(StringBuilder printer) {
        this.printer = printer;
    }

    @Override
    public String VisitTopNode(TopNode node) {
        for (FunctionDclNode funcDcl : node.getFunctionDeclarations()){
            printer.append(visit(funcDcl) + "\n");
        }
        for (BaseASTNode stmt : node.getStatements().getChildren()){
            printer.append(visit(stmt) + "\n");
        }
        return null;
    }

    @Override
    public String VisitAssignmentNode(AssignmentNode node) {
        if (node.getVariable().isComplex() && node.getVariable().getEntrance() != null) {
            return node.getVariable().getId() + visit(node.getVariable().getEntrance()) + " " + node.getAssignmentOperator() + " " + visit(node.getExpression()) + ";";
        }
        else if(node.getVariable().isComplex()){
            return node.getVariable().getId() + " " + node.getAssignmentOperator() + " " + visit(node.getExpression()) + ";";
        }
        else {
            return node.getVariable().getId() + " " + node.getAssignmentOperator() + " " + visit(node.getExpression()) + ";";
        }
    }

    @Override
    public String VisitDeclarationNode(DeclarationNode node){
        if (node.getExpression() == null)
            return node.getVariable().getValueType() +
                    "[" +
                    visit(node.getVariable().getDynamicSize()[0]) +
                    ", " +
                    visit(node.getVariable().getDynamicSize()[1]) +
                    "] " +
                    node.getVariable().getId() +
                    ";";
        return node.getVariable().getValueType() + " " + node.getVariable().getId() + " = " + visit(node.getExpression()) + ";";
    }

    //bruges i VisitConditionalNode & VisitWhileLoopNode & VisitForLoopNode
    private String statementBody(ArrayList<BaseASTNode> statements){
        StringBuilder body = new StringBuilder();
        for(BaseASTNode stmt : statements){
            body.append(visit(stmt) + "\n");
        }
        return body.toString();
    }

    @Override
    public String VisitConditionalNode(ConditionalNode node) {
        StringBuilder cond = new StringBuilder();
        cond.append("if(" + visit(node.getConditionalExpression()) + ") {\n");
        cond.append(statementBody(node.getBody().getChildren()));
        cond.append("}");
        if (node.getElseIfs() != null && node.getElseIfs().size()> 0){
            for(ConditionalNode elif : node.getElseIfs()) {
                cond.append(" else " + visit(elif));
            }
        }
        if (node.getElseBody() != null) {
            cond.append(" else {\n" + statementBody(node.getElseBody().getChildren()) + "}\n");
        }
        return cond.toString();
    }

    @Override
    public String VisitWhileLoopNode(WhileLoopNode node) {
        //printer.append("while(" + visit(node.getCondNode()) + "){\n" + statementBody(node.getBody().getChildren()) + "}\n");
        return "while(" + visit(node.getCondNode()) + "){\n" + statementBody(node.getBody().getChildren()) + "}\n";

    }

    @Override
    public String VisitForLoopNode(ForLoopNode node) {
        StringBuilder loopNode = new StringBuilder();
        loopNode.append("for(");
        if (node.getInitialize() != null)
            loopNode.append(visit(node.getInitialize()) + " ");
        else
            loopNode.append("; ");
        if (node.getCondition() != null)
            loopNode.append(visit(node.getCondition()));
        loopNode.append("; ");
        if (node.getUpdate() != null)
            loopNode.append(visit(node.getUpdate()));
        loopNode.append(") {\n");
        loopNode.append(statementBody(node.getBody().getChildren()));
        loopNode.append("}\n");

        return loopNode.toString();
    }

    @Override
    public String VisitConditionalExpressionNode(ConditionalExpressionNode node) {
        if (node.getOperatorType() == null)
            return "( " + visit(node.getLValue()) + " )";
        return visit(node.getLValue()) + " " + node.getOperatorType() + " " + visit(node.getRValue());
    }

    @Override
    public String VisitExpressionNode(ExpressionNode node){
        if (node.getRValue() != null){
            return visit(node.getLValue()) + " " + node.getOperatorType() + " " + visit(node.getRValue());
        }
        return visit(node.getLValue()) + node.getOperatorType();
    }



    @Override
    public String VisitMatrixValNode(MatrixValNode node) {
        StringBuilder matrix = new StringBuilder();
        matrix.append("[ ");
        int i = 1;
        for (VectorValNode row : node.getRows()) {
            matrix.append(visit(row));
            if (i++ != node.getRows().size())
                matrix.append("; ");
        }
        matrix.append(" ]");
        return matrix.toString();
    }

    // Bruges i VisitVectorValNode
    private String commaSepExprList(ArrayList<ExpressionNode> items){
        StringBuilder list = new StringBuilder();
        int i = 1;
        for (ExpressionNode val : items) {
            list.append(visit(val));
            if (i++ != items.size())
                list.append(", ");
        }
        return list.toString();
    }

    @Override
    public String VisitVectorValNode(VectorValNode node) {
        if (node.getParent() instanceof MatrixValNode){ return commaSepExprList(node.getValues());}
        else { return  "[" + commaSepExprList(node.getValues()) + "]"; }
    }

    @Override
    public String VisitFunctionReturnNode(FunctionReturnNode node) {
        return "return " + visit(node.getExpression()) + ";";
    }

    // bruges i VisitFunctionCallNode & VisitVariableExpressionNode
    private String functionWithArgs(Variable func){
        StringBuilder funcVar = new StringBuilder();
        funcVar.append(func.getId() + "(");
        if (func.getArguments() != null)
            funcVar.append(commaSepExprList(func.getArguments()));
        funcVar.append(")");
        return funcVar.toString();
    }

    @Override
    public String VisitVariableExpressionNode(VariableExpressionNode node) {
        if (node.getVariable().isFunction()) {
            return functionWithArgs(node.getVariable());
        } else if (node.getVariable().isComplex() && node.getVariable().getEntrance() != null) {
            return node.getVariable().getId() + visit(node.getVariable().getEntrance());
        }
        return node.getVariable().getId();
    }


    @Override
    public String VisitConstantExpressionNode(ConstantExpressionNode node) {
        return node.getValue().toString();
    }

    @Override
    public String VisitFunctionDclNode(FunctionDclNode node) {
        Variable func = node.getVariable();
        StringBuilder funcDcl = new StringBuilder();
        funcDcl.append(func.getValueType() + " " + func.getId() + "(");

        for (int i = 0; i < node.getParameterCount(); i++) {
            funcDcl.append(node.getParameter(i).getValueType() + " " + node.getParameter(i).getId());
            if(i != node.getParameterCount()-1)
                funcDcl.append(", ");
        }

        funcDcl.append(") {\n");

        if (node.getFunctionBody() != null)
            for (BaseASTNode stmt : node.getFunctionBody().getChildren()) {
                funcDcl.append(visit(stmt) + "\n");
            }
        if (node.getFunctionReturn() != null)
            funcDcl.append("return " + visit(node.getFunctionReturn().getExpression()) + ";\n");

        funcDcl.append("}\n");
        return funcDcl.toString();

    }

    @Override
    public String VisitFunctionCallNode(FunctionCallNode node) {
        StringBuilder funcCall = new StringBuilder();
        StringBuilder args = new StringBuilder();

        if (node.getVariable().getId() == "print") {
            if (!node.getVariable().getPrintArguments().isEmpty()){
                for (int i = 0; i < node.getVariable().getPrintArguments().size(); i++) {
                    Object arg = node.getVariable().getPrintArguments().get(i);
                    if (arg != null && arg.getClass() != null)
                        if (arg.getClass().getSuperclass() == ExpressionNode.class) {
                            args.append(visit( (ExpressionNode) arg));
                        } else {
                            args.append(arg);
                        }
                        if (!(i == (node.getVariable().getPrintArguments().size()-1))){
                            args.append(", ");
                        }


                }
            }
        } else {
            if (!node.getVariable().getArguments().isEmpty()) {
                for (int i = 0; i < node.getVariable().getArguments().size(); i++) {
                    Object arg = node.getVariable().getArguments().get(i);
                        if (arg.getClass().getSuperclass() == ExpressionNode.class) {
                            args.append(visit((ExpressionNode) arg));
                        } else {
                            args.append(arg);
                        }
                    if (!(i == (node.getVariable().getArguments().size() - 1))) {
                        args.append(", ");
                    }
                }
            }
        }
        funcCall.append(node.getVariable().getId() + "(" + args.toString() + ");");
        return funcCall.toString();
    }
    @Override
    public String VisitCollectionCoordinateNode(CollectionCoordinateNode node) {
        StringBuilder coordinates = new StringBuilder();
        coordinates.append("[" + visit(node.getCoordinates()[0]) + "," + visit(node.getCoordinates()[1]) + "]");
        return coordinates.toString();
    }

}





