package visitor.figure;

public class Visitor2 extends Visitor {
	
    private int ElementA;
    
    private int ElementB;
    
    @Override
    public void visitElementA(ElementA e) {
    	ElementA++;
    }

    @Override
    public void visitElementB(ElementB e) {
    	ElementB++;
    }
    
    public int getAs() {
        return ElementA;
    }
    
    public int getBs() {
        return ElementB;
    }
}
