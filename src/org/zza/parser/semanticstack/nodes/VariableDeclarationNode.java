package org.zza.parser.semanticstack.nodes;

import org.zza.parser.semanticstack.SemanticStack;
import org.zza.visitor.NodeVisitor;


public class VariableDeclarationNode extends SemanticNode {

    @Override
    public void runOnSemanticStack(SemanticStack stack) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getStringRepresentation() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getName() {
        return "VariableDeclaration";
    }
    
    @Override
    public String accept(NodeVisitor visitor) {
        return visitor.visit(this);
    }
}
