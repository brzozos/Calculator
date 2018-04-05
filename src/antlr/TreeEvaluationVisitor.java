package antlr;

import org.antlr.v4.runtime.tree.ParseTree;

import java.text.ParseException;

public class TreeEvaluationVisitor extends HelloBaseVisitor<Double> {
    @Override
    public Double visitNumber(HelloParser.NumberContext ctx) {
        switch(ctx.num.getType()){
            case HelloParser.DEC:
                try {
                    return Main.parseDEC(ctx.getText());
                } catch (ParseException e) {
                    throw new IllegalArgumentException();
                }
            case HelloParser.HEX:
                try {
                    return Main.parseHEX(ctx.getText());
                } catch (ParseException e) {
                    throw new IllegalArgumentException();
                }
            case HelloParser.OCT:
                try {
                    return Main.parseOCT(ctx.getText());
                } catch (ParseException e) {
                    throw new IllegalArgumentException();
                }
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public Double visitExpr(HelloParser.ExprContext ctx) {
        Function<Double, Double, Double> operand;
        if(ctx.op1==null){
            if(ctx.op2==null){
                if(ctx.getChild(0).getClass().equals(HelloParser.NumberContext.class)){
                    return visit(ctx.getChild(0));
                }else return visit(ctx.getChild(1));
            }

            switch(ctx.op2.getType()){
                case HelloParser.ADD:
                    operand = (a,b) -> a+b;
                    break;
                case HelloParser.SUB:
                    operand = (a,b) -> a-b;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            double left = visit(ctx.getChild(0));
            double right = visit(ctx.getChild(2));
            return operand.binary(left, right);
        }

        switch(ctx.op1.getType()){
            case HelloParser.MUL:
                operand = (a,b) -> a*b;
                break;
            case HelloParser.DIV:
                operand = (a,b) -> a/b;
                break;
            default:
                throw new IllegalArgumentException();
        }
        double left = visit(ctx.getChild(0));
        double right = visit(ctx.getChild(2));
        return operand.binary(left, right);
    }


}
