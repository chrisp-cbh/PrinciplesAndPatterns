package tp.com.training.patterns.visitor;

import com.tp.training.patterns.visitor.VisitedCollection;
import com.tp.training.patterns.visitor.VisitedItem;
import com.tp.training.patterns.visitor.Visitor;

public class PipeVisitor extends Visitor {
	@Override
	public void visit(VisitedCollection visitedCollection) {
		setResult("|");
	}
	@Override
	public void visit(VisitedItem visitedItem) {
		setResult(getResult()+visitedItem.getValue()+"|");
	}
}
