import org.antlr.v4.runtime.*;
import java.util.Scanner;

//import FieldParser.IntDefinitionContext;
//import FieldParser.VetorDefinitionContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author alex.collins
 */
public class GameFactory {

    public void computeLang(InputStream in) throws IOException {
        FieldLexer l = new FieldLexer(new ANTLRInputStream(in));
        FieldParser p = new FieldParser(new CommonTokenStream(l));
        p.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                    int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
            }
        });

        p.addParseListener(new FieldBaseListener() {
            @Override
            public void exitQuadribol_match(FieldParser.Quadribol_matchContext ctx) {
                float i = Float.parseFloat(ctx.value.getText());
                System.out.println("Bem vindo a "+i +" Edição de Quadribol em Hogwarts");
            }
            @Override
            public void exitQuadribol_players(FieldParser.Quadribol_playersContext ctx){
                int value = Integer.parseInt(ctx.quant.getText());
                int[] quantplayers = new int[value];
                System.out.println("Cada time possui "+value+" jogadores");
                System.out.println("É claro que entre eles é harry potter se não Dumbledore cancela a partida");

            }
            @Override
            public void exitAddpoint_match(FieldParser.Addpoint_matchContext ctx){
                float pointadd = Float.parseFloat(ctx.value1.getText());
                float pointpresent = Float.parseFloat(ctx.value2.getText());
                float pointresult = pointadd + pointpresent;
                System.out.println("O time ficou com "+pointresult +" após ter feito o arremeço");
            }

            @Override
            public void exitLosepoint_match(FieldParser.Losepoint_matchContext ctx){
                float pointlose = Float.parseFloat(ctx.value1.getText());
                float pointpresent= Float.parseFloat(ctx.value2.getText());
                float pointresult = pointpresent - pointlose;
                System.out.println("O time ficou com " +pointresult +" por ter efetuado faltas");
            }
            
            @Override
            public void exitMultpoint_match(FieldParser.Multpoint_matchContext ctx){
                float pointmult = Float.parseFloat(ctx.value1.getText());
                float pointpresent= Float.parseFloat(ctx.value2.getText());
                float pointresult = pointpresent * pointmult;
                System.out.println("O time ficou com " +pointresult +" graças a dumbledore");
            }
            @Override
            public void exitDivpoint_match(FieldParser.Divpoint_matchContext ctx){
                float pointmult = Float.parseFloat(ctx.value1.getText());
                float pointpresent= Float.parseFloat(ctx.value2.getText());
                float pointresult = pointpresent / pointmult;
                System.out.println("O time ficou com " +pointresult +" graças a dumbledore");
            }
            @Override
            public void exitEnd_match(FieldParser.End_matchContext ctx){
                System.out.println("__________________________Grifinória Ganhou__________________________");
            }

        });
        
        
        p.field();

    }

}