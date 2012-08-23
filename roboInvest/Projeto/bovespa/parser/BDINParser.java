package parser;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import model.Papel;

public class BDINParser {
    
    private String TIPO_REGISTRO_NEGOCIACAO_POR_PAPEL = "01";
    
    public BDINParser() {
        
    }
    
    public List<Papel> execute() throws BovespaParserException {
        List<Papel> listaPapeisDaBovespa = new ArrayList<Papel>();
        try {
            FileInputStream fileInputStream = new FileInputStream("./COTAHIST_A2012.TXT");
            DataInputStream dis = new DataInputStream(fileInputStream);
            BufferedReader br = new BufferedReader(new InputStreamReader(dis));

            String strLine;
            while ((strLine = br.readLine()) != null) {
                if (negociacaoPorPapel(strLine)) {
                    Papel papel = parse(strLine);
                    listaPapeisDaBovespa.add(papel);
                }
            }
        } catch (IOException exc) {
            throw new BovespaParserException(exc);
        }
        
        return listaPapeisDaBovespa;
    }

    private boolean negociacaoPorPapel(String strLine) {
        if (strLine.startsWith(TIPO_REGISTRO_NEGOCIACAO_POR_PAPEL))
            return true;
        return false;
    }

    private Papel parse(String strLine) {
        Papel papel = new Papel();
        
        try {
            // START OF THE MAGIC
            papel.setTipReg(strLine.substring(0,1));
            papel.setDatPre(strLine.substring(2,9));                        
            papel.setCodBDI(strLine.substring(10,11));
            papel.setCodNeg(strLine.substring(12,23));
            papel.setTpMerc(strLine.substring(24,26));
            papel.setNomRes(strLine.substring(27,38));
            papel.setEspeci(strLine.substring(39,48));
            papel.setPrazot(strLine.substring(49,51));
            papel.setModref(strLine.substring(52,55));

            papel.setPreAbe(strLine.substring(56,68));
            papel.setPreMax(strLine.substring(69,81));
            papel.setPreMin(strLine.substring(82,94));
            papel.setPreMed(strLine.substring(95,107));
            papel.setPreUlt(strLine.substring(108,120));

            // SINOSC - sinal da oscilação do preco do papel-mercado em relacao ao pregao anterior (145)
            // OSCILA - oscilacao do preco do papel-mercado em relacao ao pregao anterior (146-150)
            papel.setPreOfc(strLine.substring(121,133));
            papel.setPreOfv(strLine.substring(134,146));
            papel.setTotNeg(strLine.substring(147,151));
            papel.setQuaTot(strLine.substring(152,169));
            papel.setVolTot(strLine.substring(170,187));
            
            
            papel.setPreExe(strLine.substring(188,200));
            
            papel.setIndOpc(strLine.substring(201,201));
            papel.setDatVen(strLine.substring(202,209));
            papel.setFatCot(strLine.substring(210,216));

            papel.setPtoExe(strLine.substring(217,229));
            papel.setCodIsi(strLine.substring(230,241));
            papel.setDisMes(strLine.substring(242,244));
            // END OF THE MAGIC
            
            papel.setPapelValido(true);
        } catch (Exception exc) {
            papel.setPapelValido(false);
        }
        
        return papel;
    }    
    
}
