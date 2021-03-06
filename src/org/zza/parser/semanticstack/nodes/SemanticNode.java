package org.zza.parser.semanticstack.nodes;

import org.zza.parser.semanticstack.SemanticStack;
import org.zza.scanner.CompilerToken;
import org.zza.visitor.NodeVisitor;

public abstract class SemanticNode {
    
    protected SemanticNode parent;
    protected CompilerToken token;
    
    public abstract void runOnSemanticStack(SemanticStack stack);
    
    public abstract String getStringRepresentation();
    
    public abstract String getName();
    
    public abstract String accept(NodeVisitor visitor);
    
    public SemanticNode() {
    }
    
    public void setToken(final CompilerToken token) {
        this.token = token;
    }
    
    public void setParent(final SemanticNode parent) {
        this.parent = parent;
    }
    
    public boolean isMarker() {
        return false;
    }
}
