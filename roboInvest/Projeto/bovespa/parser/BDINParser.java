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
            FileInputStream fileInputStream = new FileInputStream("./res/COTAHIST_A2012.TXT");
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
            papel.setTipReg(strLine.substring(Papel.TIPREG_INI,Papel.TIPREG_END));
            papel.setDatPre(strLine.substring(Papel.DATPRE_INI,Papel.DATPRE_END));                        
            papel.setCodBDI(strLine.substring(Papel.CODBDI_INI,Papel.CODBDI_END));
            papel.setCodNeg(strLine.substring(Papel.CODNEG_INI,Papel.CODNEG_END));
            papel.setTpMerc(strLine.substring(Papel.TPMERC_INI,Papel.TPMERC_END));
            papel.setNomRes(strLine.substring(Papel.NOMRES_INI,Papel.NOMRES_END));
            papel.setEspeci(strLine.substring(Papel.ESPECI_INI,Papel.ESPECI_END));
            papel.setPrazot(strLine.substring(Papel.PRAZOT_INI,Papel.PRAZOT_END));
            papel.setModref(strLine.substring(Papel.MODREF_INI,Papel.MODREF_END));

            papel.setPreAbe(strLine.substring(Papel.PREABE_INI,Papel.PREABE_END));
            papel.setPreMax(strLine.substring(Papel.PREMAX_INI,Papel.PREMAX_END));
            papel.setPreMin(strLine.substring(Papel.PREMIN_INI,Papel.PREMIN_END));
            papel.setPreMed(strLine.substring(Papel.PREMED_INI,Papel.PREMED_END));
            papel.setPreUlt(strLine.substring(Papel.PREULT_INI,Papel.PREULT_END));

            // SINOSC - sinal da oscilação do preco do papel-mercado em relacao ao pregao anterior (145)
            // OSCILA - oscilacao do preco do papel-mercado em relacao ao pregao anterior (146-150)
            papel.setPreOfc(strLine.substring(Papel.PREOFC_INI,Papel.PREOFC_END));
            papel.setPreOfv(strLine.substring(Papel.PREOFV_INI,Papel.PREOFV_END));
            papel.setTotNeg(strLine.substring(Papel.TOTNEG_INI,Papel.TOTNEG_END));
            papel.setQuaTot(strLine.substring(Papel.QUATOT_INI,Papel.QUATOT_END));
            papel.setVolTot(strLine.substring(Papel.VOLTOT_INI,Papel.VOLTOT_END));
            
            
            papel.setPreExe(strLine.substring(Papel.PREEXE_INI,Papel.PREEXE_END));
            
            papel.setIndOpc(strLine.substring(Papel.INDOPC_INI,Papel.INDOPC_END));
            papel.setDatVen(strLine.substring(Papel.DATVEN_INI,Papel.DATVEN_END));
            papel.setFatCot(strLine.substring(Papel.FATCOT_INI,Papel.FATCOT_END));

            papel.setPtoExe(strLine.substring(Papel.PTOEXE_INI,Papel.PTOEXE_END));
            papel.setCodIsi(strLine.substring(Papel.CODISI_INI,Papel.CODISI_END));
            papel.setDisMes(strLine.substring(Papel.DISMES_INI,Papel.DISMES_END));
            // END OF THE MAGIC
            
            papel.setPapelValido(true);
        } catch (Exception exc) {
            papel.setPapelValido(false);
        }
        
        return papel;
    }    
    
}
