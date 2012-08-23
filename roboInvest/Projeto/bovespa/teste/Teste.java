package teste;

import java.awt.List;
import java.util.ArrayList;

import model.Papel;

import parser.BDINParser;
import parser.BovespaParserException;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BDINParser bp = new BDINParser();
		try {
			ArrayList<Papel> lista= (ArrayList<Papel>) bp.execute();
			
			for(Papel p : lista){
				System.out.println(p.getCodNeg()+ " - "+p.getPreMed());
			}
			
		} catch (BovespaParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
