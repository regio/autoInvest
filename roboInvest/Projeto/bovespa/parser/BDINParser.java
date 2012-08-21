package bovespa.parser;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import bovespa.model.Papel;

public class BDINParser {
    
    private String TIPO_REGISTRO_NEGOCIACAO_POR_PAPEL = "02";
    
    public BDINParser() {
        
    }
    
    public List<Papel> execute() throws BovespaParserException {
        List<Papel> listaPapeisDaBovespa = new ArrayList<Papel>();
        try {
            FileInputStream fileInputStream = new FileInputStream("./BDIN");
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
            papel.setCodBDI(strLine.substring(2,3));
            papel.setDesBDI(strLine.substring(4,33));
            papel.setNomRes(strLine.substring(34,45));
            papel.setEspeci(strLine.substring(46,55));
            papel.setIndcar(strLine.substring(56,56));
            papel.setCodNeg(strLine.substring(57,68));
            papel.setTpMerc(strLine.substring(69,71));
            papel.setNomeRc(strLine.substring(72,86));
            papel.setPrazot(strLine.substring(87,89));
            papel.setPreAbe(strLine.substring(90,100));
            papel.setPreMax(strLine.substring(101,111));
            papel.setPreMin(strLine.substring(101,111));
            papel.setPreMed(strLine.substring(123,133));
            papel.setPreUlt(strLine.substring(134,144));
            // SINOSC - sinal da oscilação do preco do papel-mercado em relacao ao pregao anterior (145)
            // OSCILA - oscilacao do preco do papel-mercado em relacao ao pregao anterior (146-150)
            papel.setPreOfc(strLine.substring(151,161));
            papel.setPreOfv(strLine.substring(162,172));
            papel.setTotNeg(strLine.substring(173,177));
            papel.setQuaTot(strLine.substring(178,192));
            papel.setVolTot(strLine.substring(193,209));
            papel.setPreExe(strLine.substring(210,220));
            // datas no formato AAAMMDD
            papel.setDatVen(strLine.substring(221,228));
            // INDOPC
            // NOMIND
            papel.setFatCot(strLine.substring(245,251));
            papel.setPtoExe(strLine.substring(252,264));
            papel.setCodIsi(strLine.substring(265,276));
            papel.setDisMes(strLine.substring(277,279));
            // ESTILO
            // NOMEST
            // ICOATV
            // OSCPRE
            // RESERVA
            
            // END OF THE MAGIC
            
            papel.setPapelValido(true);
        } catch (Exception exc) {
            papel.setPapelValido(false);
        }
        
        return papel;
    }
}
