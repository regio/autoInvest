package model;


public class Papel {

    /*tipoRegistro*/
	public static int TIPREG_INI = 01 - 1;
	public static int TIPREG_END = 02 - 1;
    private String tipReg;

    /*dataPregao*/
	public static int DATPRE_INI = 03 - 1;
	public static int DATPRE_END = 10 - 1;        
    private String datPre;    
    
    /*codigoBDI*/
	public static int CODBDI_INI = 11 - 1;
	public static int CODBDI_END = 12 - 1;    
    private String codBDI;
    
    /*codigoNegociacao*/
	public static int CODNEG_INI = 13 - 1;
	public static int CODNEG_END = 24 - 1;    
    private String codNeg;
    
    /*tipoMercadoria*/
	public static int TPMERC_INI = 25 - 1;
	public static int TPMERC_END = 27 - 1;        
    private String tpMerc;

    /*nomeRes???*/
	public static int NOMRES_INI = 28 - 1;
	public static int NOMRES_END = 39 - 1;            
    private String nomRes;

    /*especi???*/
	public static int ESPECI_INI = 40 - 1;
	public static int ESPECI_END = 49 - 1;                
    private String especi;
    
    /*prazoTermino*/
	public static int PRAZOT_INI = 50 - 1;
	public static int PRAZOT_END = 52 - 1;    
    private String prazot;

    /*moeda Referencia*/
	public static int MODREF_INI = 53 - 1;
	public static int MODREF_END = 56 - 1;        
    private String modref;

    /*precoAbertura*/
	public static int PREABE_INI = 57 - 1;
	public static int PREABE_END = 69 - 1;            
    private String preAbe;

    /*precoMaximo*/
	public static int PREMAX_INI = 70 - 1;
	public static int PREMAX_END = 82 - 1;                
    private String preMax;

    /*precoMinimo*/
	public static int PREMIN_INI = 83 - 1;
	public static int PREMIN_END = 95 - 1;                    
    private String preMin;

    /*precoMedio*/
	public static int PREMED_INI = 96 - 1;
	public static int PREMED_END = 108 - 1;                        
    private String preMed;

    /*preUl???*/
	public static int PREULT_INI = 109 - 1;
	public static int PREULT_END = 121 - 1;    
    private String preUlt;

    /*preUl???*/
	public static int PREOFC_INI = 122 - 1;
	public static int PREOFC_END = 134 - 1;        
    private String preOfc;

    /*preUl???*/
	public static int PREOFV_INI = 135 - 1;
	public static int PREOFV_END = 147 - 1;            
    private String preOfv;
    
    /*preUl???*/
	public static int TOTNEG_INI = 148 - 1;
	public static int TOTNEG_END = 152 - 1;    
    private String totNeg;    

    /*preUl???*/
	public static int QUATOT_INI = 153 - 1;
	public static int QUATOT_END = 170 - 1;        
    private String quaTot;

    /*preUl???*/
	public static int VOLTOT_INI = 171 - 1;
	public static int VOLTOT_END = 188 - 1;        
    private String volTot;

    /*preUl???*/
	public static int PREEXE_INI = 189 - 1;
	public static int PREEXE_END = 201 - 1;            
    private String preExe;    

    /*preUl???*/
	public static int INDOPC_INI = 202 - 1;
	public static int INDOPC_END = 202 - 1;    
    private String indOpc;
    
    /*preUl???*/
	public static int DATVEN_INI = 203 - 1;
	public static int DATVEN_END = 210 - 1;    
    private String datVen;

    /*preUl???*/
	public static int FATCOT_INI = 211 - 1;
	public static int FATCOT_END = 217 - 1;        
    private String fatCot;

    /*preUl???*/
	public static int PTOEXE_INI = 218 - 1;
	public static int PTOEXE_END = 230 - 1;        
    private String ptoExe;
    
    /*preUl???*/
	public static int CODISI_INI = 231 - 1;
	public static int CODISI_END = 242 - 1;
    private String codIsi;
    
    /*preUl???*/
	public static int DISMES_INI = 243 - 1;
	public static int DISMES_END = 245 - 1;    
    private String disMes;    
    
    
    
    
    /*descricao do codigo BDI*/
    private String desBDI;
    /*indicador de caracteristica do papel*/
    private String indcar;
        
    /*descricao do tipo de mercado*/
    private String nomeRc;

    private boolean papelValido;
    
    
    /**
     * Size: N(02)
     * Initial: 01
     * Final: 02
     * 
     * @return the tipReg
     */
    public String getTipReg() {
        return tipReg;
    }
    /**
     * @param tipReg the tipReg to set
     */
    public void setTipReg(String tipReg) {
        this.tipReg = tipReg;
    }
    
    /**
     * Size: N(08)
     * Initial: 03
     * Final: 10
     * 
     * @return the datPre
     */
    public String getDatPre() {
        return datPre;
    }
    /**
     * @param datPre the datPre to set
     */
    public void setDatPre(String datPre) {
        this.datPre = datPre;
    }
    
    /**
     * Size: X(02)
     * Initial: 11
     * Final: 12
     * 
     * @return the codBDI
     */
    public String getCodBDI() {
        return codBDI;
    }
    /**
     * @param codBDI the codBDI to set
     */
    public void setCodBDI(String codBDI) {
        this.codBDI = codBDI;
    }
    
    /**
     * Size: X(12)
     * Initial: 13
     * Final: 24 
     * 
     * @return the codNeg
     */
    public String getCodNeg() {
        return codNeg;
    }
    /**
     * @param codNeg the codNeg to set
     */
    public void setCodNeg(String codNeg) {
        this.codNeg = codNeg;
    }
    
    /**
     * Size: N(03)
     * Initial: 25
     * Final: 27
     * 
     * @return the tpMerc
     */
    public String getTpMerc() {
        return tpMerc;
    }
    /**
     * @param tpMerc the tpMerc to set
     */
    public void setTpMerc(String tpMerc) {
        this.tpMerc = tpMerc;
    }
    
    /**
     * Size: X(12)
     * Initial: 28
     * Final: 39
     * 
     * @return the nomRes
     */
    public String getNomRes() {
        return nomRes;
    }
    /**
     * @param nomRes the nomRes to set
     */
    public void setNomRes(String nomRes) {
        this.nomRes = nomRes;
    }
    
    /**
     * Size: X(10)
     * Initial: 40
     * Final: 49
     * 
     * @return the especi
     */
    public String getEspeci() {
        return especi;
    }
    /**
     * @param especi the especi to set
     */
    public void setEspeci(String especi) {
        this.especi = especi;
    }
    
    /**
     * Size: X(03)
     * Initial: 50
     * Final: 52
     * 
     * @return the prazot
     */
    public String getPrazot() {
        return prazot;
    }
    /**
     * @param prazot the prazot to set
     */
    public void setPrazot(String prazot) {
        this.prazot = prazot;
    }
    
    /**
     * Size: X(04)
     * Initial: 53
     * Final 56
     * 
     * @return the modref
     */
    public String getModref() {
        return modref;
    }
    /**
     * @param modref the modref to set
     */
    public void setModref(String modref) {
        this.modref = modref;
    }
    
    /**
     * Size: (11)V99
     * Initial: 57
     * Final: 69
     * 
     * @return the preAbe
     */
    public String getPreAbe() {
        return preAbe;
    }
    /**
     * @param preAbe the preAbe to set
     */
    public void setPreAbe(String preAbe) {
        this.preAbe = preAbe;
    }
    
    /**
     * Size: (11)V99
     * Initial: 70
     * Final: 82
     * 
     * @return the preMax
     */
    public String getPreMax() {
        return preMax;
    }
    /**
     * @param preMax the preMax to set
     */
    public void setPreMax(String preMax) {
        this.preMax = preMax;
    }
    
    /**
     * Size: (11)V99
     * Initial: 83
     * Final: 95
     * 
     * @return the preMin
     */
    public String getPreMin() {
        return preMin;
    }
    /**
     * @param preMin the preMin to set
     */
    public void setPreMin(String preMin) {
        this.preMin = preMin;
    }
    
    /**
     * Size: (11)V99
     * Initial: 96
     * Final: 108
     * 
     * @return the preMed
     */
    public String getPreMed() {
        return preMed;
    }
    /**
     * @param preMed the preMed to set
     */
    public void setPreMed(String preMed) {
        this.preMed = preMed;
    }
    
    /**
     * Size: (11)V99
     * Initial: 109
     * Final: 121
     * 
     * @return the preUlt
     */
    public String getPreUlt() {
        return preUlt;
    }
    /**
     * @param preUlt the preUlt to set
     */
    public void setPreUlt(String preUlt) {
        this.preUlt = preUlt;
    }
    
    /**
     * Size: (11)V99
     * Initial: 122
     * Final: 134
     * 
     * @return the preOfc
     */
    public String getPreOfc() {
        return preOfc;
    }
    /**
     * @param preOfc the preOfc to set
     */
    public void setPreOfc(String preOfc) {
        this.preOfc = preOfc;
    }
    
    /**
     * Size: (11)V99
     * Initial: 135
     * Final: 147
     * 
     * @return the preOfv
     */
    public String getPreOfv() {
        return preOfv;
    }
    /**
     * @param preOfv the preOfv to set
     */
    public void setPreOfv(String preOfv) {
        this.preOfv = preOfv;
    }
    
    /**
     * Size: N(05)
     * Initial: 148
     * Final: 152
     * 
     * @return the totNeg
     */
    public String getTotNeg() {
        return totNeg;
    }
    /**
     * @param totNeg the totNeg to set
     */
    public void setTotNeg(String totNeg) {
        this.totNeg = totNeg;
    }
    
    /**
     * Size: N(18)
     * Initial: 153
     * Final: 170
     * 
     * @return the quaTot
     */
    public String getQuaTot() {
        return quaTot;
    }
    /**
     * @param quaTot the quaTot to set
     */
    public void setQuaTot(String quaTot) {
        this.quaTot = quaTot;
    }
    
    /**
     * Size: (16)V99
     * Initial: 171
     * Final: 188
     * 
     * @return the volTot
     */
    public String getVolTot() {
        return volTot;
    }
    /**
     * @param volTot the volTot to set
     */
    public void setVolTot(String volTot) {
        this.volTot = volTot;
    }
    
    /**
     * Size: (11)V99
     * Initial: 189
     * Final: 201
     * 
     * @return the preExe
     */
    public String getPreExe() {
        return preExe;
    }
    /**
     * @param preExe the preExe to set
     */
    public void setPreExe(String preExe) {
        this.preExe = preExe;
    }
    
    /**
     * Size: N(01)
     * Initial: 202
     * Final: 202
     * 
     * @return the indOpc
     */
    public String getIndOpc() {
        return indOpc;
    }
    /**
     * @param indOpc the indOpc to set
     */
    public void setIndOpc(String indOpc) {
        this.indOpc = indOpc;
    }
    
    /**
     * Size: N(08)
     * Initial: 203
     * Final: 210
     * 
     * @return the datVen
     */
    public String getDatVen() {
        return datVen;
    }
    /**
     * @param datVen the datVen to set
     */
    public void setDatVen(String datVen) {
        this.datVen = datVen;
    }
    
    /**
     * Size: N(07)
     * Initial: 211
     * Final: 217
     * 
     * @return the fatCot
     */
    public String getFatCot() {
        return fatCot;
    }
    /**
     * @param fatCot the fatCot to set
     */
    public void setFatCot(String fatCot) {
        this.fatCot = fatCot;
    }
    
    /**
     * Size: (07)V06
     * Initial: 218
     * Final: 230
     * 
     * @return the ptoExe
     */
    public String getPtoExe() {
        return ptoExe;
    }
    /**
     * @param ptoExe the ptoExe to set
     */
    public void setPtoExe(String ptoExe) {
        this.ptoExe = ptoExe;
    }
    
    /**
     * Size: X(12)
     * Initial: 231
     * Final: 242
     * 
     * @return the codIsi
     */
    public String getCodIsi() {
        return codIsi;
    }
    /**
     * @param codIsi the codIsi to set
     */
    public void setCodIsi(String codIsi) {
        this.codIsi = codIsi;
    }
    
    /**
     * Size: 9(03)
     * Initial: 243
     * Final: 245
     * 
     * @return the disMes
     */
    public String getDisMes() {
        return disMes;
    }
    /**
     * @param disMes the disMes to set
     */
    public void setDisMes(String disMes) {
        this.disMes = disMes;
    }
    public void setPapelValido(boolean papelValido) {
        this.papelValido = papelValido;
    }
    public boolean getPapelValido() {
        return papelValido;
    }
    public void setDesBDI(String desBDI) {
        this.desBDI = desBDI;
    }
    public String getDesBDI() {
        return desBDI;
    }
    public void setIndcar(String indcar) {
        this.indcar = indcar;
    }
    public String getIndcar() {
        return indcar;
    }
    public void setNomeRc(String nomeRc) {
        this.nomeRc = nomeRc;
    }
    public String getNomeRc() {
        return nomeRc;
    }
}
