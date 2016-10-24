import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

public class ScannerLexer {
	public static void main(String[] args) throws Exception {
			//String option = args[0];
			String filename = "H:\\EclipseNeon\\Scanner\\input.txt"; // duong dan den file input mac dinh
			//filename = args[1]; // neu xai tham so ham main
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String s;
			String inputs = "";
			String outputs = "";
			int i = 1;
			while ((s = br.readLine()) != null) {
                inputs = inputs + s;
                inputs = inputs + '\n';
            }
			try {
				ANTLRInputStream input = new ANTLRInputStream(inputs);
				Scanner lexer = new Scanner(input);
				String TokenName;
				while(true) {
					TokenName = "";
					Token token = lexer.nextToken();
					switch (token.getType()){
					 case 2: TokenName = "INTLITERAL: "; break;
					 case 3: TokenName = "CHARLITERAL: "; break;
					 case 4: TokenName = "STRINGLITERAL: "; break;
					 case 5: TokenName = "BOOLEANLITERAL: "; break;
					 case 7: TokenName = "IDENTIFIER: "; break;
					}
					if(token.getType() == Scanner.EOF) {
						break;
					}
					outputs = outputs + i + ' ' + TokenName + token.getText() + '\n';
					i++;
				}
			}
			catch(Exception ex) {
				outputs = outputs + ex;
			}
			finally{
				FileWriter fw = new FileWriter(filename+".out");
				System.out.println(outputs);
				fw.write(outputs);
				fw.close();
			}
	}
}
