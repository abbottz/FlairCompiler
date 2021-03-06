package org.zza.parser.semanticstack.nodes;

import org.zza.parser.semanticstack.SemanticStack;
import org.zza.visitor.NodeVisitor;

public class NegativeExpressionNode extends SemanticNode {
    
    private SemanticNode content;
    
    @Override
    public void runOnSemanticStack(final SemanticStack stack) {
        content = stack.pop();
        stack.push(this);
        content.setParent(this);
    }
    
    public SemanticNode getContent() {
        return content;
    }
    
    @Override
    public String getStringRepresentation() {
        return getName() + " " + content.getStringRepresentation();
    }
    
    @Override
    public String getName() {
        return "NegativeExpression";
    }
    
    @Override
    public String accept(final NodeVisitor visitor) {
        return visitor.visit(this);
    }
}
