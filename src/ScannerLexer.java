import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

public class ScannerLexer {
	public static void main(String[] args) throws Exception {
			//String option = null;
			String filename = "H:\\EclipseNeon\\Scanner\\input.txt"; // duong dan den file can scan
			// filename = args[1];
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String s;
			String inputs = "";
			while ((s = br.readLine()) != null) {
                inputs = inputs + s;
                inputs = inputs + '\n';
            }
			
			ANTLRInputStream input = new ANTLRInputStream(inputs);
			Scanner lexer = new Scanner(input);
			String TokenName = null;
			while(true) {
				Token token = lexer.nextToken();
				switch (token.getType()){
				 case 2: TokenName = "INTLITERAL"; break;
				 case 3: TokenName = "CHARLITERAL"; break;
				 case 4: TokenName = "STRINGLITERAL"; break;
				 case 5: TokenName = "BOOLEANLITERAL"; break;
				 case 6: TokenName = "IDENTIFIER"; break;
				}
				if(token.getType() == Scanner.EOF) {
					break;
				}
				 System.out.println(TokenName + " : " + token.getText());
				 TokenName = "";
			}
	}
}
