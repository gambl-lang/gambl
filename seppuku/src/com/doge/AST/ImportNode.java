package com.doge.AST;

import com.doge.Visitors.IASTVisitor;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by Mathias on 21-03-2015.
 */
public class ImportNode extends AST {
    private ArrayList<FileReader> inputFiles = new ArrayList<FileReader>();

    public ImportNode(AST parent) {
        super(parent);
    }

    public Void addFile(String path) {
        try {
            inputFiles.add(new FileReader(path));
        } catch (FileNotFoundException e) {
            //TODO generate compile error to user
            e.printStackTrace();
        }
        return null;
    }

    public <T> T accept(IASTVisitor<? extends T> node) {
        if ( node instanceof IASTVisitor) return node.VisitImportNode(this);
        else return node.visitChildren(this);
    }

    public ArrayList<FileReader> getInputFiles() {
        return inputFiles;
    }
}